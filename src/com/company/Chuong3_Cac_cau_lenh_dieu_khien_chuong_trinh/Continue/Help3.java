package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue;

import java.io.IOException;

// Hệ thống trợ giúp câu lệnh java hoàn chỉnh, hệ thống này xử lý nhiều yêu cầu
public class Help3 {
    public static void main(String[] args) throws IOException {
        char choise, ignore;

        for (; ; ) {
            do {
                System.out.println("Trợ giúp về lệnh:");
                System.out.println(" 1.if");
                System.out.println(" 2.switch");
                System.out.println(" 3. for");
                System.out.println(" 4. while");
                System.out.println(" 5. do-while");
                System.out.println(" 6. break");
                System.out.println(" 7. continue\n");
                System.out.println("Chọn một lệnh ( ấn q để thoát ): ");

                choise = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choise < '1' | choise > '7' & choise != 'q');

            if (choise == 'q') break;
            System.out.println("\n");

            switch (choise) {
                case '1':
                    System.out.println("Lệnh if: \n");
                    System.out.println("switch(biểu-thức) {");
                    System.out.println("    case hằng: ");
                    System.out.println("    chuỗi câu lệnh");
                    System.out.println("    break;");
                    System.out.println(" // ...");
                    System.out.println("}");
                    break;
                case '2':
                    System.out.println("Lệnh switch:\n");
                    System.out.println("switch(biểu-thức) {");
                    System.out.println("    case hằng:");
                    System.out.println("    chuỗi câu lệnh");
                    System.out.println("    break;");
                    System.out.println("    //  ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Lệnh for:\n");
                    System.out.println("for(giá-trị-khởi-đầu;điều-kiện;bước-lặp) ");
                    System.out.println("    câu-lệnh");
                    break;
                case '4':
                    System.out.println("Lệnh while:\n");
                    System.out.println("while(điều-kiện) câu-lệnh");
                    break;
                case '5':
                    System.out.println("Lệnh do-while:\n");
                    System.out.println("do{");
                    System.out.println("    câu-lệnh");
                    System.out.println("} while(điều-kiện);");
                    break;
                case '6':
                    System.out.println("Lệnh break:\n");
                    System.out.println("brea; hoặc nhãn break nhãn;");
                    break;
                case '7':
                    System.out.println("Lệnh continue");
                    System.out.println("continue; hoặc continue nhãn;");
                    break;
            }
            System.out.println();
        }

    }
}
