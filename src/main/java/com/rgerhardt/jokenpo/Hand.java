package com.rgerhardt.jokenpo;

public enum  Hand {
    ROCK {
        @Override
        public boolean beats(Hand other) {
            return other == SCISSORS;
        }
    },
    PAPER {
        @Override
        public boolean beats(Hand other) {
            return other == ROCK;
        }
    },
    SCISSORS {
        @Override
        public boolean beats(Hand other) {
            return other == PAPER;
        }
    };

    public abstract boolean beats(Hand other);
}
