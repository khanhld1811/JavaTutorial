package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.Break;

public class BreakErr {
    public static void main(String[] args) {

        one:for(int i = 0; i < 3; i++){
            System.out.println("lan lap " + i + ": ");
        }

        for(int j = 0; j < 100; j++){
            if(j == 100) //break one;  u//SAI
            System.out.println(j + " ");
        }
    }
}
