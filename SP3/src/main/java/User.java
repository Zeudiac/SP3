import java.util.ArrayList;

public class User {
    private String userName;
    private String passWord;
    private ArrayList<Movie> watchedListMovies;
    private ArrayList<Movie> savedListMovies;

    private ArrayList<Serie> watchedListSeries;
    private ArrayList<Serie> savedListSeries;



    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public ArrayList<Movie> getWatchedList() {
        return watchedListMovies;
    }

    public ArrayList<Movie> getSavedList() {
        return savedListMovies;
    }
}



