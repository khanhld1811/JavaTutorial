package com.company.Thread;

public class HelloThread extends  Thread{

    @Override
    public void run() {
        int index = 1;

        for(int i = 0;i<10;i++){
            System.out.println("Hello Thread running" + index++);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
        System.out.println(" - =====> Hello Thread stopped");
    }
}

class A{
    public void hienThi() {
        int a = 0;

        System.out.println("Đây là phương thức hiển thị của lớp cha Superclass."+a);
    }
}


