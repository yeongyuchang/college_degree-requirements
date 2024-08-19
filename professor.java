import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class professor {
//   static String name;
//   static double rate;
//   static String courseName;
    static ArrayList<String> name = new ArrayList<String>();
    static ArrayList<Double> rate = new ArrayList<Double>();
    static ArrayList<String> courseName = new ArrayList<String>();
    public professor(String name, double rate, String courseName) {
        this.name.add(name);
        this.rate.add(rate);
        this.courseName.add(courseName);
    }
    public static void searchProfessor(String profName) {

    }


    public static void addProfessor(professor prof1) throws IOException {
        File prof = new File("prof.txt");
        Scanner myReader = new Scanner(prof);
        //Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        String data = "";
        while (myReader.hasNextLine()) {
            data += myReader.nextLine() + "\n";
        }
        data += prof1.name.get(0) + prof1.rate.get(0) + prof1.courseName.get(0);
        //data += name;
        FileWriter fileWriter = new FileWriter("prof.txt");
        fileWriter.write(data);
    }

    public static void loadProfessor() throws FileNotFoundException {
        //When bringing the information from a text file, create a professor object with the given information. then return the object
        //professor f = new professor("Jack", 5, "CS150");
        //return f;
        File prof = new File("prof.txt");
        Scanner myReader = new Scanner(prof);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            counter++;
            if (counter == 1) {
                name.add(data);
            } else if (counter == 2) {
                rate.add(Double.parseDouble(data));
            } else {
                courseName.add(data);
                counter = 0;
            }
        }
    }
}