package com.rgerhardt.jokenpo;

public class Judge {

    public MatchResult evaluate(Hand player1Hand, Hand player2Hand) {
        if(player1Hand == player2Hand) {
            return MatchResult.DRAW;
        } else if (player1Hand.beats(player2Hand)) {
            return MatchResult.PLAYER1;
        } else {
            return MatchResult.PLAYER2;
        }
    }
}
