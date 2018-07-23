package com.rgerhardt.jokenpo;

public class Judge {

    public MatchResult evaluate(Hand player1, Hand player2) {
        if(player1.equals(Hand.SCISSORS) && player2.equals(Hand.PAPER)) {
            return MatchResult.PLAYER1;
        }
        else if(player1.equals(Hand.PAPER) && player2.equals(Hand.SCISSORS)) {
            return MatchResult.PLAYER2;
        }
        else if(player1.equals(Hand.PAPER) && player2.equals(Hand.ROCK)) {
            return MatchResult.PLAYER1;
        }
        else if(player1.equals(Hand.ROCK) && player2.equals(Hand.PAPER)) {
            return MatchResult.PLAYER2;
        }
        else if(player1.equals(Hand.ROCK) && player2.equals(Hand.SCISSORS)) {
            return MatchResult.PLAYER1;
        }
        else if(player1.equals(Hand.SCISSORS) && player2.equals(Hand.ROCK)) {
            return MatchResult.PLAYER2;
        }
        else {
            return MatchResult.DRAW;
        }
    }
}
