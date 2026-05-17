package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        // So sánh theo tiêu đề (Alphabetical)
        int titleCompare = m1.getTitle().compareTo(m2.getTitle());

        // Nếu tiêu đề khác nhau thì trả về kết quả so sánh tiêu đề
        if (titleCompare != 0) {
            return titleCompare;
        }

        // Nếu tiêu đề giống nhau, so sánh theo giá giảm dần (m2 so với m1)
        return Float.compare(m2.getCost(), m1.getCost());
    }
}