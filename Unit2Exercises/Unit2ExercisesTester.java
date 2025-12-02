public class Unit2ExercisesTester {
    public static void main(String[] args) {

        int[] swords = {1, 1, 1, 2};
        String[] words = {"hi", "hi", "bye", "bye"};
        int[] array1 = Unit2Exercises.zeroFront(swords);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        String[] array2 = Unit2Exercises.wordsWithout(words, "no");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println(Unit2Exercises.countCode("cozexxcope"));
    }
}
