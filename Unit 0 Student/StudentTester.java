public class StudentTester {
    public static void main(String[] args) {
        Student junior = new Student("Jimmy", 11);
        Student senior = new Student("Amy", 12);
        Student freshman = new Student("Katherine", 9);
        Student sophomore = new Student("Johnny", 10, senior, junior);
        Student sophomore1 = new Student("Alice", 10, senior, freshman);
        
        
        System.out.println(sophomore.generateId());
        System.out.println(sophomore.equals(junior));
        System.out.println(sophomore.getId());
        System.out.println(senior.generateId());
        System.out.println(sophomore1.vibeCheck(sophomore));

    }
}
