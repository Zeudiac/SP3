import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.*;

public class UserMenu {
    File file = new File("Accounts/Accounts.txt");
    private ArrayList<User> users;
    protected Map<String, String> userCredentials;


    public void runUserSetupDialog() {

    }

    public void displayUsers() {

    }

    public boolean userLogIn(String userName, String passWord) {
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
                String[] lineChop;
                lineChop = line.split(",");


                String userN = lineChop[0].trim();
                String userP = lineChop[1].trim();

                if (userName.equals(userN)&&passWord.equals(userP)) {
                    return true;
                }

            }
            return false;
        }   catch (Exception e) {
            System.out.println("runtime exeption...");
            throw new RuntimeException(e);
         }
    }
    public void logOut(){

    }

    public void createAccount() {
/*
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

        // Tilføjer brugernavnet og adgangskoden til HashMap.
        userCredentials.put(username,password);
        // Gemmer brugeroplysninger i filen "Accounts.txt"
        FileIO.saveUserData(userCredentials,"/Users/alfredofernandez/Desktop/Datamatiker/SP3/SP3/Accounts/Accounts.txt");

    }
    protected Map<String,String> userCredentials;// En instansvariabel, der gemmer brugernavne og adgangskoder.

    public Map<String,String> readUserData(String path) {




        return null;
    }

    // Metode til at gemme brugeroplysninger i en fil
    protected static void  saveUserData(Map<String, String> userCredentials, String path) {

        try (FileWriter writer = new FileWriter(path,true)) {

            // Gennemgå alle brugernavne og adgangskoder i userCredentials i en foreach
            for (Map.Entry<String, String> entry : userCredentials.entrySet()) {
                // Opret en linje, der indeholder brugernavnet og adgangskoden, adskilt af et komma
                String lineToWrite = entry.getKey() + "," + entry.getValue() + "\n";
                // Skriv linjen til filen
                writer.write(lineToWrite);
            }
            // Udskriv besked om, at brugerdata er gemt
            System.out.println("User data saved.");
        } catch (IOException e) {
            // Håndter eventuelle fejl ved skrivning til fil
            System.err.println("Error writing to file: " + e.getMessage());
        }
    */
    }



        public void playMedia () {

        }

        public void deleteSavedMedia () {

        }


    }

