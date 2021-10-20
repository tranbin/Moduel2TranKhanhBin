package ss8_clean_code.bai_tap;

public class TennisGame {
    private static final char ZERO = '0';
    public static final char ONE = '1';
    public static final char TWO = '2';
    public static final char THREE = '3';
    public static final char FOUR = '4';

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case ZERO:
                    score = "Love-All";
                    break;
                case ONE:
                    score = "Fifteen-All";
                    break;
                case TWO:
                    score = "Thirty-All";
                    break;
                case THREE:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scorePlayer1 >= FOUR || scorePlayer2 >= FOUR) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == ONE) score = "Advantage player1";
            else if (minusResult == -ONE) score = "Advantage player2";
            else if (minusResult >= TWO) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = ONE; i < THREE; i++) {
                if (i == ONE) tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case ZERO:
                        score += "Love";
                        break;
                    case ONE:
                        score += "Fifteen";
                        break;
                    case TWO:
                        score += "Thirty";
                        break;
                    case THREE:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
