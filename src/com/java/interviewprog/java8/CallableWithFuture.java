package com.java.interviewprog.java8;

import java.util.concurrent.*;

public class CallableWithFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {


       /* ExecutorService service = Executors.newSingleThreadExecutor();
        Future submit = service.submit(new MyCallables());

        if (submit.isDone()) {
            System.out.println(submit.get());
        } else {
            System.out.println("not done");
        }

        System.out.println(submit.get(10, TimeUnit.MILLISECONDS));

        service.shutdown();*/

        FutureTask f = new FutureTask<>(new MyCallables());
        Thread t = new Thread(f);
        t.start();
        System.out.println(f.get());




    }
}


class MyCallables implements Callable {

    @Override
    public Object call() throws Exception {
        return 10;
    }
}
