package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args){
        Store s1=new Store();
        DigitalVideoDisc disc2= new DigitalVideoDisc("firstdisc");
        DigitalVideoDisc disc1= new DigitalVideoDisc("firstdisc");
        s1.addMedia(disc1);
        s1.removeMedia(disc1);
    }
}
