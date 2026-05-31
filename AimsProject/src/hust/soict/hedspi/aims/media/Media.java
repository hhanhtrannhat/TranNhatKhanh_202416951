package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia=0;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(String title) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
    }
    public Media(String title, String category) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
        this.category = category;
    }
    public Media(String title, String category, float cost) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media(String title, float cost) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
        this.cost = cost;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
    public float getCost() {
        return cost;
    }

    public String getCategory() {
        return category;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Media)) {
            return false;
        }
        Media otherMedia = (Media) obj;
        if (this.getTitle() != null && this.getTitle().equals(otherMedia.getTitle())) {
            return true;
        }

        return false;
    }
    @Override
    public String toString() {
        return "ID: " + id + " - Tiêu đề: " + title + " - Thể loại: " + category + " - Giá: " + cost + "$";
    }
}
