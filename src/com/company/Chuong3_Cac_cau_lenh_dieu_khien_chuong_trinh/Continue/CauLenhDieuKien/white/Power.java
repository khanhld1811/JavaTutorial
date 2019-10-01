package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.white;

public class Power {
    public static void main(String[] args) {
        int e;
        int result;

        for(int i = 0; i < 10; i++){
            result = 1;
            e = i;
            while(e > 0){
                result *= 2;
                e--;
            }
            System.out.println("2 mu " + i + " bang" +result);
        }
    }
}
