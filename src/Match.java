import java.util.Random;

public class Match {
    private Player player1;
    private Player player2;
    private Player winner;

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void coinToss() {
        Random random = new Random();

        if (random.nextBoolean()) {
            winner = player1;   //reference to player1 object
        } else {
            winner = player2;   //reference to player2 object
        }
    }

    public Player getWinner() {
        return winner;
    }
}