import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Streaming {
    private ArrayList<User> users;
    String path;

    public void streamingSetup(){
        ArrayList<Movie> movies = new ArrayList<>();
        //ArrayList<Serie> series = new ArrayList<>();
        FileIO io = new FileIO();

        movies=io.readMovieData("MediaFiles/100bedstefilm.txt");
        System.out.println(movies);


    }

}
