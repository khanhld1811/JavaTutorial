package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien;

public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 10; i++){
            switch (i){
                case 0:
                    System.out.println("i bằng 0");
                    break;
                case 1:
                    System.out.println("i bằng 1");
                    break;
                case 2:
                    System.out.println("i bằng 2");
                    break;
                case 3:
                    System.out.println("i bằng 3");
                    break;
                case 4:
                    System.out.println("i bằng 4");
                    break;
                    default:
                        System.out.println("i lớn hơn hoặc bằng 5");
            }
        }
    }
}
