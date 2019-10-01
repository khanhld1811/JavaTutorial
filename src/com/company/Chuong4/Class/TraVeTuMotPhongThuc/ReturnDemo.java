package com.company.Chuong4.Class.TraVeTuMotPhongThuc;

public class ReturnDemo {
    public static void main(String[] args) {

        myMeth();
    }

    static void myMeth() {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) return;
            System.out.println(i);
        }
    }

    static void showMenu() {
        System.out.println("Trợ giúp về lệnh:");
        System.out.println(" 1.if");
        System.out.println(" 2.switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.println("Chọn một lệnh ( ấn q để thoát ): ");
    }

    boolean isvalid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q')
            return false;
        else return true;
    }

    static void helpon(int what) {
        switch (what) {
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