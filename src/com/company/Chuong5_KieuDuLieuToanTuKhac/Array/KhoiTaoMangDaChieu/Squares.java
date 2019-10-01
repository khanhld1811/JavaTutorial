package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.KhoiTaoMangDaChieu;

public class Squares {
    public static void main(String[] args) {
        int sqrs[][] = {
                {1,1},
                {2, 4},
                {3, 8},
                {4, 12},
                {5, 16}, /* 10 gia tri nay la i*/
                {6, 19},/* mỗi cặp {} có 2 gia tri nay la j -> sqrs[10][2]*/
                {7, 29},
                {8, 35},
                {9, 50},
                {10, 100},
        };

        int i , j;
        for(i = 0; i < 10; i++){
            for(j = 0; j < 2;j++)
                System.out.println(sqrs[i][j] + " ");
            System.out.println();
        }
    }
}
