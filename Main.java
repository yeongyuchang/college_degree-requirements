import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        //Creating empty professor object to use loadProfessor Method
        professor prof = new professor("", 0, "");
        prof.loadProfessor();
        //Creating Arraylist with professor object.
        ArrayList<professor> profs = new ArrayList<professor>();
        int x = prof.name.size();
        //Creating new professor objects through prof/ The loop will run based on ArrayList size
        for (int i = 1; i < x; i++) {
            professor profSample = new professor(prof.name.get(i), prof.rate.get(i), prof.courseName.get(i));
            profs.add(profSample);
        }
        //System.out.println(profs.get(1).name.get(0));


        //Add Professor
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double rate = scanner.nextDouble();
        //If I don't make a new Scanner then the nextLine() would just get skipped, so I made a new one.
        Scanner scanner2 = new Scanner(System.in);
        String courseName = scanner2.nextLine();


        professor addedProfessor = new professor(name, rate, courseName);
        prof.addProfessor(addedProfessor);


        //Search
        Scanner scanner1 = new Scanner(System.in);
        String searchName = scanner1.nextLine();
        prof.searchProfessor(searchName);


        // Course




    }
}
