package hust.soict.hedspi.aims.screen;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

import java.util.ArrayList;

public class StoreScreenTest {
    public static void main(String[] args) {
        Store cuaHang = new Store();

        DigitalVideoDisc diaDvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 19.95f, 87);
        DigitalVideoDisc diaDvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 24.95f, 124);
        DigitalVideoDisc diaDvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 18.99f, 90);

        cuaHang.addMedia(diaDvd1);
        cuaHang.addMedia(diaDvd2);
        cuaHang.addMedia(diaDvd3);

        Book sach1 = new Book("Wuthering Heights", 15.0f, new ArrayList<>());
        Book sach2 = new Book("A Question of Proof", 12.5f, new ArrayList<>());
        Book sach3 = new Book("Snow Country", 20.0f, new ArrayList<>());

        cuaHang.addMedia(sach1);
        cuaHang.addMedia(sach2);
        cuaHang.addMedia(sach3);

        CompactDisc diaCd1 = new CompactDisc("Greatest Hits","test1");
        CompactDisc diaCd2 = new CompactDisc("Thriller","test2");
        CompactDisc diaCd3 = new CompactDisc("Abbey Road","test3");

        cuaHang.addMedia(diaCd1);
        cuaHang.addMedia(diaCd2);
        cuaHang.addMedia(diaCd3);

        new StoreScreen(cuaHang);
    }
}