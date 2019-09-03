/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DodgeBall.view;

import DodgeBall.model.Model;
import java.awt.Color;
import java.awt.Font;
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
    BufferedImage imagenBola, fondo, imagenRaqueta;

    public PanelDeJuego(Model model) {
        this.model = model;
        this.setSize(800, 800);
        imagenBola = new BufferedImage(model.getDiametroGlobal(), model.getDiametroGlobal(), BufferedImage.TYPE_INT_RGB);
        fondo = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
        imagenRaqueta = new BufferedImage(model.getRaqueta().getAncho(), model.getRaqueta().getAlto(), BufferedImage.TYPE_INT_RGB);
        try {
            imagenBola = ImageIO.read(this.getClass().getResourceAsStream("planeta.png"));
            fondo = ImageIO.read(this.getClass().getResourceAsStream("MDbwLa3.jpg"));
            imagenRaqueta = ImageIO.read(this.getClass().getResourceAsStream("raqueta2.png"));
        } catch (IOException ex) {
            Logger.getLogger(PanelDeJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void pintarFondo(Graphics g) {
        g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), null);
        g.drawOval(70, 48, 650, 650);
        Font font = new Font("Space",1,40);
        g.setFont(font);
        g.setColor(Color.white);
        g.drawString("0",600 , 40);
        
        
        
    }

    public void pintarBola(Graphics g) {
        for(int i = 0; i<model.getCantidadBolas();i++){
            int x = (int)model.getBola(i).getX();
            int y = (int)model.getBola(i).getY();
            int diametro = model.getDiametroGlobal();
            g.drawImage(imagenBola, x, y, diametro, diametro, null);
        }
    }

    public void pintarRaqueta(Graphics g) {
        int x = model.getRaqueta().getX();
        int y = model.getRaqueta().getY();
        int ancho = model.getRaqueta().getAncho();
        int alto = model.getRaqueta().getAlto();
        g.drawImage(imagenRaqueta, x, y, 120, 28, null);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintarFondo(g);
        pintarBola(g);
        pintarRaqueta(g);
    }

    public Model getModel() {
        return model;
    }

}
