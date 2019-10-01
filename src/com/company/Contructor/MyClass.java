package com.company.Contructor;

public class MyClass {
    int x;

    MyClass() {
        x = 10;
    }

    String ten;
    int soLuong;

    MyClass(String name, int soLuong) {
        ten = name;
        this.soLuong = soLuong;

    }

}

class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass("Khanh", 15);
        MyClass t2 = new MyClass("Tam", 25);

        System.out.println(t1.ten + " " + t1.soLuong);
        System.out.println(t2.ten + " " + t2.soLuong);
    }
}
