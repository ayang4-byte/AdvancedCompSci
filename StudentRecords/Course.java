public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        String result = "==" + courseName + "==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            result = result + (i + 1) + ".)" + enrolledStudents[i].toString() + "\n";
        }
        return result;
    }

    public String findBestStudent() {
        String bestStudent = "";
        double highestAverage = 0.0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            double currentAverage = enrolledStudents[i].getFinalAverage();
            if (currentAverage > highestAverage) {
                highestAverage = currentAverage;
                bestStudent = enrolledStudents[i].getName();
            }
        }
        return bestStudent;
    }

    public double getTestAverage(int test) {
        double average = 0.0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            average += enrolledStudents[i].getTestScore(test);
        }
        return average / enrolledStudents.length;
    }
}
