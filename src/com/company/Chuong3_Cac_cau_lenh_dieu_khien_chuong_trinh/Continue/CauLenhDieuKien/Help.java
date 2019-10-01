package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        char choose;

        System.out.println("Trợ giúp về lệnh");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Chọn một lệnh");
        choose = (char) System.in.read();

        System.out.println("\n");

        switch (choose){
            case '1':
                System.out.println("Lệnh if:\n");
                System.out.println("if(điều-kiện) câu-lệnh;");
                System.out.println("else câu lệnh");
                break;
            case '2':
                System.out.println("Leengj switch:\n");
                System.out.println("switch(biểu-thức) {");
                System.out.println("    case hằng:");
                System.out.println("    chuỗi câu lệnh");
                System.out.println("    break;");
                System.out.println("  //   ...");
                System.out.println("}");
                break;
                default:
                    System.out.println("Không tìm thấy câu lệnh bạn chọn");
        }
    }
}
