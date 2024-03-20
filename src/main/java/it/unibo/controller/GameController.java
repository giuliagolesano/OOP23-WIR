package it.unibo.controller;

public class GameController {

    private InputManager inputManager;
    private RalphController ralphController;
    private FelixController felixController;
    private BrickController brickController;
    private CollisionManager collisionManager;
    private int gamestate;


    





    public GameController() {
        inputManager = new InputManager();
        ralphController = new RalphController();
        felixController = new FelixController();
        brickController = new BrickController();
        collisionManager = new CollisionManager();
        gamestate = 0;
    }


    public int getState() {
        return this.gamestate;
    }

    public void readInput() {
        switch(inputManager.getInput()) {
            case 0:
                felixController.moveRight();
                break;
            case 1:
                felixController.moveLeft();
                break;
            case 2:
                felixController.moveDown();
                break;
            case 3:
                felixController.moveUp();
                break;
            case 4:
                felixController.fix();
                break;
            default:
                break;
        }
    }

    public void update() {
        ralphController.move();
        this.readInput();
        brickController.update();
        collisionManager.check();
    }
} 
