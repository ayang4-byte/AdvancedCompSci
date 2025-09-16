public class StudentTester {
    public static void main(String[] args) {
        Student middleStudent
        = new Student("Grayden", 15, 5.2, false);
        Student topStudent 
        = new Student("Grayden", 15, 5.2, true);
        
        topStudent.getName();
        topStudent.setAge(16);
        System.out.println(topStudent.equals(middleStudent));
    }
}
