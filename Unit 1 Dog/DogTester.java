public class DogTester {
    public static void main(String[] args) {
        Dog multipoo = new Dog("Lulu", "Joshua", 6, 123);
        Dog retriever = new Dog();
        Dog samoyed = new Dog("Mochi", "Joshua", 23, 123);
        System.out.println(multipoo.toString());
        System.out.println(retriever.toString());
        System.out.println(fakeDog.toString());
        multipoo.setAge(7);
        fakeDog.setAge(7);
        fakeDog.setName("Lulu");
        retriever.setAge(6767);
        System.out.println(Dog.generateDogChar(123));
        System.out.println(Dog.generateDogChar(456));
        System.out.println(multipoo.equals(samoyed));
        Dog.checkIn(multipoo, "Michael");
        System.out.println(Dog.pickup(multipoo, "Michael"));
        retriever.setStillInFacility(false);
        System.out.println(retriever.toString());

    }
}
