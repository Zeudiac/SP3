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
    String userName;
    String passWord;
    static TextUI ui = new TextUI();


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
                lineChop = line.split(";");


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


    public void createAccount(){
        // Opretter en ny HashMap til at gemme brugernavne og adgangskoder.
        userCredentials= new HashMap<String,String>();



        // Opretter en ny instans af TextUI-klassen.
        String input="";
        input=ui.getInput("Enter username: ");

        userName=input.trim();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineChop;
                lineChop = line.split(";");

                String userN = lineChop[0].trim();

                if (userName.equals(userN)) {
                    System.out.println("Try again, the username already exist!");
                    input=ui.getInput("Enter username: ");

                    userName=input.trim();
                }
            }

        }   catch (Exception e) {
            System.out.println("runtime exeption...");
            throw new RuntimeException(e);
        }

        input= ui.getInput("Enter passoword: ");
        passWord=input.trim();

        // Tilføjer brugernavnet og adgangskoden til HashMap.
        userCredentials.put(userName,passWord);
        // Gemmer brugeroplysninger i filen "Accounts.txt"
        saveUserData(userCredentials,"Accounts/Accounts.txt");


    }



    protected static void saveUserData(Map<String,String> userCredentials, String path) {

        try (FileWriter writer = new FileWriter(path,true)) {

            // Gennemgå alle brugernavne og adgangskoder i userCredentials i en foreach
            for (Map.Entry<String, String> entry : userCredentials.entrySet()) {
                // Opret en linje, der indeholder brugernavnet og adgangskoden, adskilt af et semicolon.
                String lineToWrite = entry.getKey() + ";" + entry.getValue() ;
                // Skriv linjen til filen
                writer.write("\n"+lineToWrite);
            }
            // Udskriv besked om, at brugerdata er gemt
            System.out.println("User data saved.");
        } catch (IOException e) {
            // Håndter eventuelle fejl ved skrivning til fil
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
        public void playMedia () {

        }

        public void deleteSavedMedia () {

        }
    }

