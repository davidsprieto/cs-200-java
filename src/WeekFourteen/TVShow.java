package WeekFourteen;

public class TVShow extends Video {

    private int numEpisodes;
    private int startYear;

    public TVShow(String title, int awardsWon, int numEpisodes, int startYear) {
        super(title, awardsWon);
        this.numEpisodes = numEpisodes;
        this.startYear = startYear;
    }

    public void printInfo() {
        System.out.println("Title: " + super.getTitle());
        System.out.println("Awards won: " + super.getAwardsWon());
        System.out.println("Number of episodes: " + this.numEpisodes);
        System.out.println("Stat year: " + this.startYear);
    }
}
