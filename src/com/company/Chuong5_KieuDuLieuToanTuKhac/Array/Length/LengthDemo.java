package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.Length;

public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = {1,2,3};

        int table[][] = {//mang table co do dai bien doi
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        System.out.println("do dai cua mang list la:" + list.length);

        System.out.println("Do dai cua mang nums la: " + nums.length);

        System.out.println("Do dai cua mang table la: " + table.length);

        System.out.println("do dai cua table[0] la " + table[0].length);

        System.out.println("do dai cua table[1] la " + table[1].length);

        System.out.println("do dai cua table[2] la " + table[2].length);

        System.out.println();

        // su dung thanh vien length de khoi tao mang list
        for(int i = 0; i < list.length;i++)
            list[i] = i * i;

        System.out.println("Day la mang list: " );

        // bay gio, su dung thanh vien length
        // de hien thimang list

        for(int i = 0; i < list.length; i++)
            System.out.println(list[i] + " ");
        System.out.println();
    }
}
