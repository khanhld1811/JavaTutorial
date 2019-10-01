package com.company.Chuong5_KieuDuLieuToanTuKhac.Array.MangMotChieu;

public class MiMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min = 0, max = 0;

        nums[0] = 99;
        nums[1] = -15;
        nums[2] = 100002;
        nums[3] = 19;
        nums[4] = -789;
        nums[5] = 5643;
        nums[6] = 324;
        nums[7] = -9;
        nums[8] = 123;
        nums[9] = 835;

        FindMinMax(min, max, nums);
    }

    public static void FindMinMax(int min, int max, int nums[]) {
        for (int i = 1; i < 10; i++) {
            /*
             * nums[0] == 99 < min = 0 if(sai)-> khong thuc hien lenh if
             * nums[1] = -15 > min = 0 if(dung)-> gan min = -15
             * nums[2] = 100002 > min = -15 if(sai) -> khong thuc hien lenh if
             * ...
             * */
            if (nums[i] < min)// neu nums[i] < min gan gia tri nho nhat do cho min
                min = nums[i];
            if (nums[i] > max)
                /*
                 * nums[0] == 99 > max = 0 if(dung)-> gan max = 99
                 * nums[1] = -15 > max = 99 if(sai)-> o thuc hien lenh if
                 * nums[2] = 100002 > max = 99 if(dung) -> gan max = 100002
                 * ...
                 * */
                max = nums[i];// neu nums[i] > max gan gia tri lon nhat do cho max
        }

        System.out.println("Gia tri nho nhat va gia tri lon nhat la: " + min + " , " + max);
    }
}
