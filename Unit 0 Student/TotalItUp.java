public class TotalItUp {
    private int numOne, numTwo, answer;

    public void setNums(int n1, int n2) {
        n1 = numOne;
        n2 = numTwo;
    }

    public void add() {
        answer = numOne + numTwo;
    }

    public void print() {
        System.out.println(numOne + " + " + numTwo + " = " + answer);
    }
}
