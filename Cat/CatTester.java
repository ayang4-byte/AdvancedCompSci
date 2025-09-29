public class CatTester {
    public static void main(String[] args) {
//added "new" before each cat in the two lines below
        Cat myCat = new Cat("Betsy", "Tabby");
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());
//added System.out.println
        System.out.println("My Cat's Name: " + myCat.getName());
//changed return to System.out.println
        System.out.println("Are the cat's equal?" + myCat.equals(otherCat));
        System.out.println("Is my cat hungry? " + myCat.getIsHungry());
        String firstName = "Tiger";
        String lastName = "Beast"; //changed double equals to single equals
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}