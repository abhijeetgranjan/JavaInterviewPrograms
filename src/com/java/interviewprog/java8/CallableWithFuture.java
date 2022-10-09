package com.java.interviewprog.java8;

import java.util.concurrent.*;

public class CallableWithFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {


        ExecutorService service = Executors.newSingleThreadExecutor();
        Future submit = service.submit(new MyCallables());

        if (submit.isDone()) {
            System.out.println(submit.get());
        } else {
            System.out.println("not done");
        }

        System.out.println(submit.get(10, TimeUnit.MILLISECONDS));

        service.shutdown();
    }
}


class MyCallables implements Callable {

    @Override
    public Object call() throws Exception {
        return 10;
    }
}
