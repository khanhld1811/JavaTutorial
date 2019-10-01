package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.BaiThucHanh_5_2_Queue;

public class Queue {
    char q[];           // mảng này lưu trữ hàng đợi
    int putloc, getloc; // chỉ số put và chỉ số get

    Queue(int size) {
        q = new char[size + 1]; // mảng này lưu trữ hàng đợi
        int putloc, getlocl;    // chỉ số put và chỉ số get
    }

    //chèn một ký tự vào tỏng hàng đợi
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Hàng đợi đã đầy.");
            return;
        }
        putloc++;// tăng giá trị
        q[putloc] = ch;// thêm phần tử mới
    }

    // lấy một ký tự hàng đợi
    char get() {
        if (getloc == putloc) {
            System.out.print(" - Hàng đợi rỗng.");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(26);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Sử dụng bigQ để lưu trữ bảng chữ cái.");

        //chèn một số chữ cái vào bigQ.
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));



        // truy xuất và hiển thị các phần tử từ bigQ
        System.out.println("Nội dung của bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("------------");

        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println();
        System.out.println("------------");

        System.out.println("Sử dụng smallQ để sinh ra lỗi.");
        for (i = 0; i < 5; i++) {
            System.out.println("Cố gắng lưu trữ " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // sinh thêm lỗi trên smallQ
        System.out.println("Nội dung của smallQ: ");

        System.out.println(smallQ.get());// ví dụ về hàng đợi: phần tử này đã được truy xuất thì không thể truy xuất lại
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}

