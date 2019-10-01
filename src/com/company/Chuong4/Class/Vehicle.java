package com.company.Chuong4.Class;

public class Vehicle {
    int passengers;  // số lượng hành khách
    int fuelcap;    // dung tích bình chứa nhiên liệu theo đơn vị gallon
    int mpg;        // lượng tiêu thụ nhiên liệu trung bình theo dặm/gallon

    void range() {
        System.out.println("Quảng đường có thể đi được alf: " + fuelcap * mpg + " dặm");
    }

}

//Lớp này khai báo một đối tượng kiểu Venhicle
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // Gắn giá trị cho các trường của đôi tượng minivan
        minivan.passengers = 10;
        minivan.fuelcap = 24;
        minivan.mpg = 32;

        //tính toán quản đường đi được, giả sử bình xăng chứa đầy xăng
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan có thể chở " + minivan.passengers + " hành khách trong quãng đường dài " + range + " dặm");
    }
}

class TwoVenhicles {
    public static void main(String[] args) {
//        Vehicle minivanDemo = null;
//        minivanDemo.fuelcap = 1;// Chưa khai báo new Vehicle nên tham chiếu = null ( chưa có tham chiếu )

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // gán giá trị cho các trường của minivan
        minivan.passengers = 5;
        minivan.fuelcap = 13;
        minivan.mpg = 27;

        range1 = minivan.fuelcap * minivan.mpg;

        // gán giá trị cho các trường của sport
        sportscar.passengers = 7;
        sportscar.fuelcap = 19;
        sportscar.mpg = 23;

        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan có thể chở " + minivan.passengers + " hành khác quảng đường dài " + range1 + " dặm");
        System.out.println("Sportscar có thể chởi " + sportscar.passengers + " hành khách quảng đường dài " + range2 + " dặm");
    }
}

// Thêm phương thức range vào lớp Vehicle.

// hiển thị quảng đường có thể đi được

class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // gán giá trị cho các trường của đối tượng minivan
        minivan.passengers = 9;
        minivan.fuelcap = 19;
        minivan.mpg = 26;

        // gán giá trị cho các trường của dối tượng sportscar;
        sportscar.passengers = 5;
        sportscar.fuelcap = 18;
        sportscar.mpg = 12;

        System.out.println("Minivan có thể chỏi " + minivan.passengers + " hành khách. ");

        minivan.range();// hiển thị quảng đường đi được của minivan

        System.out.println("sportscar có thể chở " + minivan.passengers + " hành khách. ");

        sportscar.range(); // hiển thị quảng đường đi được của sportscar.
    }
}

