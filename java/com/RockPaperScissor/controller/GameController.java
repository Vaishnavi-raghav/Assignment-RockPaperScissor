package com.RockPaperScissor.controller;

import com.RockPaperScissor.model.Move;
import com.RockPaperScissor.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "Rock Paper Scissors Game")
public class GameController {

    @Autowired
    private GameService gameService;

    @ApiOperation(value = "Play Rock Paper Scissors")
    @GetMapping("/play")
    public String playGame(@RequestParam("move") String playerMove) {
        try {
            Move move = Move.valueOf(playerMove.toUpperCase());
            return gameService.playGame(move);
        } catch (IllegalArgumentException e) {
            return "Invalid move: " + playerMove + ". Valid moves are ROCK, PAPER, SCISSORS.";
        }
    }
}

