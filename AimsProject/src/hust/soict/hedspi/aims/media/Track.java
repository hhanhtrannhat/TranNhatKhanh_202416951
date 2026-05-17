package hust.soict.hedspi.aims.media;

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
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
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
