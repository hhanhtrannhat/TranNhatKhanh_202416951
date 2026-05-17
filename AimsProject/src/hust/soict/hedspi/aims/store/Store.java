package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Store {

    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Đã thêm thành công " + media.getTitle() + " vào cửa hàng.");
        } else {
            System.out.println(media.getTitle() + " đã có sẵn trong cửa hàng.");
        }
    }
    public void removeMedia(Media media) {
        boolean isRemoved = itemsInStore.remove(media);
        if (isRemoved) {
            System.out.println("Đã xóa thành công " + media.getTitle() + " khỏi cửa hàng.");
        } else {
            System.out.println("Xóa thất bại, không tìm thấy " + media.getTitle() + " trong cửa hàng.");
        }
    }
    public void printStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("Cửa hàng hiện đang trống.");
        } else {
            for (Media media : itemsInStore) {
                System.out.println(media.toString());
            }
        }
    }
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}