public class DogTester {
    public static void main(String[] args) {
        Dog multipoo = new Dog("Lulu", "Joshua", 6, 123);
        Dog retriever = new Dog();
        Dog samoyed = new Dog("Mochi", "Joshua", 23, 123);
        System.out.println(multipoo.toString());
        System.out.println(retriever.toString());
        System.out.println(samoyed.toString());
        
        System.out.println(samoyed.getDogTag());
        samoyed.setDogId(19);
        System.out.println(samoyed.getDogTag());
        // System.out.println(PawesomeUtils.validateDogTag(samoyed));
        // System.out.println(samoyed.getDogTag());
        // System.out.println(PawesomeUtils.generateDogTag(123, 'L'));

    }
}
