import java.util.Scanner;

class labActivity {
    String studentId = "";
    String firstName = "";
    String lastName = "";
    String course = "";
    String section = "";

    int midtermExamScore = 0;
    int finalExamScore = 0;
    int projectScore = 0;
    int attendanceScore = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        labActivity student = new labActivity();

        System.out.print("Enter Student ID: ");
        student.studentId = sc.nextLine();

        System.out.print("Enter First Name: ");
        student.firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        student.lastName = sc.nextLine();

        System.out.print("Enter Course: ");
        student.course = sc.nextLine();

        System.out.print("Enter Section: ");
        student.section = sc.nextLine();

        System.out.println();

        System.out.println("Student Information:");
        System.out.println("ID: " + student.studentId);
        System.out.println("Name: " + student.firstName + " " + student.lastName);
        System.out.println("Course: " + student.course);
        System.out.println("Section: " + student.section);

        System.out.println();

        System.out.print("Enter Midterm Exam Score: ");
        student.midtermExamScore = sc.nextInt();
        System.out.print("Enter Final Exam Score: ");
        student.finalExamScore = sc.nextInt();
        System.out.print("Enter Project Score: ");
        student.projectScore = sc.nextInt();
        System.out.print("Enter Attendance Score: ");
        student.attendanceScore = sc.nextInt();

        System.out.println();

        int overAllScore = student.midtermExamScore + student.finalExamScore + student.projectScore + student.attendanceScore;
        double averageScore = (overAllScore / 400.0) * 100;
        
        String remarks = (averageScore < 75) ? "FAILED" : "PASSED";

        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + student.midtermExamScore);
        System.out.println("Final Exam Score: " + student.finalExamScore);
        System.out.println("Project Score: " + student.projectScore);
        System.out.println("Attendance Score: " + student.attendanceScore);

        System.out.println();

        System.out.printf("Average Score: %.2f", averageScore);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
