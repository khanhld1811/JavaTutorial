package com.company.RunnableInterface;

public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        int idx = 1;
        for(int i = 0;i < 5;i++){
            System.out.println("Hello from RunnableDemo" + idx++);
            try {
                Thread.sleep(2000);
            }
            catch (Exception e){

            }
        }
    }
}
