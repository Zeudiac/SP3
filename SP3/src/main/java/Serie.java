import java.util.ArrayList;

public class Serie {
    private String title;
    private int yearFrom;
    private String yearTo;
    private String categories;
    private double rating;
    private int seasonNumber;
    private int numberOfEpisodes;

    public Serie(String title, int yearFrom, String yearTo, String categories, double rating, int seasonNumber, int numberOfEpisodes) {
        this.title = title;
        this.yearFrom = yearFrom;
        this.yearTo = yearTo;
        this.categories = categories;
        this.rating = rating;
        this.seasonNumber = seasonNumber;
        this.numberOfEpisodes = numberOfEpisodes;
    }
}
