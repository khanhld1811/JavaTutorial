package com.company.Chuong4.Class.TraVeTuMotGiaTri;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    // Trả về quảng đường có thể đi được.
    int range() {
        return mpg * fuelcap;
    }
}

class RetMeth{
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1, range2;

        // gán giá trị cho các trường của đối tượng minivan
        minivan.passengers = 8;
        minivan.fuelcap = 19;
        minivan.mpg = 35;

        // gán giá trị cho các trường của đối tượng sportscar
        sportscar.passengers = 5;
        sportscar.fuelcap = 18;
        sportscar.mpg = 13;

        // lấy giá trị quảng đường
        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan có thể chở " + minivan.passengers + " hành khác trong quãng đường " + range1 + " dặm");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Sportscar có thể chở " + minivan.passengers + " hành khách trong quãng đường " + range2 + " dặm");

        // lệnh range cũng có thể được dùng trực tiếp trong câu lệnh sau
        System.out.println("Minivan có thể chở " + minivan.passengers + " hành khách trong quãng đường " + minivan.range() + " dặm");

        // so sánh quãng đường đi được của hai phương tiện
        if(minivan.range() > sportscar.range()){
            System.out.println(" minivan đi được quảng đường dài hơn");
        }
    }
}
