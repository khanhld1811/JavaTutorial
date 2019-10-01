package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue;

public class ContDemo {
    public static void main(String[] args) {
        int i;
        for(i = 0; i <= 100; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println("So chan tu 0 den 100: " + i);
        }
    }
}
