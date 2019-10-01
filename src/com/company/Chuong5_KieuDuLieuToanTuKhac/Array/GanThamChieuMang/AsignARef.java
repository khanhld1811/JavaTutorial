package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.GanThamChieuMang;

public class AsignARef {
    public static void main(String[] args) {
        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for(i = 0; i < 10; i++)
            nums1[i] = i;

        for(i = 0; i < 10; i++)
            nums2[i] = -i;

        System.out.println("Day la mang nums1: ");
        for(i = 0; i < 10; i++)
            System.out.println(nums1[i] + " ");
        System.out.println();

        System.out.println("Day la mang nums2: ");
        for(i = 0;i < 10;i++)
            System.out.println(nums2[i] + " ");
        System.out.println();

        nums2 = nums1; // bay giio, nums2 tro toi mang nums1

        System.out.println("Day la mang nums2 sau phep gan: ");
        for(i = 0; i < 10; i++)
            System.out.println(nums2[i] + " ");
        System.out.println();

        //bay gio, thao tac voi mang nums1 thong qua mang nums2
        nums2[3] = 99;

        System.out.println("Day la mang nums1 sau khi thay doi qua mang nums2");
        for(i = 0; i < 10; i++)
            System.out.println(nums1[i] + " ");
        System.out.println();
    }
}
