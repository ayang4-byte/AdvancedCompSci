public class StudentTester {
    public static void main(String[] args) {
        Student sophomore = new Student("Johnny", 10);
        Student junior = new Student("Johnny", 10);
        Student senior = new Student("Amy");
        System.out.println(sophomore.generateId());
        System.out.println(sophomore.equals(junior));
        System.out.println(sophomore.getId());
        System.out.println(senior.generateId());
    }
}
