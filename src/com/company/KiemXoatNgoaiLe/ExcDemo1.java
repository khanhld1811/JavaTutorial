package com.company.KiemXoatNgoaiLe;

public class ExcDemo1 {
    public static void main(String[] args) {
        int nums [] = new int[4];
        try{
            System.out.println("Trước khi ngoại lệ được sinh ra.");

            // tạo ngoại lệ chỉ số vượt qua giới hạn
            nums[7] = 10;
            System.out.println("dòng này sẽ không được thực thi");
        }
        catch (ArrayIndexOutOfBoundsException e){
           //Bắt ngoại lệ
            System.out.println("Sau khi kết thúc lệnh catch");
        }
    }
}
