public class StudentTester {
    public static void main(String[] args) {
        Student sophomore = new Student("Johnny", 10);
        Student junior = new Student("Amy", 11);
        System.out.println(sophomore.generateId());
        System.out.println(sophomore.equals(junior));
    }
}
