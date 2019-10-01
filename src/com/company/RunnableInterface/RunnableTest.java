package com.company.RunnableInterface;

public class RunnableTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread running...");

        // Tạo một thread từ Runnable.
        Thread thread = new Thread(new RunnableDemo());

        thread.start();

        Thread.sleep(5000);
        System.out.println("Main thread stopped");
    }
}
