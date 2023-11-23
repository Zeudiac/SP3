import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Streaming {

    String path;
    private int chosenMedia;
    private int whatToDoWithMovie;
    private int input;
    private String textInput;
    private boolean movieChosen = false;
    UserMenu userMenu = new UserMenu();
    TextUI ui = new TextUI();





    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Serie> series = new ArrayList<>();
    public void streamingSetup(){



        FileIO io = new FileIO();

        movies=io.readMovieData("MediaFiles/100bedstefilm.txt");
        series=io.readSeriesData("MediaFiles/100bedsteserier.txt");

        System.out.println("Hi!");
        System.out.println("Welcome to AAAM's streaming service - Please choose an option to continue: ");
        System.out.println("1. Login to Existing account");
        System.out.println("2. Create new account");

        //User chooses to login or create new profile.
        input = ui.getNumericInput("(1 or 2):");
        createNewAccountOrLogin();


    }
    public void login(){
        Scanner usrInput = new Scanner(System.in);
        System.out.println("To login - Please type your username: ");
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

    public void createAccount(){
        userMenu.createAccount();
    }
    public void createNewAccountOrLogin(){
        if(input==1){
            login();
        }
        else if(input==2){
            createAccount();
            login();
        }
        else{
            input = ui.getNumericInput("Number missmatch - Please type one of the numbers: (1 or2):");
            createNewAccountOrLogin();
        }
    }

    public void chooseWhatToBrowse(){
        int count=0;
        if(input==1){
            movieChosen = true;
            for(Movie s: movies){
                count++;
                System.out.println(count+": "+s.getTitle());
            }
        }
        else if(input==2){
            movieChosen = false;
            for(Serie s: series){
                count++;
                System.out.println(count+": "+s.getTitle());
            }
        }
        else{
            chooseWhatToBrowse();
            input = ui.getNumericInput("Number missmatch - Please type one of the numbers: (1 or2):");
        }
    }

    public void chooseMedia() {
        int count = 0;
        if(input<101&&input>0) {
            if (movieChosen) {
                System.out.println("You choose: " + movies.get(input - 1).getTitle() + " - is this correct?");
                textInput = ui.getInput("(Y/N): ");
                if (textInput.equalsIgnoreCase("y")) {
                    chosenMedia = input - 1;
                } else if (textInput.equalsIgnoreCase("n")) {
                    for (Movie s : movies) {
                        count++;
                        System.out.println(count + ": " + s.getTitle());
                    }
                    input = ui.getNumericInput("Please try again, to select movie please type the movies given number - (1 to 100):");
                    chooseMedia();
                }
            } else if (movieChosen == false) {
                System.out.println("You choose: " + series.get(input - 1).getTitle() + " - is this correct?");
                textInput = ui.getInput("(Y/N): ");
                if (textInput.equalsIgnoreCase("y")) {
                    chosenMedia = input - 1;
                } else if (textInput.equalsIgnoreCase("n")) {
                    for (Serie s : series) {
                        count++;
                        System.out.println(count + ": " + s.getTitle());
                    }
                    input = ui.getNumericInput("Please try again, to select movie please type the movies given number - (1 to 100):");
                    chooseMedia();
                }
            }
        }
        else {
            input = ui.getNumericInput("Seems you typed a number that is not within the given range - please try again (1-100): ");
            chooseMedia();
        }
        }



    public void chooseWhatToDoWithChosenMedia(){
        if(input<5&&input>0) {
            if (movieChosen) {
                if(input==1){
                //1. Play Movie
                    System.out.println(movies.get(chosenMedia)+" is now playing");
                    System.out.println("----------------------------------------");
                    System.out.println("----------------------------------------");
                    System.out.println("----------------------------------------");
                    //Add to watched movies list

                    //Opretter text fil for brugeren med deres gemte film - Skal hedde brugerens navn
                    //Skal ikke oprette fil såfremt fil med brugerens navn allerede eksistere

                    //Tilføjer den valgte film til text filen
                    //Reinatilere "savedMoviesarraylist" for brugeren og tilføjer den gemte fil
                }
                if(input==2) {
                //2. Add to Saved Movies list
                    //Funktionen tager imod et bruger objekt

                    //Opretter text fil for brugeren med deres gemte film - Skal hedde brugerens navn
                    //Skal ikke oprette fil såfremt fil med brugerens navn allerede eksistere

                    //Tilføjer den valgte film til text filen
                    //Reinatilere "savedMoviesarraylist" for brugeren og tilføjer den gemte fil
                }
                if(input==3){
                //3. Delete from Saved Movies list
                    //Funktionen tager imod et bruger objekt

                    //Smider en error til brugeren hvis user object ikke har nogle gemte film

                    //Fjerner den valgte film fra brugerens gemte
                    //Reinatilere "savedMoviesarraylist" for brugeren og tilføjer den gemte fil
                }
                if(input==4){
                //4. Display details
                    System.out.println(movies.get(chosenMedia));
                }
            }

            else if (movieChosen==false) {
                if(input==1){
                    //
                    System.out.println(series.get(chosenMedia).getTitle()+" is now playing");
                    System.out.println("----------------------------------------");
                    System.out.println("----------------------------------------");
                    System.out.println("----------------------------------------");
                }
                if(input==2) {
                    //
                }
                if(input==3){
                    //
                }
                if(input==4){
                    //
                    System.out.println(series.get(chosenMedia));
                }
            }
        }
        else{
            input = ui.getNumericInput("Seems you typed a number that is not within the given range - please try again (1-4): ");
            chooseWhatToDoWithChosenMedia();
        }
    }
    public void addToSaved(User u){
        u.getSavedList().add(movies.get(chosenMedia));
    }

    public void startStream(){
        streamingSetup();

        System.out.println("Login successfull! - please choose next action:");
        System.out.println("1. Browse movies");
        System.out.println("2. Browse series");

        //User chooses what to browse.
        input = ui.getNumericInput("(1 or 2):");
        chooseWhatToBrowse();

        //User chooses media
        input = ui.getNumericInput("to select movie please type the movies given number - (1 to 100): ");
        chooseMedia();

        //User chooses what to do with media option (Save/delete from savedlist/watch/display details)
        System.out.println("You have selected: " +movies.get(chosenMedia).getTitle());
        System.out.println("Please choose what to do with the choosen Media:");
        System.out.println("1. Play Movie");
        System.out.println("2. Add to Saved Movies list");
        System.out.println("3. Delete from Saved Movies list");
        System.out.println("4. Display media details");


        input = ui.getNumericInput("(1 to 4):");
        chooseWhatToDoWithChosenMedia();
        //
    }

}
