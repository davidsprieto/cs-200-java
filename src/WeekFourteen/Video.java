package WeekFourteen;

public class Video {

    private String title;
    private int awardsWon;

    public Video(String title, int awardsWon) {
        this.title = title;
        this.awardsWon = awardsWon;
    }

    public String getTitle() {
        return title;
    }

    public int getAwardsWon() {
        return awardsWon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAwardsWon(int awardsWon) {
        this.awardsWon = awardsWon;
    }
}
