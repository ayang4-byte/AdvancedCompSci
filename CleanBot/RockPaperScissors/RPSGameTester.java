public class RPSGameTester {
    public static void main(String[] args) {
        Player player = new Player();
        NPC opponent = new NPC();
        RPSGame gameOne = new RPSGame(player, opponent);

        gameOne.start();
        System.out.println(gameOne.displayResults());
    }
}
