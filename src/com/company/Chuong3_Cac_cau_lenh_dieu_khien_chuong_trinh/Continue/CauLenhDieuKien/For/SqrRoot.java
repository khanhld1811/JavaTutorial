package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.For;

public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Căn bậc hai của " + num + " là " + sroot);

            // tính toán sai số làm tròn
            rerr = num - (sroot * sroot);
            System.out.println("Sai số làm tròn là " + rerr);
            System.out.println();
        }
    }
}
