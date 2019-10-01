package com.company.KieuDuLieuVaToanTu;

public class PhamViCuaBien {
    public static void main(String[] args) {
        int x; // Biến này được tất cả các đoạn mã nhìn thấy

        x = 10;
        if(x == 10){ // Bắt đầu một phạm vi mới

            int y = 20; // biến y này chỉ được nhìn thấy trong khối mã này

           // cả x và y đều được nhìn thấy trong khối mã này

            System.out.println("x = " + x + "\n" + " y = " + y);
            x = y + 2;
        }

        // Đã ra ngoài phạm vi của y
//        y = 100; // Lỗi! y không được nhìn thấy

        // x vẫn được nhìn thấy ở đây.
        System.out.println("x = " + x);
    }
}
class Demo2{
    public static void main(String[] args) {
        int x;

        for(x = 0; x < 3; x++){
             int y = -1;// y được khởi tạo lại mỗi lần khối mã được thực thi

            System.out.println("giá trị của y = " + y);

            y = 10;
            System.out.println("Giá trị hiện tại của y " + y);
            System.out.println("------------------");

            // giá trị của x không khởi tạo lại khi mỗi lần khối mã thực thi
            System.out.println("Giá trị hiện tại của x " + x);
        }
    }
}
