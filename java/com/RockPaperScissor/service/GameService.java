package com.RockPaperScissor.service;

import com.RockPaperScissor.model.Move;
import com.RockPaperScissor.util.RandomMoveGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private static final Logger logger = LoggerFactory.getLogger(GameService.class);

    /**
     * Plays a game of Rock-Paper-Scissors and determines the winner.
     * 
     * @param playerMove the move made by the player
     * @return the result of the game ("Player wins!", "Computer wins!", or "It is a tie!")
     */
    public String playGame(Move playerMove) {
        // Generate the computer's move randomly
        Move computerMove = RandomMoveGenerator.generateMove();
        
        // Log both moves
        logger.info("Player move: {}, Computer move: {}", playerMove, computerMove);

        // Determine the result of the game based on the rules
        if (playerMove == computerMove) {
            return "It is a tie!";
        } else if ((playerMove == Move.ROCK && computerMove == Move.SCISSORS) ||
                   (playerMove == Move.SCISSORS && computerMove == Move.PAPER) ||
                   (playerMove == Move.PAPER && computerMove == Move.ROCK)) {
            return "Player wins!";
        } else {
            return "Computer wins!";
        }
    }
}
