class Student {
    String name;
    int age;
    String course;
    double grade1, grade2, grade3;

    Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    void displayInfo() {
        System.out.println("Student's Information:");
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Status: " + (isPassing() ? "PASSING" : "FAILING"));
        System.out.println(); // blank line for readability
    }

    double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    String getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    boolean isPassing() {
        return calculateAverage() >= 70;
    }
}

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
