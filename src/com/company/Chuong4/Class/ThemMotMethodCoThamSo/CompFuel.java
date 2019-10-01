package com.company.Chuong4.Class.ThemMotMethodCoThamSo;




public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan= new Vehicle();
        Vehicle sportscar = new Vehicle();

        double gallons;
        int dist = 353;

        // gán giá trị cho các trường của đối tượng minivan
        minivan.passengers = 9;
        minivan.fuelcap = 16;
        minivan.mpg = 27;

        // gán giá trị cho các trường của đôi tượng sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 19;
        sportscar.mpg = 31;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Để đi được " + dist + " dặm minivan cần " + gallons + " gallons nhiên liệu.");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("Để đii được " + dist + " dặm sportscar cần " + gallons + " gallon nhiên liệu");
    }
}

 class Vehicle {
    int passengers;  // số lượng hành khách
    int fuelcap;    // dung tích bình chứa nhiên liệu theo đơn vị gallon
    int mpg;        // lượng tiêu thụ nhiên liệu trung bình theo dặm/gallon

    void range() {
        System.out.println("Quảng đường có thể đi được alf: " + fuelcap * mpg + " dặm");
    }

    // tính toán lượng nhiên liệu cần dùng
    // cho một khoảng cách đã cho trước.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
