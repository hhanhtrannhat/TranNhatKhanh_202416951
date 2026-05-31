package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.Collections;

public class Cart {

    // Khai báo ObservableList thay cho ArrayList để JavaFX có thể theo dõi sự thay đổi dữ liệu
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    // Hàm thêm một đối tượng Media (Book, CD, DVD) vào giỏ hàng
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " đã được thêm vào giỏ hàng.");
        } else {
            System.out.println(media.getTitle() + " đã có sẵn trong giỏ hàng.");
        }
    }

    public void addMedia(Media media1, Media media2) {
        System.out.println("--- Đang thêm 2 sản phẩm vào giỏ hàng ---");
        // Tái sử dụng hàm gốc ở trên để thêm từng cái
        this.addMedia(media1);
        this.addMedia(media2);
    }

    public void addMedia(Media[] mediaList) {
        System.out.println("--- Đang thêm một danh sách sản phẩm vào giỏ hàng ---");
        // Dùng vòng lặp duyệt qua từng phần tử trong mảng và thêm vào giỏ
        for (Media media : mediaList) {
            this.addMedia(media);
        }
    }

    // Hàm xóa một đối tượng Media khỏi giỏ hàng
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println(media.getTitle() + " đã được xóa khỏi giỏ hàng.");
        } else {
            System.out.println("Không tìm thấy " + media.getTitle() + " trong giỏ hàng.");
        }
    }

    // Hàm kiểm tra số lượng sản phẩm
    public int qnt() {
        return itemsOrdered.size();
    }

    // Hàm tính tổng số tiền đĩa trong cart
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // In thông tin giỏ hàng
    public void printCart() {
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
        System.out.println("Total cost: " + this.totalCost());
    }

    // Tìm kiếm theo ID
    public void searchById(int id) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                matchFound = true;
                System.out.println("Đã tìm thấy: " + media.toString());
                break; // Tìm thấy thì thoát vòng lặp luôn
            }
        }
        if (!matchFound) {
            System.out.println("Không tìm thấy sản phẩm với ID: " + id);
        }
    }

    // Tìm kiếm theo Title
    public void searchByTitle(String title) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                matchFound = true;
                System.out.println("Đã tìm thấy: " + media.toString());
            }
        }
        if (!matchFound) {
            System.out.println("Không tìm thấy sản phẩm với tiêu đề: " + title);
        }
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Đã sắp xếp giỏ hàng theo Tiêu đề -> Giá.");
        this.printCart();
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Đã sắp xếp giỏ hàng theo Giá -> Tiêu đề.");
        this.printCart();
    }

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}