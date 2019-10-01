package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.For;

public class Empty {
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 10;){
            System.out.println("Lan lap #" + i);
            i++;// tang gia tri cho bien dieu khien vong lapg
        }
    }
}

class Emptry2{
    public static void main(String[] args) {
        int j;

        for(j = 10; j > 0;){
            System.out.println("Lan lap #" + j);
            j--;
        }
    }
}

class Emptry3{
    public static void main(String[] args) {
        int a = 0;

        for(;a < 10;){
            System.out.println("Lan lap #" + a);
            a++;
        }
    }
}

class Emptry4{
    public static void main(String[] args) {
        int i;
        int sum = 0;

        // tính tổng các số từ 1 đến 5
        for(i = 1; i <= 5;sum += i++);
        System.out.println("Tong bang " + sum);
    }
}
