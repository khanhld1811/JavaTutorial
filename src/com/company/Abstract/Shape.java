package com.company.Abstract;

// lớp tru tuong shape
public abstract class Shape {
    abstract void draw();
}
// Trình triển khai được cung cấp bởi ai đó,
// ví dụ: người sử dụng cuối cùng nào đó.

class Rectangle extends Shape{
    void draw(){
        System.out.println("Ve hinh chu nhat");
    }
}

class Circle1 extends Shape{
    void draw(){
        System.out.println("Ve hinh tron");
    }
}

// Trong tinh huong nay, phuong thuc duoc goi boi lap trinh vien hoac nguoi su dung

class TestAbstraction1{
    public static void main(String[] args) {
        // Trong tinh huong nay, doi tuong duoc cung cap thong qua phuong thuc,
        // chang han nhu getShape()
        Shape s = new Circle1();
        s.draw();
    }
}


