import java.util.ArrayList;

public class User {
    private String userName;
    private String passWord;
    private ArrayList<Media> watchedList;
    private ArrayList<Media> savedList;


    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public ArrayList<Media> getWatchedList() {
        return watchedList;
    }

    public ArrayList<Media> getSavedList() {
        return savedList;
    }
}



