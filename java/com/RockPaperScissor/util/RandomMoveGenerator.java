package com.RockPaperScissor.util;

import com.RockPaperScissor.model.Move;
import java.util.Random;

public class RandomMoveGenerator {
    /* a utility class responsible for 
     * generating a random move for the computer player
     */
    
    private static final Random random = new Random();

    /**
     * Generates a random move for the computer.
     *
     * @return a random move (ROCK, PAPER, or SCISSORS)
     */
    public static Move generateMove() {
        int pick = random.nextInt(Move.values().length);
        return Move.values()[pick];
    }
}

