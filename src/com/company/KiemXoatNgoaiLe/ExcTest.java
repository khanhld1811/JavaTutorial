package com.company.KiemXoatNgoaiLe;

import java.io.IOException;

public class ExcTest {

        static void genException(){
            try {


                int nums[] = new int[4];

                System.out.println("Trước khi ngoại lệ được sinh ra");

                // tạo ra ngoại lệ chỉ số vượt qua giới hạn
                nums[7] = 100;
                System.out.println("Dòng này sẽ không được hiển thị");
            }catch (Exception e){
                System.out.println("Đã bị bắt");
            }
        }

}
class ExcDemo2{
    public static void main(String[] args) {
        try{
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException e){
            //Bắt ngoại lệ
            System.out.println("Chỉ số nằm ngoài giới hạn cho phép");
        }
    }
}

class ExcTypeMismatch{
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Trước khi ngoại lệ được sinh ra");

            //tạo ra ngoại lệ chỉ số
            // vượt qua giới hạn
            nums[7] = 10;
            System.out.println("dòng này sẽ không được hiển thị nữa");
        }
        catch (ArithmeticException e){
            System.out.println("Chỉ số nằm ngoài giới hạn cho phép!");
        }
        System.out.println("Sau khi kết thức lệnh catch");

        /*
        * Không thể bắt ngoại lệ vượt quá giới hạn của mảng
        * bằng ngoại leejArithmeticEception.
        * */
    }
}
// Kiểm xoát lỗi để chương trình tiếp tục chạy
class ExcDemo3{
    public static void main(String[] args) {
        int numer[] = {4, 8, 16, 32, 64, 128};
        int demon[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numer.length;i++){
            try {
                System.out.println(numer[i] + " / " +
                        demon[i] + " bằng " + numer[i] / demon[i]);
            }
            catch (ArithmeticException e){
                //Bắt ngoại lệ
                System.out.println("Không thể chia cho số 0");
            }
        }
    }
}

class ExcDemo4{
    public static void main(String[] args) {
        //Hiện tại, mảng numer có nhiều phần tử hơn mang denom.
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int demon[] = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < numer.length;i++){
            try {
                System.out.println(numer[i] + " / " +
                        demon[i] + " bằng " + numer[i] / demon[i]);
            }
            catch (ArithmeticException e){
                System.out.println("Khong the chia cho 0");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Khong the tim thay phan tu tuong ung");
            }
        }
    }
}
/*
* Lệnh catch bắt ngoại lệ của lớp con phải đứng trước
* lện catch bắt ngoại lệ của lớp cha
* */
class ExcDemo5{
    public static void main(String[] args) {
        // Hiện tại , mảng num có nhiều phần tử hơn mảng demon.
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int demon[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numer.length;i++){
            try {
                System.out.println(numer[i] + " / " +
                        demon[i] + " bang " +
                        numer[i] / demon[i]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Khong tim thay phan tu tuong ");
            } catch (Throwable exc){
                System.out.println("Co mot ngoai le da xay ra");
            }

        }
    }
}

class ThrowDemo{
    public static void main(String[] args) {
        try {
            System.out.println("Truoc khi dua ra");
            throw  new ArithmeticException();// Dua ra 1 ngoai le thu cong

        }
        catch (ArithmeticException e){
            // bat ngoai le
            System.out.println("Ngoai le da bi bat");
        }

        System.out.println("Sau khi chay xong khoi lenh try catch");
    }
}

class Rethrow{
    public static void genException(){
        // hien tai mang numer co nhieu phan tu hon mang denom
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < numer.length; i++){
            try {
                System.out.println(numer[i] + " / " +
                        denom[i] + " bang " + numer[i] / denom[i]);
            }
            catch (ArithmeticException e){
                System.out.println("Khong the chia cho 0");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Khong tim thay phan tu tuong ung");
                throw e;// nem ra 1 ngoai le
            }
        }
    }
}

class RethrowDemo{
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException e){
            // bat lai ngoai le lan 2
            System.out.println("Loi nghiem trong - " + "cuong trinh da bi dung lai.");
        }
    }
}

class ExcTest2{
    static void genException(){


            int nums[] = new int[4];

            System.out.println("Trước khi ngoại lệ được sinh ra");

            // tạo ra ngoại lệ chỉ số vượt qua giới hạn
            nums[7] = 10;
            System.out.println("Dòng này sẽ không được hiển thị");

    }
}

class UserThrowableMethods{
    public static void main(String[] args) {
        try{
            ExcTest2.genException();
        }catch (ArrayIndexOutOfBoundsException e){
            // bat ngoai le
            System.out.println("Thong bao chuan la: ");
            System.out.println(e);
            System.out.println("\n Ngan xep luu vet: ");
            /*
            * Cho phép in ra thông báo lỗi tiêu chuẩn và một danh sách
            * các lời gọi đến các phương thức đã gây ra ngoại lệ
            * */
            e.printStackTrace();
        }
        System.out.println("Sau khi keest thuc lenh catch");
    }
}

// Sử dụng finally
class UserFinally{
    public static void genException(int what){
        int t;
        int nums[] = new int[2];

        System.out.println("Dang nhan gia tri " + what);
        try {
            switch (what){
                case 0:
                    t = 10 / what; // gay ra mot loi chia cho 0
                    break;
                case 1:
                    nums[4] = 4;// gay ra mot loi chi so mang
                    break;
                case 2:
                    return;// thoat khoi phuong thuc tu khoi try
            }
        }catch (ArithmeticException e){
            System.out.println("Khong the chia cho so 0");
            return;

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Khong tim thay pha tu tuong ung");
        }
        finally {
            System.out.println("Dang thoat khoi try");
        }
    }
}

class FinallyDemo{
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            UserFinally.genException(i);
            System.out.println();
        }
    }
}

// Sử dụng throws.
class ThrowsDemo{
    public static char prompt(String str) throws IOException{
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String args[]){
        char ch;

        try {
            ch = prompt("Nhap vao mot chu cai");
        }
        catch (IOException e){
            System.out.println("Da xay ra mot ngoai le ve nhap xuat");
            ch = 'X';
        }
        System.out.println("Ban vua nhap vao ky tu " + ch);
    }
}

class ThrowDemo2{
    public static void main(String[] args) {
        try {
            throw new IOException();
        }
        catch (IOException e){
            System.out.println("OK");
        }
    }
}
