package com.company.HuongDoiTuong;

public class SinhVien {
    public int yearPl; // có thể gọi ở bất kỳ đâu
    private int yearPv;// trong phạm vi class này
    protected int yearPtd;// chỉ có thể gọi trong class chứa nó và class kế thừa
    static String tenCoGiaoChuNhiem;// truy cập không cần khởi tạo obj, tất cả obj chung nhau giá trị
//    final int age;
//    synchronized ;// duoc dung de dong bo du lieu
}
