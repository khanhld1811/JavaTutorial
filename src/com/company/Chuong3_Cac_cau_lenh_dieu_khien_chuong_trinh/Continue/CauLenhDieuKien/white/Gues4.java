package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.white;

import java.io.IOException;

public class Gues4 {
    public static void main(String[] args) throws IOException {

        char ch, ignore, answer = 'K';

        do{
            System.out.println("Tôi đang nghĩ đến một chữ cái giữa A và Z.");
            System.out.println("Bạn có thể đoán ra nó: ");

            // đọc một ký tự
            ch = (char) System.in.read();

            // loại bỏ bất kỳ chữ cái nào khác đang lưu trong vùng nhớ đệm đầu vào
            do{
                ignore = (char) System.in.read();
                System.out.println("ignore->"+ignore);
            }while (ignore != '\n');

            if(ch == answer) System.out.println("** Đúng **");
            else{
                System.out.println(".. Xin lỗi, bạn đoán ");
                if(ch < answer) System.out.println("Quá thấp");
                else System.out.println("quá cao");
            }
        }while (answer != ch);
    }
}
