package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.For;

import java.io.IOException;

public class ForTest {
    public static void main(String[] args) throws IOException {
        int i;

        for(i  = 0; System.in.read() != 'S';i++){
            System.out.println("Lần lặp #" + i);
        }
    }
}
