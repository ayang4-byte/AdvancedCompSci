public class Student {
    private String name;
    private int grade;
    private String id;
    private Student latestOpp;
    private Student recentFriend;

    public Student getLatestOpp() {
        return latestOpp;
    }

    public void setLatestOpp(Student latestOpp) {
        this.latestOpp = latestOpp;
    }

    public Student getRecentFriend() {
        return recentFriend;
    }

    public void setRecentFriend(Student recentFriend) {
        this.recentFriend = recentFriend;
    }

    public Student(String name, int grade, Student latestOpp, Student recentFriend) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String generateId() {
        int randNum1 = ((int) (Math.random() * 8)) + 1;
        int randNum2 = ((int) (Math.random() * 10));
        int randNum3 = ((int) (Math.random() * 10));
        int randNum4 = ((int) (Math.random() * 8)) + 1;
        int randNum5 = ((int) (Math.random() * 10));
        int randNum6 = ((int) (Math.random() * 10));
        int randNum7 = ((int) (Math.random() * 10));
        return "" + randNum1 + randNum2 + randNum3 + "-" 
            + randNum4 + randNum5 + randNum6 + randNum7;
    }

    public String toString() {
        return "Name: " + name + " Grade: " + grade + " ID: " + id;
    }

    public boolean equals(Student otherStudent) {
        if ((otherStudent.grade == this.grade) 
            && (this.name.equals(otherStudent.name))) {
            return true;
        } else {
            return false;
        }
    }

    public String vibeCheck(Student other) {
        if (this.latestOpp.equals(other.latestOpp)) {
            this.recentFriend = other;
            other.recentFriend = this;
            return "" + this.name + " and " + other.name + " are now friends. They both dislike " + this.latestOpp + "";
        } else {
            return "They have nothing in common";
        }

    }

    
}
