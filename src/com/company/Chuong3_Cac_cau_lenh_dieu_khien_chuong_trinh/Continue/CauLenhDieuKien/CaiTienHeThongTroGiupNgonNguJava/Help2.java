package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.CaiTienHeThongTroGiupNgonNguJava;

import java.io.IOException;

public class Help2 {
    public static void main(String[] args) throws IOException {

        char choise = 0, ignore = 0;
        Logic(choise,ignore);



    }

    private static void Logic(char choise,char ignore) throws IOException{
        do {
            System.out.println("Trợ giúp về lệnh:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.println(" 6. Thoát ứng dụng");

            choise = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (choise < '1' | choise > '6');

        Choise(choise);
    }

    private static void Choise(char choise) {
        switch (choise) {
            case '1':
                System.out.println("Lệnh if: \n");
                System.out.println("if(điều-kiện) câu-lệnh");
                System.out.println("else câu-lênh");
                break;
            case '2':
                System.out.println("Lệnh switch:\n");
                System.out.println("switch(biểu-thức) {");
                System.out.println("    case hằng:");
                System.out.println("    chuỗi câu lệnh");
                System.out.println("    break;");
                System.out.println("    //  ...");
                System.out.println("}");
            case '3':
                System.out.println("Lệnh for: \n");
                System.out.print("for(giá-trị-khởi-tạo;điều-kiện;bước-lặp)");
                System.out.println("    câu lệnh");
                break;
            case '4':
                System.out.println("Lệnh while:\n");
                System.out.println("while(điều-kiện) câu-lệnh");
                break;
            case '5':
                System.out.println("Lệnh do-while:\n");
                System.out.println("do {");
                System.out.println(" câu-lệnh");
                System.out.println("} while (điều-kiện);");
                break;
            case '6':
                System.exit(0);
                break;

        }
    }
}
