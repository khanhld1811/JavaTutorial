package com.company.KieuDuLieuVaToanTu;

public class ToanTu {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println(" Câu lệnh này không được thực thi");

        if (i >= j) System.out.println("Câu lệnh này không được thực thi");

        if (i > j) System.out.println("Câu lệnh này không được thực thi");

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("Câu lệnh này không được thực thi");
        if (!b1 & b2) System.out.println("!(b1 & b2) băng true");
        if (b1 | b2) System.out.println("b1 | b2 bằng true");
        if (b1 ^ b2) System.out.println("b1 ^ b2 bằng true");
    }
}

class DemoXOR {
    public static void main(String[] args) {
        int x = 0;

        for (int i = 0; i < 5; i++) {
            x = i;
        }

        System.out.println("Gias trị của x = " + x);
        int i = -5 ^ x;// ^ phương thức loại trừ với x (x là số lượng i muốn loại trừ)

        System.out.println(i);// Giá trị y = -1


    }
}

class ToanTuLogicToiUu {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0)
            System.out.println(d + " laf ước số của n " + n);
        ;

        d = 0; // thiết lập giá trị bằng 0 cho d

        // vì d bằng 0, toán hạng thứ hai sẽ không được đánh giá.
        if (d != 0 && (n % d) == 0)// Toán từ tối ưu sễ ngăn chặn một phép chia cho 0
            System.out.println(d + " là ước số của " + n);

        /*
         *   Bây giờ hãy sử dụng cách khác không sử dụng toán tử tối ưu
         *   Bạn sẽ thấy điều này sẽ gây ra lỗi chia cho 0
         * */

        if (d != 0 & (n % d) == 0)
            System.out.println(d + " là ước số của " + n);
    }
}

// Tầm quan trọng của & và | trong java
class SideEffects {
    public static void main(String[] args) {
        int i;

        i = 0;

        /*
         * Trong dòng mã dưới đây i vẫn tăng được giá trị
         * ngay cả khi câu lệnh if không được thực hiện.
         * */

        if (false & (++i < 100))
            System.out.println("Dòng này sẽ không được hiển thị");
        System.out.println("Câu lệnh if này được thực thi:" + i);


        /*
         * Trong trường hợp này i không được tăng giá trị
         * vì toán tử tối ưu bỏ qua phép tăng giá trị.
         * */

        if (false && (++i < 100)) {
            System.out.println("dòng này không được thực thi");
            System.out.println("câu lệnh if được:" + i);// vẫn hiển thị 1 !
        }
    }
}
