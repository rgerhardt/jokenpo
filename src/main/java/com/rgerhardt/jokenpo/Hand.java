package com.rgerhardt.jokenpo;

public enum  Hand {
    ROCK {
        @Override
        public boolean beats(Hand other) {
            return other == SCISSORS || other == LIZARD;
        }
    },
    PAPER {
        @Override
        public boolean beats(Hand other) {
            return other == ROCK || other == SPOCK;
        }
    },
    SCISSORS {
        @Override
        public boolean beats(Hand other) {
            return other == PAPER || other == LIZARD;
        }
    },
    LIZARD {
        @Override
        public boolean beats(Hand other) {
            return other == SPOCK || other == PAPER;
        }
    },
    SPOCK {
        @Override
        public boolean beats(Hand other) {
            return other == SCISSORS || other == ROCK;
        }
    };

    public abstract boolean beats(Hand other);
}
