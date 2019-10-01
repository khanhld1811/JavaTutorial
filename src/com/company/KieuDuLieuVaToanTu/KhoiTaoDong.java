package com.company.KieuDuLieuVaToanTu;

// Minh hoạ về khởi tạo động
/*
* Chương trình tính thể tích của một hình trụ biết bán kính đáy và chiều cao của nó;
* */
public class KhoiTaoDong {
    public static void main(String[] args) {
        int radius = 4, height = 5;

        // biến volume được khởi tạo động
        double volume = 3.14 * radius * radius *radius * height;

        System.out.println("Thể tích của hình trụ : " + volume);
    }
}
