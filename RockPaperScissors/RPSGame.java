import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Please enter your sign: ");
        String sign = "";
        
        int i = 2;
        for (i = 2; i > 0; i--) {
            sign = scan.nextLine();
            if (validateChoice(sign) == true) {
                i = -10;
            } else {
                System.out.println("You have " + i + " more chances. Please enter wisely.");
            }
        }
        scan.close();
        if (i == 0) {
            sign = generateRandomChoice();
        }
        this.setPlayerValues(name, sign);
    }

    public void setPlayerValues(String name, String choice) {
        player.setChoice(choice);
        player.setName(name);
    }

    public boolean didPlayerWin() {
        if (player.getChoice() == "paper" && opponent.getChoice() == "rock") {
            return true;
        } else if (player.getChoice() == "rock" && opponent.getChoice() == "scissors") {
            return true;
        } else if (player.getChoice() == "scissors" && opponent.getChoice() == "paper") {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (didPlayerWin()) {
            return "" + player.getName() + " won.\nCongratulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
    }

    public String displayResults() {
        return "== GAME RESULTS ==\n" 
                + player.toString() 
                + "\n" 
                + opponent.toString() 
                + "\n" 
                + this.toString();
    }

    public static boolean validateChoice(String choice) {
        if (choice.equals("rock")) {
            return true;
        } else if (choice.equals("paper")) {
            return true;
        } else if (choice.equals("scissors")) {
            return true;
        } else {
            return false;
        }
    }

    public static String generateRandomChoice() {
        String choice = "";
        int number = (int) ((Math.random() * 2) + 1);
            if (number == 1) {
                choice = "rock";
            } else if (number == 2) {
                choice = "scissors";
            } else {
                choice = "paper";
            }
        return choice;
    }


}
