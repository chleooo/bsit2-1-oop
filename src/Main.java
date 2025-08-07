

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "BSIT", 85.0, 90.0, 88.0);
        Student student2 = new Student("Bob", 19, "BSCS", 92.0, 95.0, 89.0);
        Student student3 = new Student("Charlie", 21, "BSIT", 65.0, 70.0, 68.0);

        Student[] students = { student1, student2, student3 };
        int passingCount = 0;

        for (Student student : students) {
            student.displayInfo();
            if (student.isPassing()) {
                passingCount++;
            }
        }

        System.out.println("Summary: " + passingCount + " out of " +
                students.length + " students are passing.");
    }
}
