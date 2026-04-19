package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.cart.Cart;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Roger Allers", "Animation", "The Lion King", 19.95f, 87);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("George Lucas", "Science Fiction", "Star Wars", 24.95f, 124);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladdin", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        System.out.println("--- TEST IN GIỎ HÀNG ---");
        cart.printcart();

        System.out.println("\n--- TEST TÌM KIẾM THEO ID ---");
        cart.searchbyid(1);
        cart.searchbyid(99);

        System.out.println("\n--- TEST TÌM KIẾM THEO TITLE ---");
        cart.searchbytitle("Star Wars");
        cart.searchbytitle("Cinderella");
    }
}