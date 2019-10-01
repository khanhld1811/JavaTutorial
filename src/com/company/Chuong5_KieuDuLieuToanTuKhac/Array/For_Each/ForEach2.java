package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.For_Each;

// Sử dụng còng lặp for kiểu for-exh trên một mảng hai chiều.
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // cung cấp một số giá trị cho mảng núm
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);

        //Sử dụng vòng lặp for kiểu for-each để hiển thị
        // và tính tổng các giá trị.

        /*
         * [0][0] -> 1
         * [0][1] -> 2
         * [0][2] -> 3
         * [0][3] -> 4
         * [0][4] -> 5
         *
         * [1][0] -> 2
         * [1][1] -> 4
         * [1][2] -> 5
         * [1][3] -> 8
         * [1][4] -> 10
         *
         * [2][0] -> 3
         * [2][1] -> 6
         * [2][2] -> 9
         * [2][3] -> 12
         * [2][4] -> 15
         * */

        for (int x[] : nums) {
            System.out.println("x[]: " + x);
            for (int y : x) {
                System.out.println("Giá trị là: " + y);
                sum += y;
            }
            System.out.println("--------");
        }
        System.out.println("Tổng: " + sum);

    }
}
