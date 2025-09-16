public class Student {
    private String name;
    private int grade;
    private String id;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        grade = 10;
    }

    public String generateId() {
        int randNum1 = ((int) (Math.random() * 10));
        int randNum2 = ((int) (Math.random() * 10));
        int randNum3 = ((int) (Math.random() * 10));
        int randNum4 = ((int) (Math.random() * 10));
        int randNum5 = ((int) (Math.random() * 10));
        int randNum6 = ((int) (Math.random() * 10));
        int randNum7 = ((int) (Math.random() * 10));
        return "#" + randNum1 + randNum2 + randNum3 + "-" + randNum4 + randNum5 + randNum6 + randNum7;
    }

    public String toString() {
        return "Name: " + name + " Grade: " + grade + " ID: " + id;
    }

    public boolean equal(Student otherStudent) {
        if ((otherStudent.grade == this.grade) && (this.name.equals(otherStudent.name)) && (this.id.equals(otherStudent.id))) {
            return true;
        }
        else {
            return false;
        }
    }

}
