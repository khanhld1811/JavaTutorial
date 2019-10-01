package com.company.Chuong4.Class;

public class VehicleDemo2 {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        // gán tham chiếu car1 cho car2 ( cả 2 cùng trỏ tới một object)
        Vehicle car2 = car1;

        car1.mpg = 30;

        System.out.println("car1: " + car1.mpg);
        System.out.println("car2: " + car2.mpg);


    }
}
