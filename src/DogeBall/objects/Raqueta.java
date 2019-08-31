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
    private int maxX;
    private int maxY;
    private int minX;
    private int minY;
    int alto = 28;
    int ancho = 120;
    int velocidad = 50;

    public Raqueta() {
        x = 200;
        y = 260;
        maxX = 800;
        maxY = 700;
        minX = 0;
        minY = 0;
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

    public void Mover(int flecha) {//recibe un entero que es el entero 
        switch (flecha) {
            case 38://flecha arriba
                if (y-velocidad >= minY ) {
                    y -= velocidad;
                }
                break;
            case 40://flecha abajo
                if (y+velocidad <= maxY-alto*2) {
                    y += velocidad;
                }
                break;
            case 37://flecha izquierda
                if (x-velocidad >= minX) {
                    x -= velocidad;
                }
                break;
            case 39://flecha derecha
                if (x+velocidad <= maxX-ancho ) {
                    x += velocidad;
                }
                break;

        }
    }
}
