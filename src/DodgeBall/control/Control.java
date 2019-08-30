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
    private  Model modelo;
    private  GameJFrame FrameJuego;
    
    public Control() {
        modelo = new Model();
        FrameJuego = new GameJFrame(modelo, this);
        FrameJuego.setVisible(true);
        //vista.setControl(this);
    }
    public void jugar() throws InterruptedException{
        while(true){
            moverPelota();
            FrameJuego.getPanelJuego().repaint();
            Thread.sleep(10);
            
        }
    }
    public Model getModelo() {
        return modelo;
    }
   public void moverPelota(){
        modelo.getBola().rotar((int)(Math.random()*2));
        modelo.getBola().cambiarRegion(700,600, 0, 0);
        modelo.getBola().mover();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
