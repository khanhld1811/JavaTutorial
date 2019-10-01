package com.company.Chuong4.Finalize;

public class FDemo {
    int x;
    FDemo (int i){
        x = i;
    }

    // duoc goi khi doi tuong bi tai su dung
    protected  void finalize(){
        System.out.println("Finalizing " + x);
    }

    // tao ra mot doi tuong ngay lap tuc se bi pha huy
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}

class Finalize{
    public static void main(String[] args) {
        int count;
        FDemo ob = new FDemo(0);

        /*
        * Bây giờ, tạo ra một số lượng lớn các đôi tượng.
        * Tại một thời điểm nào đó, việc thu gom dữ liệu
        * rác sẽ xảy ra. Lưu ý: bạn có thể cần phải tạo số
        * lượng đối tượng lớn hơn để buộc quá trình thu gom dữ liệu rác xảy ra.*/

        for(count = 1;count < 1000000000;count++){
            ob.generator(count);
        }
    }
}
