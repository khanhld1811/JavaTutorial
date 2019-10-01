package com.company.Thread;

public class HelloMain {
    public static void main(String[] args) throws InterruptedException {

        int idx = 1;

        for(int i  = 0; i < 3; i++){
            System.out.println("Main thread running" + idx++);

            // Sleep 2000 milisecond
            Thread.sleep(1000);
        }

        HelloThread helloThread = new HelloThread();

        helloThread.start();

        for(int i = 0; i < 3; i++){
            System.out.println("Main thread running" + idx++);

            Thread.sleep(1000);
        }
        System.out.println("=====>Main thread stopped");
    }
}

class MyThread implements Runnable{
    String thrdName;
    MyThread (String name){
        thrdName = name;
    }
    @Override
    public void run() {
        System.out.println(thrdName + "bat dau chay");
        try{
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println(thrdName + ", dang dem den " + count);
            }
        }
        catch (InterruptedException e){
            System.out.println(thrdName + " bi ngat");
        }
        System.out.println(thrdName + "ket thuc");
    }
}

class UseThreads{
    public static void main(String[] args) {
        System.out.println("Luong chinh bat dau chay");

        //Khởi tạo một đối tượng MyThread .
        MyThread mt = new MyThread("Luồng con # 1");

        // Tiếp theo, khởi tạo một luồng từ đối tượng trên.
        Thread newThrd = new Thread(mt);


        // Cuối cùng khởi chạy đối tượng.
        newThrd.start();

        for(int i = 0; i < 50;i++){
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println("Luồng chính đã bị ngắt .");
            }
        }
        System.out.println("Luồng chính kết thúc");
    }
}