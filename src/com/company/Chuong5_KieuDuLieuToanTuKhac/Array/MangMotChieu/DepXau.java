package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.MangMotChieu;

public class DepXau {
    public static void main(String[] args) {
        int conGai[] = {24, 27, 18, 19, 20, 17, 70, 35, 55, 102};

        int xau = 50,dep = 18;

        timGaiDepXau(conGai,xau,dep);
    }

    private static void timGaiDepXau(int conGai[], int xau, int dep) {
        for(int i = 0; i <= 10;i++){
            if(conGai[i] < dep) dep = conGai[i];
            if(conGai[i] > xau) xau = conGai[i];
        }

        System.out.println("Con gai dep va xau la: " + dep + " , " + xau);
    }
}
