public class Student {
    private String name;
    private int age;
    private double gpa;
    private boolean honorRoll;


    public Student(String newName, int newAge, double newGpa, boolean newHonorRoll) {
        name = newName;
        age = newAge;
        gpa = newGpa;
        honorRoll = newHonorRoll;
    }

    public double study(int hours) {
        this.gpa = gpa + hours/100;
        return gpa;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String toString() {
        return "My name is " + name + "I am " + age + "years old. My gpa is" + gpa + "Honor roll: " + honorRoll;
    }

    public boolean equals(Student anotherStudent) {
        if (this.name.equals(anotherStudent.name)) {
            return true;
        }
            return false;
    }

}
