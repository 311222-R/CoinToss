public class Main {
    public static void main(String[] args) {

        //reference variable that stores the reference of the object
        Player p1 = new Player("Sarah");
        Player p2 = new Player("Roger");

        Match match = new Match(p1, p2);

        match.coinToss();

        System.out.println("Winner: " +
                match.getWinner().getName());
    }
}