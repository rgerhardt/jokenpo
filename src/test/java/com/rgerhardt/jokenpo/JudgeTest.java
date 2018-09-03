package com.rgerhardt.jokenpo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JudgeTest {

    private Judge judge;

    @BeforeEach
    public void setUp() {
        judge = new Judge();
    }

    @ParameterizedTest(name = "Hand1 {0} Hand2 {1} Winner {2}")
    @CsvSource({
            "PAPER, ROCK, PLAYER1",
            "ROCK, PAPER, PLAYER2",
            "SCISSORS, PAPER, PLAYER1",
            "PAPER, SCISSORS, PLAYER2",
            "ROCK, SCISSORS, PLAYER1",
            "SCISSORS, ROCK, PLAYER2",
            "ROCK, LIZARD, PLAYER1",
            "LIZARD, ROCK, PLAYER2",
            "LIZARD, SPOCK, PLAYER1",
            "SPOCK, LIZARD, PLAYER2",
            "SPOCK, SCISSORS, PLAYER1",
            "SCISSORS, SPOCK, PLAYER2",
            "SCISSORS, LIZARD, PLAYER1",
            "LIZARD, SCISSORS, PLAYER2",
            "LIZARD, PAPER, PLAYER1",
            "PAPER, LIZARD, PLAYER2",
            "PAPER, SPOCK, PLAYER1",
            "SPOCK, PAPER, PLAYER2",
            "SPOCK, ROCK, PLAYER1",
            "ROCK, SPOCK, PLAYER2",
    })
    public void testEvaluate_DifferentHands_returnWinner(Hand player1Hand, Hand player2Hand, MatchResult expectedResult) {
        MatchResult result = judge.evaluate(player1Hand, player2Hand);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "Hand1 {0} Hand2 {1} Result {2}")
    @CsvSource({
            "ROCK, ROCK, DRAW",
            "PAPER, PAPER, DRAW",
            "SCISSORS, SCISSORS, DRAW",
            "LIZARD, LIZARD, DRAW",
            "SPOCK, SPOCK, DRAW"
    })
    public void testEvaluate_SameHands_returnDraw(Hand player1Hand, Hand player2Hand, MatchResult expectedResult) {
        MatchResult result = judge.evaluate(player1Hand, player2Hand);
        assertEquals(expectedResult, result);
    }

}
