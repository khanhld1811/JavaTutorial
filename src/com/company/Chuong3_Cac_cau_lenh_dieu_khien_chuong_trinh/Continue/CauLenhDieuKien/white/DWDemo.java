package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.white;

import java.io.IOException;

public class DWDemo {
    public static void main(String[] args) throws IOException {

        char ch;

        do{
            System.out.println("Ấn một phím bất kỳ sau đó nhấn ENTER:");
            ch = (char) System.in.read();// doc 1 ky tu

        }while (ch != 'q');
    }
}
