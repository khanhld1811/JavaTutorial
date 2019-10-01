package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.MangMotChieu;

public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[5];
        int i = 0;

        inValues(i,sample);
    }

    public static void inValues(int i, int sample[]){
        for(i = 0; i < 5; i++){
            sample[i] = i;
        }

        for(i = 0; i < 5; i++){
            System.out.println("Day la phan tu sample[" + i + "]:" + sample[i]);
        }
    }
}
