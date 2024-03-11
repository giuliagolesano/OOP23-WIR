package it.unibo.core.impl;

import it.unibo.core.api.GameEngine;
import it.unibo.controller.GameController;
import it.unibo.controller.InputManager;




public class GameEngineImpl implements GameEngine {

    //period to update the game
    private int period;
    private GameController gameController;
    private InputManager inputManager;

    public GameEngineImpl() {
        period = 10;
        gameController = new GameController();
        inputManager = new InputManager();
    }

    @Override
    public void mainLoop() {
        long current=System.currentTimeMillis();
        while(System.currentTimeMillis() - current < this.period){
            this.update();
            this.draw();
        }

    }

    public void draw() {
        int gamestate = gameController.getState();
        switch(gamestate) {
            case 0:
                //draw game
                break;
            case 1:
                //draw game over
                break;
            case 2:
                //draw game win
                break;
            default:
                break;
        }
    }


    @Override
    public void update() {
        switch(inputManager.getInput()) {
            case "UP":
                gameController.moveUp();
                break;
            case "DOWN":
                gameController.moveDown();
                break;
            case "LEFT":
                gameController.moveLeft();
                break;
            case "RIGHT":
                gameController.moveRight();
                break;
            case "SPACE":
                gameController.fix();
                break;
            default:
                break;
        
        };

        
    }



    @Override
    public void cleanup() {
        // TODO Auto-generated method stub
        
    }


   
    @Override
    public void WaitForNextFrame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'WaitForNextFrame'");
    }
}
