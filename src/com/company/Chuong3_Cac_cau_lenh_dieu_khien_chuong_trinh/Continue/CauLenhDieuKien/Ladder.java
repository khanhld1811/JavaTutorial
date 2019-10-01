package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien;

public class Ladder {
    public static void main(String[] args) {
        int x;

        for(x = 0; x < 6; x++){
            if(x == 1)
                System.out.println("x bằng một");
            else if(x == 2)
                System.out.println("x bằng hai");
            else if(x == 3)
                System.out.println("x bằng ba");
            else if(x == 4)
                System.out.println("x bằng bốn");
            else
                System.out.println("x không thuộc khoảng 1 đến 4");
        }
    }
}
