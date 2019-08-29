/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DodgeBall.view;

import DodgeBall.model.Model;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
 *
 * @author GL552
 */
public class PanelDeJuego extends JPanel {
    private Model model;
    BufferedImage imagenBola, fondo;

    public PanelDeJuego(Model model) {
        this.model = model;
        imagenBola = new BufferedImage(model.getBola().getDiametro(),model.getBola().getDiametro() ,BufferedImage.TYPE_INT_RGB );
        fondo = new BufferedImage(800,700, BufferedImage.TYPE_INT_RGB);
        try{
            imagenBola = ImageIO.read(this.getClass().getResourceAsStream("planeta.png"));
            fondo = ImageIO.read(this.getClass().getResourceAsStream("MDbwLa3.jpg"));
        }catch(IOException ex){
            Logger.getLogger(PanelDeJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void pintarFondo(Graphics g){
        g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), null);
    }
//    public void redibujarBola(int x, int y){
//        model.getBola().setX(x);
//        model.getBola().se
//        
//    }
    public void pintarBola(Graphics g){
        int x = model.getBola().getX();
        int y = model.getBola().getY();
        int diametro = model.getBola().getDiametro();
        g.drawImage(imagenBola, x, y, diametro, diametro, null);
    }
   @Override
   public void paintComponent(Graphics g){
       super.paintComponent(g);
       pintarFondo(g);
       pintarBola(g);
   }

    public Model getModel() {
        return model;
    }
   
}
