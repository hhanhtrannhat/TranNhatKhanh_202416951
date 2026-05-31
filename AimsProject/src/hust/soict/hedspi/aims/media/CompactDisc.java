package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String artist, List<Track> tracks) {
        super(title);
        this.artist = artist;
        if (tracks != null) {
            this.tracks = tracks;
        }
    }

    public CompactDisc(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Đã thêm track: " + track.getTitle());
        } else {
            System.out.println("Track: " + track.getTitle() + " đã tồn tại trong CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Đã xóa track: " + track.getTitle());
        } else {
            System.out.println("Không tìm thấy track: " + track.getTitle() + " để xóa.");
        }
    }

    @Override
    public int getLength() {
        int sum = 0;
        for (Track track : tracks) {
            sum += track.getLength();
        }
        return sum;
    }

    @Override
    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing CD: " + this.getTitle());
            System.out.println("CD length: " + this.getLength());
            for (Track track : tracks) {
                try {
                    track.play();
                } catch (PlayerException e) {
                    // Ném ngoại lệ lên tiếp cho lớp gọi nó xử lý
                    throw e;
                }
            }
        } else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[CD] ").append(super.toString()).append(" - Nghệ sĩ: ").append(artist).append("\n");
        sb.append("   --- Danh sách các Track: ---\n");

        if (tracks.isEmpty()) {
            sb.append("   (Không có track nào)\n");
        } else {
            for (Track track : tracks) {
                sb.append("   + ").append(track.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}