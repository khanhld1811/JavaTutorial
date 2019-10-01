package com.company.HuongDoiTuong;

public class Student_contructor {
    private String tenSinhVien;
    private int maSinhVien;
    private float diemToan;
    private float diemTiengAnh;

    public Student_contructor(){

    }

    public Student_contructor(String tenSinhVien, int maSinhVien,float diemToan, float diemTiengAnh){
        this.tenSinhVien = tenSinhVien;
        this.maSinhVien = maSinhVien;
        this.diemToan = diemToan;
        this.diemTiengAnh = diemTiengAnh;
    }

    public float tinhDiemTrungBinh(){
        float tongDiem = diemToan + diemTiengAnh;
        float diemTrungBinh = tongDiem / 2;
        return diemTrungBinh;
    }

    public void inDiemTrungBinh(float diemTrungBinh){
        System.out.println("Điểm trung bình của sinh viên : " + diemTrungBinh);
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemTiengAnh() {
        return diemTiengAnh;
    }

    public void setDiemTiengAnh(float diemTiengAnh) {
        this.diemTiengAnh = diemTiengAnh;
    }
}
