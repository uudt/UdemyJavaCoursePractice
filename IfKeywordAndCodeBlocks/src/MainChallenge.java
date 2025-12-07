public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High score is " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The next high score is " + highScore);


        //challenge
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Ulyana1", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Ulyana2", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Ulyana3", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Ulyana4", position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("Ulyana5", position);


        position = calculateHighScorePosition(1499);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(999);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(499);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(99);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(24);
        displayHighScorePosition("Tim", position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
