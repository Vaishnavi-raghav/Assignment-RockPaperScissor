package com.RockPaperScissor;

import com.RockPaperScissor.controller.GameController;
import com.RockPaperScissor.model.Move;
import com.RockPaperScissor.service.GameService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GameControllerTest {

    @Mock
    private GameService gameService;

    @InjectMocks
    private GameController gameController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPlayGame_PlayerWins() {
        when(gameService.playGame(Move.ROCK)).thenReturn("Player wins!");
        assertEquals("Player wins!", gameController.playGame("ROCK"));
    }

    @Test
    public void testPlayGame_ComputerWins() {
        when(gameService.playGame(Move.PAPER)).thenReturn("Computer wins!");
        assertEquals("Computer wins!", gameController.playGame("PAPER"));
    }

    @Test
    public void testPlayGame_Tie() {
        when(gameService.playGame(Move.SCISSORS)).thenReturn("It is a tie!");
        assertEquals("It is a tie!", gameController.playGame("SCISSORS"));
    }

    @Test
    public void testPlayGame_InvalidMove() {
        assertEquals("Invalid move: LIZARD. Valid moves are ROCK, PAPER, SCISSORS.", gameController.playGame("LIZARD"));
    }
}
