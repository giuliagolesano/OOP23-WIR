package it.unibo.core.impl;

import it.unibo.core.api.GameEngine;
import it.unibo.controller.GameController;




public class GameEngineImpl implements GameEngine {

    //period to update the game
    private int period;
    private GameController gameController;

    public GameEngineImpl() {
        period = 10;
        gameController = new GameController();
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
                //draw preview
                break;
            case 1:
                //draw settingsview
                break;
            case 2:
                //draw game
                break;
            case 3:
                //draw pause
                break;
            case 4:
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
