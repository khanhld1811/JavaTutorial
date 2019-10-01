package com.company.HuongDoiTuong;

public class Student {

    public String tenSinhVien;
    public int maSinhVien;
    public int diemToan;
    public int diemTiengAnh;

    public float tinhDiemTrungBinh(){
        int tongDiem = diemToan + diemTiengAnh;
        float diemTrungBinh = tongDiem / 2;
        inDiemTrungBinh(diemTrungBinh);
        return diemTrungBinh;
    }

    public void inDiemTrungBinh(float diemTrungBinh){
        System.out.println("Điểm trung bình của sinh viên : " + diemTrungBinh);
    }

}
