package com.company.Contructor;

public class Vehicle {
    int passengers;// so luong hanh khanh
    int fuelcap;// dung tich nhien lieu tinh theo gallon
    int mpg; // luong tieu thu nhien lieu tinh theo dam/gallon

    // day la mot phuong thuc khoi tao
    Vehicle (int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Tra ve quang duong co the di duoc
    int range(){
        return mpg * fuelcap;
    }

    // Tinh toan luong nhien lieu can cho mot khoang cach cho truoc
    double fuelneeded (int miles){
        return (double) miles / mpg;
    }
}

class VehconsDemo{
    public static void main(String[] args) {

        // khoi tao cac doi tuong Vehicle hoan chinh
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("De di duoc " + dist + " dam minivan can " + gallons + " gallon nhien lieu.");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("De di duoc " + dist + " dam sportscar can " + gallons + " gallon nhien lieu.hhhhhhhhgggggggggggggggggg");
    }
}
