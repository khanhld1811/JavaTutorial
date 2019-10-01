package com.company.Chuong3_Cac_cau_lenh_dieu_khien_chuong_trinh.Continue.CauLenhDieuKien.Break;

import java.io.IOException;

public class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;

        //Lặp trong i khi bình phương nhỏ hơn num
        for(int i = 0; i < num; i ++){
            if(i * i > num)break;// keest thức  vòng lặp nếu i >= 100
            System.out.println(i + " ");
        }
        System.out.println("Vòng lặp thực thi xong");
    }
}
class Break2{
    public static void main(String[] args) throws IOException {
        char ch,answer = 'q';

        System.out.println("Nhập một ký tự từ bàn phím sau đó nhấn ENTER: ");


        for(;;){
            ch = (char) System.in.read();
            if(ch == answer){
                System.out.println("** Đúng **");
                break;
            }
            else{
                if(ch < answer){
                    System.out.println("Quá thấp");
                }
                else{
                    System.out.println("Quá cao");
                }
            }
        }
    }
}

class Break3{
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++){
            System.out.println("Biến đếm của vòng lặp bên ngoài: "+i);

            int t = 0;
            while(t < 100){
                if(t == 10) break;// kết thúc vòng lặp nếu t bằng 10
                System.out.println(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Các vòng lặp thực thi xong.");
    }
}