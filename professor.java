import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class professor {
    //   static String name;
//   static double rate;
//   static String courseName;


    public ArrayList<String> name;
    public ArrayList<Double> rate;
    public ArrayList<String> courseName;
    public professor(String name, double rate, String courseName) {
        this.name = new ArrayList<>();
        this.rate = new ArrayList<>();
        this.courseName = new ArrayList<>();
        this.name.add(name);
        this.rate.add(rate);
        this.courseName.add(courseName);
    }
    public static void searchProfessor(String Name) throws FileNotFoundException {
        File a = new File("prof.txt");
        Scanner scanner = new Scanner(a);
        String data = "";
        String tempName = "";
        String tempRate = "";
        String tempCourseName = "";
        int counter = 0;
        int count = 0;
        while (scanner.hasNextLine()) {
            data = scanner.nextLine();
            counter++;
            if (counter == 1) {
                tempName = data;
            } else if (counter == 2) {
                tempRate = data;
            } else {
                tempCourseName = data;
                counter = 0;
                if (tempName.equals(Name) || tempCourseName.equals(Name)) {
                    System.out.println(tempName + " " + tempRate + " " + tempCourseName);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Not Found");
        }
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
        myReader.close();
        data += prof1.name.get(0)+ "\n" + prof1.rate.get(0)+ "\n" + prof1.courseName.get(0) + "\n";
        //data += name;
        FileWriter fileWriter = new FileWriter("prof.txt");
        fileWriter.write(data);
        fileWriter.close();
    }


    public void loadProfessor() throws FileNotFoundException {
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