package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.For;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        //tính giai thừa của các số từ 1 đến 5

        for (int i = 1; i <= 5; i++) {
            sum += i;// i duoc biet den trong toan bo vong for
            fact *= i;
        }
        // nhung i khong duoc biet den o day
        System.out.println("Tong bang" + sum);
        System.out.println("giai thua bang " + fact);
    }
}
