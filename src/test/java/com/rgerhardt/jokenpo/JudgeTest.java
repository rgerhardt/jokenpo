package com.rgerhardt.jokenpo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JudgeTest {

    private Judge judge;

    @Before
    public void setUp() {
        judge = new Judge();
    }

    @Test
    public void returnDrawIfHandsAreEqual() {
        String possibleHands[] = {"paper", "rock", "scissor"};
        for(String hand: possibleHands) {
            assertEquals(MatchResult.DRAW, judge.evaluate(hand, hand));
        }
    }

    @Test
    public void returnPlayer1IfHandsAreScissorsAndPaper() {
        MatchResult result = judge.evaluate("scissors", "paper");
        assertEquals(MatchResult.PLAYER1, result);
    }

    @Test
    public void returnPlayer2IfHandsArePaperAndScissors() {
        MatchResult result = judge.evaluate("paper","scissors");
        assertEquals(MatchResult.PLAYER2, result);
    }

    @Test
    public void returnPlayer1IfHandsArePaperAndRock() {
        MatchResult result = judge.evaluate("paper", "rock");
        assertEquals(MatchResult.PLAYER1, result);
    }

    @Test
    public void returnPlayer2IfHandsAreRockAndPaper() {
        MatchResult result = judge.evaluate("rock", "paper");
        assertEquals(MatchResult.PLAYER2, result);
    }

    @Test
    public void returnPlayer1IfHandsAreRockAndScissors() {
        MatchResult result = judge.evaluate("rock", "scissors");
        assertEquals(MatchResult.PLAYER1, result);
    }

    @Test
    public void returnPlayer2IfHandsAreScissorsAndRock() {
        MatchResult result = judge.evaluate("scissors", "rock");
        assertEquals(MatchResult.PLAYER2, result);
    }



}
