package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.Length;
// Sử dụng biến length để sao chép một mảng.
public class ACopy {
    public static void main(String[] args) {
        int i;
        int nums1[] = new int [10];
        int nums2[] = new int [10];

        for(i = 0; i < nums1.length; i++)
            nums1[i] = i;

            // sao chep mang nums1 toi nums2
            if(nums2.length >= nums1.length)
            for(i = 0; i < nums1.length; i++)
                nums2[i] = nums1[i];

            for(i = 0; i < nums2.length;i++)
                System.out.println(nums2[i] + " ");

    }
}
