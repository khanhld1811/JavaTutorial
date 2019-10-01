package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien;

public class NoBreak {
    public static void main(String[] args) {
        int i;
        for(i = 0; i <= 5; i++){
            switch (i){
                case 0:
                    System.out.println("i nhỏ hơn một");
                case 1:
                    System.out.println("i nhở hơn 2");
                case 2:
                    System.out.println("i nhỏ hơn 3");
                case 3:
                    System.out.println("i nhỏ hơn 4");
                case 4:
                    System.out.println("i nhỏ hơn 5");
            }
            System.out.println();
        }
    }
}

class NoBreak2{
    public static void main(String[] args) {
        int i;
        for(i = 0; i <= 5; i++){
            switch (i){
                case 1:
                case 2:
                case 3:
                    System.out.println("i bằng 1,2 hoặc 3");
                    break;
                case 4:
                    System.out.println("i bằng 4");
                    break;
            }
        }
    }
}
