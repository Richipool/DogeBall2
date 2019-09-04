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
public class Raqueta {

    private int x;
    private int y;
    private int maxX=610;
    private int maxY=655;
    private int minX=50;
    private int minY=50;
    int alto = 28;
    int ancho = 120;
    int velocidad = 40;

    public Raqueta() {
        x = 290;
        y = 50;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public void setMinX(int minX) {
        this.minX = minX;
    }

    public void setMinY(int minY) {
        this.minY = minY;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 120, 28);
    }

    public void Mover(int flecha) {//recibe un int que es el que indica la direccion de la flecha
        switch (flecha) {
            case 38://flecha arriba
                if (y - velocidad >= minY) {
                    y -= velocidad;
                }
                break;
            case 40://flecha abajo
                if (y + velocidad <= maxY) {
                    y += velocidad;
                }
                break;
            case 37://flecha izquierda
                if (x - velocidad >= minX) {
                    x -= velocidad;
                }
                break;
            case 39://flecha derecha
                if (x + velocidad <= maxX) {
                    x += velocidad;
                }
                break;

        }
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}
