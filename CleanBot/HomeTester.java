public class HomeTester {
    public static void main(String[] args) {
        Home toyopa = new Home("611 Toyopa Dr.", "   Alex    Yang", -5);
        Home coldwater = new Home("611 Toyopa Dr.", "     Alex   Yang    ", -3);
        System.out.println(toyopa.getUsername());
        System.out.println(toyopa.getOwnerName());
        System.out.println(toyopa.getCleanlinessLevel());
        toyopa.setUsername("asdf");
        coldwater.setUsername("asdf");
        System.out.println(toyopa.toString());
        System.out.println(coldwater.toString());
        System.out.println(toyopa.equals(coldwater));
    }
    
}
