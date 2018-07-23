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
        for(Hand hand: Hand.values()) {
            assertEquals(MatchResult.DRAW, judge.evaluate(hand, hand));
        }
    }

    @Test
    public void returnPlayer1IfHandsAreScissorsAndPaper() {
        MatchResult result = judge.evaluate(Hand.SCISSORS, Hand.PAPER);
        assertEquals(MatchResult.PLAYER1, result);
    }

    @Test
    public void returnPlayer2IfHandsArePaperAndScissors() {
        MatchResult result = judge.evaluate(Hand.PAPER,Hand.SCISSORS);
        assertEquals(MatchResult.PLAYER2, result);
    }

    @Test
    public void returnPlayer1IfHandsArePaperAndRock() {
        MatchResult result = judge.evaluate(Hand.PAPER, Hand.ROCK);
        assertEquals(MatchResult.PLAYER1, result);
    }

    @Test
    public void returnPlayer2IfHandsAreRockAndPaper() {
        MatchResult result = judge.evaluate(Hand.ROCK, Hand.PAPER);
        assertEquals(MatchResult.PLAYER2, result);
    }

    @Test
    public void returnPlayer1IfHandsAreRockAndScissors() {
        MatchResult result = judge.evaluate(Hand.ROCK, Hand.SCISSORS);
        assertEquals(MatchResult.PLAYER1, result);
    }

    @Test
    public void returnPlayer2IfHandsAreScissorsAndRock() {
        MatchResult result = judge.evaluate(Hand.SCISSORS, Hand.ROCK);
        assertEquals(MatchResult.PLAYER2, result);
    }



}
