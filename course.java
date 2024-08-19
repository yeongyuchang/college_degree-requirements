import java.util.Calendar;

public class course {
    static double credit;
    static String courseType;
    static int quiz; //percentage
    static int assignment; //percentage
    static int test; //percentage
    static int attendance; //percentage
    static int midTermExam; //percentage
    static int finalExam; //percentage
    static int project; //percentage
    public course(double credit, String courseType, int quiz, int assignment, int test, int attendance, int midTermExam, int finalExam, int project) {
        this.credit = credit;
        this.courseType = courseType;
        this.quiz = quiz;
        this.assignment = assignment;
        this.test = test;
        this.attendance = attendance;
        this.midTermExam = midTermExam;
        this.finalExam = finalExam;
        this.project = project;
    }
    public static double Calculator (int avgQuiz, int avgAssignment, int avgTest, int avgAttendance, int avgMidTermExam, int avgFinalExam, int avgProject) {
        // depending on the percentage value of each categories calculate the total score of this course
        double totalQuizGrade = avgQuiz / 100 * quiz;
        double totalAssignmentGrade = avgAssignment / 100 * assignment;
        double totalTestGrade = avgTest / 100 * test;
        double totalAttendance = avgAttendance / 100 * attendance;
        double totalMidTerm = avgMidTermExam / 100 * midTermExam;
        double totalFinalExam = avgFinalExam / 100 * finalExam;
        double totalProject = avgProject / 100 * project;

        return totalAssignmentGrade + totalQuizGrade + totalTestGrade + totalAttendance + totalMidTerm + totalFinalExam + totalProject;
    }
}