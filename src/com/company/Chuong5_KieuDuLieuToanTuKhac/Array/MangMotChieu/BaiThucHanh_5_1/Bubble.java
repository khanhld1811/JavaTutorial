package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.MangMotChieu.BaiThucHanh_5_1;

/* Sử dụng thuật toán Bubble sort (Sắp xếp nổi bọt)
 * */
public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, 27, 567, 19, -15, 33, 89};

        int a, b, t;
        int size;

        size = 10;// so luong phan tu can xap sep

        // hien thi mang ban dau
        System.out.println("Mangn ban dau la: ");
        for (int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();

        // Day la thuat toan bubble sort
        for (a = 1; a < 10; a++)
            for (b = size - 1; b >= a; b--) {
                System.out.println(b);
                if (nums[b - 1] > nums[b]) {// neu khong dung -> doi cho cac phan tu
                    t = nums[b - 1];//gt ban dau
                    nums[b - 1] = nums[b];//gan gia tri
                    nums[b] = t;// dich chuyen gia tri ban dau
                }
            }

        // hien thi mang da duoc xap xep
        System.out.println("Mang da duoc xap sep: ");
        for (int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();

        System.out.println(nums.length);
    }
}
