package com.company.HocXuLyChuoi;

public class XyLyChuoi {
    public static void main(String[] args) {
        String s = "5 Le Duy Khánh 6";
        System.out.println("Chiều dài của chuỗi = " + s.length());

        //Đếm xem chuỗi có bao nhiêu chữ In Hoa, in thường, số;
        char []  arr = s.toCharArray();
        int soInHoa = 0;
        int soInThuong = 0;
        int soChuSo = 0;
        for(int i = 0; i < arr.length;i++){
            char c = arr[i];
            if(Character.isUpperCase(c)){
                soInHoa++;
            }
            if(Character.isLowerCase(c)){
                soInThuong++;
            }
            if(Character.isDigit(c)){
                soChuSo++;
            }
        }
        System.out.println("Chuỗi có " + soInHoa + " ký tự hoa");
        System.out.println("Chuỗi có " + soInThuong + " ký tự in thường");
        System.out.println("Chuỗi có " + soChuSo + " chữ số");


    }
}
