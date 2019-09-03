/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DogeBall.objects;


import java.awt.Rectangle;

/**
 *
 * @author Richard
 */
public class Bola {

    private double x;
    private double y;
    private double dx;
    private double dy;
    private int radio;
    private int diametro;
    private double velocida;
    private boolean choco = false;

    public Bola(double x, double y, double dx, double dy, int radio) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.radio = radio;
        diametro = radio * 2;
        velocida = dy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getRadio() {
        return radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, diametro, diametro);
    }

    public boolean isChoco() {
        return choco;
    }
    
    

    public void mover(Raqueta raqueta) {
        x += dx;
        y += dy;
        double dX = x - 350;
        double dY = y - 350;
        if (Math.sqrt(dX * dX + dY * dY) >= 350 - radio) {
            choco = true;
            double v = Math.sqrt(dx * dx + dy * dy);
            double agleToCollisionPoint = Math.atan2(-dY, dX);
            double oldAngle = Math.atan2(-dy, dx);
            double newAngle = 2 * agleToCollisionPoint - oldAngle;
            dx = -v * Math.cos(newAngle);
            dy = v * Math.sin(newAngle);
        }
        
        
        if (raqueta.getBounds().intersects(getBounds()) || getBounds().intersects(raqueta.getBounds())) {
            if (y < raqueta.getY() && x < raqueta.getX()) {              
                  dx = -velocida;
                  dy = -velocida;
            }
            if (y < raqueta.getY() && x > raqueta.getX()) {
                  dy = -velocida;
                  dx = velocida;
            }
            if (y > raqueta.getY() && x < raqueta.getX()) {
                  dx = -velocida;
            }
            if(y > raqueta.getY() && x > raqueta.getX()){
                dy = velocida;
                dx = -velocida;
        }

    }
        
   }
    
}
