public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
    }
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        String result = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            result = result + (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
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

    public double calculateTestAverage(int test) {
        double average = 0.0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            average += enrolledStudents[i].getTestScore(test);
        }
        return average / enrolledStudents.length;
    }

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord Student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = Student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord Student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == Student) {
                enrolledStudents[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public int countEnrolledStudents() {
        int count = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count = count + 1;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] newArray = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            newArray[i] = enrolledStudents[i];
        }
        setEnrolledStudents(newArray);
    }
}
