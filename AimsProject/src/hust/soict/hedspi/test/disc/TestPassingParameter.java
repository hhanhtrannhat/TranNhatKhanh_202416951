package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD= new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD= new DigitalVideoDisc("Cinderella");
        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle title:" + jungleDVD.getTitle());
        System.out.println("cinderella title:" + cinderellaDVD.getTitle());
        changetitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle: "+jungleDVD.getTitle());
    }
    public static void swap(DigitalVideoDisc disc1,DigitalVideoDisc disc2){
        String temp1=disc1.getTitle();
        disc1.setTitle(disc2.getTitle());
        disc2.setTitle(temp1);
    }
    public static void changetitle(DigitalVideoDisc disc1, String title){
        String oldtitle=disc1.getTitle();
        disc1.setTitle(title);
        disc1 = new DigitalVideoDisc(oldtitle);
    }
}
