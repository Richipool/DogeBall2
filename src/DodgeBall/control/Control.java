/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DodgeBall.control;

import DodgeBall.model.Model;
import DodgeBall.view.GameJFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author GL552
 */
public class Control extends JFrame implements KeyListener, Runnable {

    private Model modelo;
    private GameJFrame FrameJuego;

    public Control() throws InterruptedException {
        modelo = new Model();
        FrameJuego = new GameJFrame(modelo, this);
        FrameJuego.setVisible(true);
        FrameJuego.setControl(this);
        FrameJuego.jugar();
    }


    public Model getModelo() {
        return modelo;
    }
//
//    public void moverPelota() {
//        for(int i = 0; i<modelo.getCantidadBolas();i++)
//            modelo.getBola(i).mover(modelo.getRaqueta());
//    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }
//    
    @Override
    public void keyPressed(KeyEvent e) {
        int tecla=e.getKeyCode();
        modelo.getRaqueta().Mover(tecla);
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void run() {
    }

}
