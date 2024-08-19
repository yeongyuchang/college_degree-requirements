import java.util.ArrayList;

public class grade {
    static ArrayList<Double> quizGrade = new ArrayList<Double>();
    static ArrayList<Double> assignmentGrade = new ArrayList<Double>();
    static ArrayList<Double> testGrade = new ArrayList<Double>();
    static ArrayList<Double> attendanceGrade = new ArrayList<Double>();
    static ArrayList<Double> midTermGrade = new ArrayList<Double>();
    static ArrayList<Double> finalGrade = new ArrayList<Double>();
    static ArrayList<Double> projectGrade = new ArrayList<Double>();

    public grade(double quizGrade, double assignmentGrade, double testGrade, double attendanceGrade, double midTermGrade, double finalGrade, double projectGrade) {
        this.quizGrade.add(quizGrade);
        this.assignmentGrade.add(assignmentGrade);
        this.testGrade.add(testGrade);
        this.attendanceGrade.add(attendanceGrade);
        this.midTermGrade.add(midTermGrade);
        this.finalGrade.add(finalGrade);
        this.projectGrade.add(projectGrade);
    }

    //setFinalGrade(int finalGrade){ this.finalGrade = finalGrade }
    public static void setQuizGrade(double QuizGrade) {
        quizGrade.add(QuizGrade);
    }

    public static void setAssignmentGrade(double AssignmentGrade) {
        assignmentGrade.add(AssignmentGrade);
    }

    public static void setTestGrade(double TestGrade) {
        testGrade.add(TestGrade);
    }

    public static void setAttendanceGrade(double AttendanceGrade) {
        attendanceGrade.add(AttendanceGrade);
    }

    public static void setMidTermGrade(double MidTermGrade) {
        midTermGrade.add(MidTermGrade);
    }

    public static void setFinalGrade(double FinalGrade) {
        finalGrade.add(FinalGrade);
    }

    public static void setProjectGrade(double ProjectGrade) {
        projectGrade.add(ProjectGrade);
    }

    public static double calculateAvgQuiz(ArrayList<Double> QuizGrade) {
        int total = 0;
        int counter = 0;
        for (Double i : QuizGrade) {
            total += i;
            counter++;
        }
        return total/counter;
    }

    public static double calculateAvgAssignment(ArrayList<Double> AssignmentGrade) {
        int total = 0;
        int counter = 0;
        for (Double i : AssignmentGrade) {
            total += i;
            counter++;
        }
        return total/counter;
    }

    public static double calculateAvgTest(ArrayList<Double> TestGrade) {
        int total = 0;
        int counter = 0;
        for (Double i : TestGrade) {
            total += i;
            counter++;
        }
        return total/counter;
    }

    public static double calculateAvgAttendance(ArrayList<Double> Attendance) {
        int total = 0;
        int counter = 0;
        for (Double i : Attendance) {
            total += i;
            counter++;
        }
        return total/counter;
    }

    public static double calculateAvgMidTermGrade(ArrayList<Double> MidTermGrade) {
        int total = 0;
        int counter = 0;
        for (Double i : MidTermGrade) {
            total += i;
            counter++;
        }
        return total/counter;
    }

    public static double calculateAvgAFinalGrade(ArrayList<Double> FinalGrade) {
        int total = 0;
        int counter = 0;
        for (Double i : FinalGrade) {
            total += i;
            counter++;
        }
        return total/counter;
    }

    public static double calculateAvgProjectGrade(ArrayList<Double> ProjectGrade) {
        int total = 0;
        int counter = 0;
        for (Double i : ProjectGrade) {
            total += i;
            counter++;
        }
        return total/counter;
    }
}