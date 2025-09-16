public class StudentTester {
    public static void main(String[] args) {
        Student Johnny = new Student("Johnny", 10);
        Student Amy = new Student("Amy", 11);
        System.out.println(Johnny.generateId());
        System.out.println(Johnny.equals(Amy));
        
    }
}
