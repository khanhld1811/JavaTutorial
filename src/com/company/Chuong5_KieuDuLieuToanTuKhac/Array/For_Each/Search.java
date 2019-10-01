package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.For_Each;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        // Sử dụng vòng lặp for kiểu for-each để tìm kiếm
        // val trong mảng nums.
        for(int x : nums){
            if(x == val){
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Đã tìm thấy giá trị");
    }
}
