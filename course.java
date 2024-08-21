public class course {
    public String professorName;
    public double credit;
    public String courseType;
    public int quiz; //percentage
    public int assignment; //percentage
    public int test; //percentage
    public int attendance; //percentage
    public int midTermExam; //percentage
    public int finalExam; //percentage
    public int project; //percentage
    public course(String professorName, double credit, String courseType, int quiz, int assignment, int test, int attendance, int midTermExam, int finalExam, int project) {
        this.professorName = professorName;
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
    public double Calculator(int avgQuiz, int avgAssignment, int avgTest, int avgAttendance, int avgMidTermExam, int avgFinalExam, int avgProject) {
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