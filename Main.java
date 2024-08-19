import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        professor f = new professor("Jack", 5, "CS150");
        try {
            f.addProfessor(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}