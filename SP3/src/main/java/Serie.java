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

    public String getTitle() {
        return title;
    }

    public int getYearFrom() {
        return yearFrom;
    }

    public String getYearTo() {
        return yearTo;
    }

    public String getCategories() {
        return categories;
    }

    public double getRating() {
        return rating;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
}
