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
    public void runStreaming(){
        protected Map<String,String> userCredentials;// En instansvariabel, der gemmer brugernavne og adgangskoder.
        String path;

        public void userAndPassoword(){

            // Opretter en ny HashMap til at gemme brugernavne og adgangskoder.
            userCredentials= new HashMap<String,String>();

            // Opretter en ny instans af TextUI-klassen.
            TextUI ui = new TextUI();
            String input="";


            // Bruger TextUI-klassen til at indhente brugernavnet fra brugeren.
            input=ui.getInput("Enter username: ");
            String username= input;

            input= ui.getInput("Enter passoword: ");
            String password=input;

            // TilfÃ¸jer brugernavnet og adgangskoden til HashMap.
            userCredentials.put(username,password);
            // Gemmer brugeroplysninger i filen "Accounts.txt"
            FileIO.saveUserData(userCredentials,"/Users/alfredofernandez/Desktop/Datamatiker/SP3/SP3/Accounts/Accounts.txt");

        }
    }

}
