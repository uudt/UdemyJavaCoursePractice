public class Main {
    public static void main(String[] args) {

        System.out.println("New score is " + calculateScore("Ulyana", 500));
        System.out.println("New score is " + calculateScore(10));
        calculateScore();
    }

    public static int calculateScore(String player, int score) {
        System.out.println("Player " + player + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", 100);

    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

}
