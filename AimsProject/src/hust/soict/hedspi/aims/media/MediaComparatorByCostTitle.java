package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        // So sánh theo giá giảm dần (m2 so với m1)
        int costCompare = Float.compare(m2.getCost(), m1.getCost());

        // Nếu giá khác nhau thì trả về kết quả so sánh giá
        if (costCompare != 0) {
            return costCompare;
        }

        // Nếu giá giống nhau, so sánh theo tiêu đề (Alphabetical)
        return m1.getTitle().compareTo(m2.getTitle());
    }
}