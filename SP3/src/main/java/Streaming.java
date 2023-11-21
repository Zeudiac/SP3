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
    public void login(){
        Scanner usrInput = new Scanner(System.in);
        System.out.println("To login - Please type your password: ");
        String usrName = usrInput.nextLine();
        System.out.println("Now the password please: ");
        String usrPass = usrInput.nextLine();

        UserMenu userMenu = new UserMenu();
        if(userMenu.userLogIn(usrName,usrPass)){

        }
        else{
            System.out.println("Seems your credentials were incorrect... :(");
            login();
        }

    }

}
