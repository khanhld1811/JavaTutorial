package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.For_Each;

public class ForEach {
    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5 ,6, 7, 8, 9, 10};
        int sum = 0;

        // Sử dụng vòng lặp for  kiểu for-each để hiển thị
        // và tính tổng các giá trị.
        for(int x: nums){
            System.out.println("Giá trị là: " + x);
            sum += x;
        }
        System.out.println("Tổng: " + sum);
    }
}

class NoChange{
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};

        for(int x: nums){
            System.out.println(x + " ");
            x = x * 10; // Không ảnh hưởng tới mảng nums.
        }

        System.out.println();

        for(int x : nums){
            System.out.print                                                                                                                                                                                                                                                                              (x + " ");

            System.out.println();
        }
    }
}
