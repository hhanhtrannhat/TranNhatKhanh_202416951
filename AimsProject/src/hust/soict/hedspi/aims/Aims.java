package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args){
        //Khởi tạo giỏ hàng
        Cart c1 = new Cart();
        //Tạo các đối tượng đĩa
        DigitalVideoDisc disc = new DigitalVideoDisc("ko loi");
        disc.setcategory("indie");
        disc.setcost(99.0f);
        disc.setlength(99);
        disc.setdirector("j97");
        DigitalVideoDisc disc1 = new DigitalVideoDisc("loi");
        disc1.setcategory("indie");
        disc1.setcost(99.0f);
        disc1.setlength(99);
        disc1.setdirector("j97");
        //Test thêm đĩa và tính tiền
        c1.addDigitalVideoDisc(disc);
        c1.addDigitalVideoDisc(disc1);
        //Test tinh quantity
        System.out.println("quantity is " + c1.qnt()); 
        //Test tinh tien
        System.out.println(c1.totalcost());
        //Test xóa đĩa
        System.out.println("\n--- TEST XÓA ĐĨA ---");
        c1.removeDigitalVideoDisc(disc1);
        System.out.println("quantity is " + c1.qnt());
        System.out.println(c1.totalcost());
        //Tạo một đĩa mẫu để test
        DigitalVideoDisc sampleDisc = new DigitalVideoDisc("Test Limit");
        sampleDisc.setcategory("pop");
        sampleDisc.setcost(100);
        sampleDisc.setdirector("j97");
        sampleDisc.setlength(4);
        //Hiện tại giỏ đang có 1 đĩa (vì ban đầu thêm 2, xóa 1),
        DigitalVideoDisc[] dvdList= new DigitalVideoDisc[14];
        for(int i=0;i<14;i++){
            dvdList[i]=sampleDisc;
        }
        c1.addDigitalVideoDisc(dvdList);
        c1.addDigitalVideoDisc(sampleDisc,sampleDisc);
        System.out.println(sampleDisc.getid());
        c1.printcart();
    }
}