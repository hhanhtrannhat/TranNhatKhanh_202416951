package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

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
    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing: " + this.getTitle());
            System.out.println("Length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: " + this.getTitle() + " length is non-positive!");
        }
    }
}

