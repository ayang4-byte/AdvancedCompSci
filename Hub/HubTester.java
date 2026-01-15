public class HubTester {
    public static void main(String[] args) {
        Student one = new Student("Alex", "asdf", "alexyang@gmail.com");
        Student two = new Student("John", "asd", "as@.d");
        Hub bigOne = new Hub();

        try {
            one.changeName("@");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            two.changeName("Alex");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            Student three = new Student("", "Asd", "@.");
            three.changeName("");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            Student four = new Student(null, "asdf", "asdf@.");
            four.changeName("Asdf");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            Student five = new Student("Asd", "", "@.");
            five.changeName("ASdf");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            Student five = new Student("asd", "Asd", "asdf");
            five.changeName("asdf");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        bigOne.registerStudent("Audrey", "qwerty", "@@..");
        bigOne.registerStudent("Andrew", "qwerty", "@@..");
        bigOne.registerStudent("Luke", "6789", "luketyang@gmail.com");
        try {
            bigOne.registerStudent(null, "1234", "@.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            bigOne.registerStudent("", "1234", "@.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            bigOne.registerStudent("Alex", "1234", "alexthyang");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            bigOne.registerStudent("@lex", "1234", "@.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            bigOne.registerStudent("Luke", "3456", "@.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            bigOne.loginStudent("Johnny", "1234");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            bigOne.loginStudent("Luke", "1919");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            bigOne.doesStudentExist("Luke");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
