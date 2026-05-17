package hust.soict.hedspi.aims.media;

public class Disc extends Media {
    private String director;
    private int length;
    public Disc(String title){
        super(title);
    }
    //khoi tao bang cate,title,cost
    public Disc(String category, String title,float cost){
        super(title,category,cost);
    }
    //khoi tao bang direc,cate,title,cost
    public Disc(String director, String category, String title, float cost){
        super(title,category,cost);
    }
    //khoi tao bang tat ca thuoc tinh
    public Disc(String director, String category, String title, float cost, int lenth){
        super(title,category,cost);
        this.length = lenth;
    }
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return super.toString() + " - Đạo diễn: " + director + " - Thời lượng: " + length + " phút";
    }
}
