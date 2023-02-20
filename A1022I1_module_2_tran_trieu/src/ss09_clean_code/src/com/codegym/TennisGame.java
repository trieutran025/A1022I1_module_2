package ss09_clean_code.src.com.codegym;

public class TennisGame {

    public static String getScore(String playerOneName, String playerTwoName, int mScoreOne, int mScoreTwo) {
        String score = "";
        int tempScore = 0;
        if (mScoreOne == mScoreTwo) {
            switch (mScoreOne) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (mScoreOne >= 4 || mScoreTwo >= 4) {
            int minusResult = mScoreOne - mScoreTwo;
            if (minusResult == 1) {
                score = "Advantage playerOne";
            } else if (minusResult == -1) {
                score = "Advantage playerTwo";
            } else if (minusResult >= 2) {
                score = "Win for playerTwo";
            } else {
                score = "Win for playerTwo";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = mScoreOne;
                } else {
                    score += "-";
                    tempScore = mScoreTwo;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}