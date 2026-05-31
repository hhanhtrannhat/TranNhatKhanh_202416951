package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.exception.PlayerException;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.Playable;
import hust.soict.hedspi.aims.store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initData(); // Nạp dữ liệu mẫu

        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    storeMenuRouter();
                    break;
                case 2:
                    updateStoreRouter(); // Menu thêm/xóa khỏi cửa hàng
                    break;
                case 3:
                    cartMenuRouter();
                    break;
                case 0:
                    System.out.println("Tạm biệt! Cảm ơn bạn đã sử dụng AIMS.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
    public static void showMenu() {
        System.out.println("\nAIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static void storeMenuRouter() {
        int choice;
        do {
            store.printStore();
            storeMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tiêu đề Media muốn xem: ");
                    String title1 = scanner.nextLine();
                    Media media1 = findMediaInStore(title1);
                    if (media1 != null) {
                        System.out.println(media1.toString());
                        mediaDetailsMenuRouter(media1); // Mở menu chi tiết cho Media này
                    } else {
                        System.out.println("Không tìm thấy sản phẩm có tên: " + title1);
                    }
                    break;
                case 2:
                    System.out.print("Nhập tiêu đề Media muốn thêm vào giỏ: ");
                    String title2 = scanner.nextLine();
                    Media media2 = findMediaInStore(title2);
                    if (media2 != null) {
                        cart.addMedia(media2);
                        if (media2 instanceof DigitalVideoDisc) {
                            System.out.println("Số lượng DVD hiện có trong giỏ: " + countDVDsInCart());
                        }
                    } else {
                        System.out.println("Không tìm thấy sản phẩm có tên: " + title2);
                    }
                    break;
                case 3:
                    System.out.print("Nhập tiêu đề Media muốn Play: ");
                    String title3 = scanner.nextLine();
                    Media media3 = findMediaInStore(title3);
                    if (media3 != null) {
                        playMedia(media3);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm có tên: " + title3);
                    }
                    break;
                case 4:
                    cartMenuRouter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }

    public static void mediaDetailsMenuRouter(Media media) {
        int choice;
        do {
            mediaDetailsMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                cart.addMedia(media);
            } else if (choice == 2) {
                playMedia(media);
            }
        } while (choice != 0);
    }

    public static void updateStoreRouter() {
        System.out.println("\n--- CẬP NHẬT CỬA HÀNG ---");
        System.out.println("1. Thêm một DVD mẫu vào cửa hàng");
        System.out.println("2. Xóa một Media khỏi cửa hàng (theo tiêu đề)");
        System.out.println("0. Quay lại");
        System.out.print("Chọn: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Nhập tên DVD mới: ");
            String newTitle = scanner.nextLine();
            DigitalVideoDisc newDVD = new DigitalVideoDisc(newTitle);
            store.addMedia(newDVD);
        } else if (choice == 2) {
            System.out.print("Nhập tiêu đề Media muốn xóa: ");
            String title = scanner.nextLine();
            Media m = findMediaInStore(title);
            if (m != null) {
                store.removeMedia(m);
            } else {
                System.out.println("Không tìm thấy Media trong cửa hàng!");
            }
        }
    }
    public static void cartMenuRouter() {
        int choice;
        do {
            cart.printCart();
            cartMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("1. Lọc theo ID | 2. Lọc theo Tiêu đề");
                    int filterChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (filterChoice == 1) {
                        System.out.print("Nhập ID: ");
                        int id = scanner.nextInt();
                        cart.searchById(id);
                    } else if (filterChoice == 2) {
                        System.out.print("Nhập Tiêu đề: ");
                        String t = scanner.nextLine();
                        cart.searchByTitle(t);
                    }
                    break;
                case 2:
                    System.out.println("1. Sắp xếp Tiêu đề -> Giá | 2. Sắp xếp Giá -> Tiêu đề");
                    int sortChoice = scanner.nextInt();
                    if (sortChoice == 1) {
                        cart.sortByTitleCost();
                    } else if (sortChoice == 2) {
                        cart.sortByCostTitle();
                    }
                    break;
                case 3:
                    System.out.print("Nhập tiêu đề Media muốn xóa khỏi giỏ: ");
                    String titleToRemove = scanner.nextLine();
                    Media m = findMediaInCart(titleToRemove);
                    if (m != null) {
                        cart.removeMedia(m);
                    } else {
                        System.out.println("Không tìm thấy trong giỏ hàng.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập tiêu đề Media muốn Play: ");
                    String titleToPlay = scanner.nextLine();
                    Media mediaToPlay = findMediaInCart(titleToPlay);
                    if (mediaToPlay != null) {
                        playMedia(mediaToPlay);
                    } else {
                        System.out.println("Không tìm thấy trong giỏ hàng.");
                    }
                    break;
                case 5:
                    System.out.println("Đã đặt hàng thành công! Giỏ hàng sẽ được làm trống.");
                    cart = new Cart(); // Làm trống giỏ hàng bằng cách khởi tạo lại
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }
    private static Media findMediaInStore(String title) {
        for (Media m : store.getItemsInStore()) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        return null;
    }
    private static Media findMediaInCart(String title) {
        for (Media m : cart.getItemsOrdered()) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        return null;
    }
    private static int countDVDsInCart() {
        int count = 0;
        for (Media m : cart.getItemsOrdered()) {
            if (m instanceof DigitalVideoDisc) {
                count++;
            }
        }
        return count;
    }

    private static void playMedia(Media media) {
        if (media instanceof Playable) {
            try {
                ((Playable) media).play();
            } catch (PlayerException e) {
                System.err.println("Không thể phát media này!");
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("Sản phẩm này (" + media.getTitle() + ") không hỗ trợ phát (Play)!");
        }
    }

    private static void initData() {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCost(19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCost(24.95f);
        CompactDisc cd = new CompactDisc("Nhạc Trịnh", "Trịnh Công Sơn");
        cd.setCost(50.0f);
        List<String> authors = new ArrayList<String>();
        authors.add("James Gosling");
        Book book = new Book("Sách Lập Trình Java", 15.5f, authors);

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(cd);
        store.addMedia(book);
    }
}