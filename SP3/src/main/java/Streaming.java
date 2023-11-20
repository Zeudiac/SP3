import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Streaming {

    String path;

    public void streamingSetup(){
        ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<Serie> series = new ArrayList<>();
        FileIO io = new FileIO();

        movies=io.readMovieData("MediaFiles/100bedstefilm.txt");
        System.out.println(movies);
        series=io.readSeriesData("MediaFiles/100bedsteserier.txt");
        System.out.println(series);

    }
    public void runStreaming(){

    }

}
