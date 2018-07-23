package com.rgerhardt.jokenpo;

public class Judge {

    public MatchResult evaluate(String player1Hand, String player2Hand) {
        if(player1Hand.equals("scissors") && player2Hand.equals("paper")) {
            return MatchResult.PLAYER1;
        }
        else if(player1Hand.equals("paper") && player2Hand.equals("scissors")) {
            return MatchResult.PLAYER2;
        }
        else if(player1Hand.equals("paper") && player2Hand.equals("rock")) {
            return MatchResult.PLAYER1;
        }
        else if(player1Hand.equals("rock") && player2Hand.equals("paper")) {
            return MatchResult.PLAYER2;
        }
        else if(player1Hand.equals("rock") && player2Hand.equals("scissors")) {
            return MatchResult.PLAYER1;
        }
        else if(player1Hand.equals("scissors") && player2Hand.equals("rock")) {
            return MatchResult.PLAYER2;
        }
        else {
            return MatchResult.DRAW;
        }
    }
}
