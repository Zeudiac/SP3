import java.util.ArrayList;

public class User {
    private String userName;
    private String passWord;
    private ArrayList<Movie> watchedListMovies = new ArrayList<>();
    private ArrayList<Movie> savedListMovies = new ArrayList<>();

    private ArrayList<Serie> watchedListSeries;
    private ArrayList<Serie> savedListSeries;


    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        this.watchedListMovies = watchedListMovies;
        this.savedListMovies = savedListMovies;
        this.watchedListSeries = watchedListSeries;
        this.savedListSeries = savedListSeries;
    }

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



