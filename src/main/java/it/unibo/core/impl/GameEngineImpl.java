package it.unibo.core.impl;

import it.unibo.core.api.GameEngine;
import it.unibo.controller.GameController;
import it.unibo.controller.InputManager;



public class GameEngineImpl implements GameEngine {

    //period to update the game
    private int period;
    private GameController gameController;
    private InputManager inputManager;




    @Override
    public void GameEngineImpl() {
        period = 10;
        gameController = new GameController();
        inputManager = new InputManager();
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void cleanup() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mainLoop() {
        
        
    }

    @Override
    public void processInput() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processInput'");
    }

    @Override
    public void WaitForNextFrame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'WaitForNextFrame'");
    }
}
```