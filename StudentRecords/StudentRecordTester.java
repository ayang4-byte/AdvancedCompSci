public class StudentRecordTester {
    public static void main(String[] args) {
        int[] scores1 = {70, 75, 80, 85, 90};
        StudentRecord student1 = new StudentRecord("Johnny", scores1);

        int[] scores2 = {90, 85, 80, 75, 70};
        StudentRecord student2 = new StudentRecord("Kai", scores2);

        System.out.println("Student: " + student1.getName());
        System.out.println("Scores: ");
        for (int score : student1.getScores()) {
            System.out.print(score + " ");
        }
        System.out.println("\nAverage of first and last score: " + student1.getAverage(0, scores1.length - 1));
        System.out.println("Has improved: " + student1.hasImproved());

        System.out.println("\nStudent: " + student2.getName());
        System.out.println("Scores: ");
        for (int score : student2.getScores()) {
            System.out.print(score + " ");
        }
        System.out.println("\nAverage of first and last score: " + student2.getAverage(0, scores2.length - 1));
        System.out.println("Has improved: " + student2.hasImproved());
        System.out.println(student1.toString());
    }
}
