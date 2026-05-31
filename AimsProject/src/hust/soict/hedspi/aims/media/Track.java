package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Track implements Playable {
    int lenth;
    String title;
    Track(int lenth,String title){
        this.lenth=lenth;
        this.title=title;
    }
    public int getLength() {
        return lenth;
    }
    public String getTitle() {
        return title;
    }
    public void setLenth(int lenth) {
        this.lenth = lenth;
    }
    public void setTitle(String title) {
        this.title = title;
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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Track)) return false;
        Track track = (Track) obj;
        return this.getTitle() != null
                && this.getTitle().equals(track.getTitle())
                && this.getLength() == track.getLength();
    }
    @Override
    public String toString() {
        return "Track: " + title + " (Thời lượng: " + lenth + " giây)";
    }
}
