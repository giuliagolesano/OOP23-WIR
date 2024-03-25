package it.unibo.controller.input;


import java.awt.event.*;

import it.unibo.utilities.Constaints.Movements;

public class KeyboardInput implements KeyListener{

    public boolean up, down, right, left, fix;

    @Override
    public void keyTyped(KeyEvent e) {
       }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int keyCode = e.getKeyCode();
        this.setBooleanValues(true, keyCode);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        int keyCode = e.getKeyCode();
        this.setBooleanValues(false, keyCode);

    }

    private void setBooleanValues(boolean b, int KeyCode){
        switch (KeyCode) {
            //W 
            case Movements.UP:
                up = b;
                break;
            //FRECCIA SU
            case Movements.UP_ARROW:
                up = b;
                break;
            //A
            case Movements.LEFT:
                left = b;
                break;
            //FRECCIA SINISTRA
            case Movements.LEFT_ARROW:
                left = b;
                break;
            //S
            case Movements.DOWN:
                down = b;
                break;
            //FRECCIA GIU
            case Movements.DOWN_ARROW:
                down = b;
                break;
            //D
            case Movements.RIGHT:
                right = b;
                break;
            //FRECCIA DESTRA
            case Movements.RIGHT_ARROW:
                right = b;
                break;
            //T
            case Movements.FIX:
                fix = b;
                break;
            default:
                break;
        }
    }
    
}
