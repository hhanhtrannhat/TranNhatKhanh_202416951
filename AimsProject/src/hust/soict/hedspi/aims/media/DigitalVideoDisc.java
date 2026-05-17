package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    //khoi tao bang title
    public DigitalVideoDisc(String title){
        super(title);
    }
    //khoi tao bang cate,title,cost
    public DigitalVideoDisc(String category, String title,float cost){
        super(title,category,cost);
    }
    //khoi tao bang direc,cate,title,cost
    public DigitalVideoDisc(String director, String category, String title, float cost){
        super(title,category,cost);
    }
    //khoi tao bang tat ca thuoc tinh
    public DigitalVideoDisc(String title, String category, String directory, float cost, int lenth){
        super(title,category,directory,cost,lenth);
    }
    @Override
    public String toString() {
        return "[DVD] " + super.toString();
    }
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}

