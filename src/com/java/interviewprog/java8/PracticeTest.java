package com.java.interviewprog.java8;

import java.util.concurrent.*;

public class PracticeTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        MyCallable[] callables = new MyCallable[]{new MyCallable(1), new MyCallable(10)};

        ExecutorService service = Executors.newFixedThreadPool(1);

        for (MyCallable myCallable : callables) {
            Future submit = service.submit(myCallable);
            System.out.println(submit.get());
        }


        CompletableFuture<String> whatsYourNameFuture = CompletableFuture.supplyAsync(() -> "amit").thenApply((name) -> {
            return "hello " + name;
        });

        CompletableFuture<String> stringCompletableFuture = whatsYourNameFuture.thenApply((name) -> "hello " + name);

        System.out.println(whatsYourNameFuture.get());


        service.shutdown();
    }

}


class MyCallable implements Callable {

    int i;

    public MyCallable(int i) {
        this.i = i;
    }

    @Override
    public Object call() throws Exception {
        return i + 10;
    }
}















