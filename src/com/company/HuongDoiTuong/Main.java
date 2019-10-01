package com.company.HuongDoiTuong;

public class Main {
    public static void main(String[] args) {
        Student_contructor student = new Student_contructor();
        student.setTenSinhVien("Le Duy Khanh");
        student.setMaSinhVien(10);
        student.setDiemToan(9);
        student.setDiemTiengAnh(7);

        float diemTrungBinhCuaSinhVien1 = student.tinhDiemTrungBinh();
        student.inDiemTrungBinh(diemTrungBinhCuaSinhVien1);
        System.out.println("Ten sinh vien: " + student.getTenSinhVien());
        System.out.println("Ma sinh vien: " + student.getMaSinhVien());

        System.out.println("--------------------------------------------");

        // obj2
        Student_contructor student2 = new Student_contructor();
        student2.setTenSinhVien("Le Duy Hieu");
        student2.setMaSinhVien(11);
        student2.setDiemToan((float) 8.5);
        student2.setDiemTiengAnh(9);

        float diemTrungBinhCuaSinhVien2 = student2.tinhDiemTrungBinh();
        student.inDiemTrungBinh(diemTrungBinhCuaSinhVien2);
        System.out.println("Ten sinh vien: " + student2.getTenSinhVien());
        System.out.println("Ma sinh vien: " + student2.getMaSinhVien());


        System.out.println("-----------------------------------------------");

        // obj3
        Student_contructor student3 = new Student_contructor("Le Dinh Quan",3, 8, 9);
        float diemTrungBinhCuaSinhVien3 = student3.tinhDiemTrungBinh();
        student3.inDiemTrungBinh(diemTrungBinhCuaSinhVien3);
        System.out.println("Ten sinh vien: " + student3.getTenSinhVien());
        System.out.println("Ma sinh vien: " + student3.getMaSinhVien());

    }
}
