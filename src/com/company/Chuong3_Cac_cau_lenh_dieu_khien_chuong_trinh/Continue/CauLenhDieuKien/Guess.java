package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien;

import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {
         char ch, answer = 'K';

        System.out.println("Tôi đang nghĩ đến 1 chữ cái từ A - Z");

        System.out.println("Bạn có thể đoán ra nó: ");

        ch = (char) System.in.read();

        if(ch == answer){
            System.out.println("**Đúng**");
        }
        else{
            System.out.print("** Xin lỗi bạn đã đoán ");
            if(ch < answer){
                System.out.println("quá thấp **");
            }
            else{
                System.out.println("quá cao **");
            }
        }
    }
}
