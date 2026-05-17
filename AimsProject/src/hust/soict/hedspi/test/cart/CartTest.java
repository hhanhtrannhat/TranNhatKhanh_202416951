package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.cart.Cart;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Roger Allers", "Animation", "The Lion King", 19.95f, 87);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("George Lucas", "Science Fiction", "Star Wars", 24.95f, 124);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladdin", 18.99f);
        cart.addMedia(dvd3);

        System.out.println("--- TEST IN GIỎ HÀNG ---");
        cart.printCart();

        System.out.println("\n--- TEST TÌM KIẾM THEO ID ---");
        cart.searchById(1);
        cart.searchById(99);

        System.out.println("\n--- TEST TÌM KIẾM THEO TITLE ---");
        cart.searchByTitle("Star Wars");
        cart.searchByTitle("Cinderella");
    }
}