package com.company.Chuong4.This;

public class Pwr {
    double b;
    int e;
    double val;

    Pwr (double base, int exp){
        this.b = base;
        this.e = exp;

        this.val = 2;

        if(exp == 0) return;
        for(; exp > 0; exp--)
            this.val = this.val * base;
    }

    double get_pwr(){
        return this.val;
    }
}

class DemoPwr{
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " mũ " + x.e + " bằng " + x.get_pwr());

        System.out.println(y.b + " mũ " + y.e + " bằng " + y.get_pwr());

        System.out.println(z.b + " mũ " + z.e + " bằng " + z.get_pwr());
    }
}
