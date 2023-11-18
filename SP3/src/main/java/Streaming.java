import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Streaming {
    private ArrayList<Media> medias;
    private ArrayList<User> users;
    String path;

    public void streamingSetup(){
        Scanner scan = new Scanner("MediaFiles/100bedstefilm.txt");
        ArrayList<Movie> movies = new ArrayList<>();
        //ArrayList<Serie> series = new ArrayList<>();

        FileIO io = new FileIO();

        while(scan.hasNextLine()){
            movies.add(io.readMovieData(movies,"MediaFiles/100bedstefilm.txt"));
        }
        System.out.println(movies);


    }

}
