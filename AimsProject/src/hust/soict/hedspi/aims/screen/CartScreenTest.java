package hust.soict.hedspi.aims.screen;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.util.ArrayList;

public class CartScreenTest {
    public static void main(String[] args) {
        Cart gioHang = new Cart();

        DigitalVideoDisc diaDvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 19.95f, 0);
        DigitalVideoDisc diaDvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 24.95f, 124);
        Book sach1 = new Book("Wuthering Heights", 15.0f, new ArrayList<>());
        CompactDisc diaCd1 = new CompactDisc("Greatest Hits","test1");
        CompactDisc diaCd2 = new CompactDisc("Thriller","test2");
        CompactDisc diaCd3 = new CompactDisc("Abbey Road","test3");

        gioHang.addMedia(diaDvd1);
        gioHang.addMedia(diaDvd2);
        gioHang.addMedia(sach1);
        gioHang.addMedia(diaCd1);
        gioHang.addMedia(diaCd2);
        gioHang.addMedia(diaCd3);

        new CartScreen(gioHang);
    }
}