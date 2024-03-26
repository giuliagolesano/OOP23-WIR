package it.unibo.core.impl;

import it.unibo.core.api.GameEngine;
import it.unibo.controller.GameController;
import it.unibo.utilities.GameState;




public class GameEngineImpl implements GameEngine {

    //period to update the game
    private int period;
    private GameController gameController;

    public GameEngineImpl() {
        period = 10;
        gameController = new GameController();
    }

    @Override
    //the main loop of the game, every period the game is updated and drawn
    public void mainLoop() {
        long current=System.currentTimeMillis();
        while(System.currentTimeMillis() - current < this.period){
            this.update();
            this.draw();
        }

    }

    public void draw() {
        switch(GameState.getGameState()) {
            case HOME:
                //draw preview
                break;
            case PLAYING:
                //draw settingsview
                break;
            case PAUSED:
                //draw game
                break;
            case GAMEOVER:
                //draw pause
                break;
            case SETTINGS:
                //draw endgame
                break;
            default:
                break;
        }
    }


    @Override
    public void update() {
        gameController.update();
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
