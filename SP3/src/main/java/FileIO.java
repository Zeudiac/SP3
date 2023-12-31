import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class FileIO {
    public ArrayList<String> readUserData(String path) {
        ArrayList<String> data = new ArrayList<>();
        //instantier File
        File file = new File(path);

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); //Skip header
            while (scan.hasNextLine()) {
                String s = scan.nextLine(); // Hele linjen vil stå i én string   ==>  "Egon, 200"
                data.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        return data;
    }

    public void saveUserData(ArrayList<User> users) {
        try {
            FileWriter writer = new FileWriter("Accounts/Accounts.txt");
            writer.write("Username,Password" + "\n");
            for (User u : users) {
                String textTosave = u.getUserName() + "," + u.getPassWord();
                writer.write(textTosave + "\n");//Egon,5200
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("noget gik galt ved skrivning til fil");
        }
    }
        ArrayList<Movie> movies = new ArrayList<>();
        public ArrayList readMovieData(String path) {
            File file = new File(path);
            try {
                    Scanner scanner = new Scanner(file);
                    while(scanner.hasNextLine()) {
                        String line = scanner.nextLine();

                        String[] lineChop;
                        lineChop = line.split(";");

                        String title = lineChop[0];
                        String year1 = lineChop[1].trim();
                        String categories = lineChop[2];
                        String rating1 = lineChop[3].trim();
                        rating1 = rating1.replace(",", ".");

                        int year = Integer.parseInt(year1);
                        double rating = Double.parseDouble(rating1);

                        Movie movie = new Movie(title, year, categories, rating);
                        movies.add(movie);
                    }
                    return movies;

            } catch (FileNotFoundException e) {
                System.err.println("Error: File not found");
            } catch (NumberFormatException e) {
                System.err.println("Error: Invalid format in the file");
            }

            return null;
        }





}