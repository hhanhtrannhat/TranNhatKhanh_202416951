package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD= new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD= new DigitalVideoDisc("Cinderella");
        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle title:" + jungleDVD.gettitle());
        System.out.println("cinderella title:" + cinderellaDVD.gettitle());
        changetitle(jungleDVD, cinderellaDVD.gettitle());
        System.out.println("jungle: "+jungleDVD.gettitle());
    }
    public static void swap(DigitalVideoDisc disc1,DigitalVideoDisc disc2){
        String temp1=disc1.gettitle();
        disc1.settittle(disc2.gettitle());
        disc2.settittle(temp1);
    }
    public static void changetitle(DigitalVideoDisc disc1, String title){
        String oldtitle=disc1.gettitle();
        disc1.settittle(title);
        disc1 = new DigitalVideoDisc(oldtitle);
    }
}
