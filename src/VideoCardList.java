
import java.util.ArrayList;

public class VideoCardList {
    private ArrayList<Video_Cards> videoCards;

    public VideoCardList() {
        videoCards = new ArrayList<Video_Cards>();
    }

    public void addVideoCard(Video_Cards vc) {
        videoCards.add(vc);
    }

    public void removeVideoCard(Video_Cards vc) {
        videoCards.remove(vc);
    }

    public ArrayList<Video_Cards> getVideoCards() {
        return videoCards;
    }
}