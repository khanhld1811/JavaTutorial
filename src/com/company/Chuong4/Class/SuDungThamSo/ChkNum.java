package com.company.Chuong4.Class.SuDungThamSo;

// một ví dụ đơn giản trả về một tham số
public class ChkNum {
    // trả về true nếu x là số chẵn
    boolean isEven(int x) {
        if ((x % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if (e.isEven(10))
            System.out.println(" 10 la so chan. ");
        if (e.isEven(9))
            System.out.println("9 la so chan.");
        if (e.isEven(8))
            System.out.println("8 la so chan.");
    }
}

class Factor {
    boolean isFactor(int a, int b) {

        if ((b % a) == 0)
            return true;
        else return false;
    }
}

class IsFact{
    public static void main(String[] args) {
        Factor x = new Factor();

        if(x.isFactor(2, 20))
            System.out.println("2 la uoc so");
        if(x.isFactor(3,20))
            System.out.println("dong nay khong duoc hien thi");
    }
}