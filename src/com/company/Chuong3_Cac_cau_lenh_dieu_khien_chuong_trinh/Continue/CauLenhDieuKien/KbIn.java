package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien;

import java.io.IOException;

// Đọc một ký tự từ bàn phím.
public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;

        System.out.println("Nhập một ký tự từ bàn phím, sau đó nhấn ENTER: ");

        ch = (char) System.in.read();

        System.out.println("Phím bạn vừa nhập là: " + ch);
    }
}
