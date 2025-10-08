public class DogTester {
    public static void main(String[] args) {
        Dog multipoo = new Dog("Lulu", "Joshua", 6, 123);
        Dog retriever = new Dog();
        Dog samoyed = new Dog("Mochi", "Joshua", 23, 123);
        System.out.println(multipoo.toString());
        System.out.println(retriever.toString());
        System.out.println(samoyed.toString());
        multipoo.setAge(7);
        samoyed.setAge(7);
        samoyed.setName("Lulu");
        retriever.setAge(6767);
        System.out.println(PawesomeUtils.generateDogChar(123));
        System.out.println(PawesomeUtils.generateDogChar(456));
        System.out.println(multipoo.equals(samoyed));
        PawesomeUtils.checkIn(multipoo, "Michael");
        System.out.println(PawesomeUtils.pickup(multipoo, "Michael"));
        retriever.setStillInFacility(false);
        System.out.println(retriever.toString());
        System.out.println(PawesomeUtils.validateDogTag(samoyed));
        System.out.println(samoyed.getDogTag());

    }
}
