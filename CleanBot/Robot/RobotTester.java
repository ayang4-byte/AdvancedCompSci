public class RobotTester {
    public static void main(String[] args) {
        int[] hall = {1, 1, 2, 2};
        Robot robby = new Robot(hall, 1);

        int moveCount = robby.clearHall();
        robby.displayState();
        System.out.println(robby.getPosition());
        robby.move();
        robby.displayState();
        System.out.println(robby.getPosition());
        robby.move();
        robby.displayState();
        System.out.println(robby.getPosition());
        robby.move();
        robby.displayState();
        robby.move();
        robby.move();
        robby.move();
        robby.displayState();
        System.out.println(robby.isFacingRight());
        System.out.println("The total number of moves to clear this hall: " + moveCount);
        System.out.println("Did the robot complete the hall with exactly 9 moves? " 
                            + (moveCount == 9 ? "Yes." : "No."));
    }
}
