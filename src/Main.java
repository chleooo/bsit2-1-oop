public class Main {
    public static void main(String[] args) {
        String studentName = "John Smith";
        double average = GradeCalculator.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = GradeCalculator.getLetterGrade(average);

        GradeCalculator.displayResult(studentName, average);
        System.out.println();
        GradeCalculator.displayResult(studentName, average, letterGrade);
    }
}

