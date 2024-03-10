package it.unibo.core.api;

public interface GameEngine {

    void mainLoop();

    void update();

    void processInput();

    void WaitForNextFrame();
    
    void cleanup();
}

