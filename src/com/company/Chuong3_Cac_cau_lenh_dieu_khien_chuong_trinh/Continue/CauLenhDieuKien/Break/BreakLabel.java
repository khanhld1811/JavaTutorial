package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.Break;

public class BreakLabel {
    public static void main(String[] args) {
        int x,y;
        stop1:
        for ( x= 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x và y: " + x + " " + y);
            }
        }
        System.out.println();

        //  đặt nhãn ngay phía trước dấu {
        for(x = 0; x < 5;x++)
        stop2:{
            for(y = 0; y < 5;y++){
                if(y == 2) break stop2;
                System.out.println("x và y: " + x + " " + y);
            }
        }
    }
}
