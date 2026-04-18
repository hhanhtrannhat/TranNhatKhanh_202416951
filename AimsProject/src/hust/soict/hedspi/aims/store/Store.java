package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;


public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore=new ArrayList<DigitalVideoDisc>();
    public void addDVD(DigitalVideoDisc DVD){
        itemsInStore.add(DVD);
        System.out.println("Da them thanh cong dia vao cua hang");
    }
    public void removeDVD(DigitalVideoDisc DVD){
        boolean isremove=itemsInStore.remove(DVD);
        if(isremove){
            System.out.println("Da xoa thanh cong");
        }
        else{
            System.out.println("xoa that bai, khong tim thay");
        }
    }
}
