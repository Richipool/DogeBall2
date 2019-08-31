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
    int alto;
    int ancho;

    public Raqueta() {
        x = 200;
        y = 260;
        maxX = 600;
        maxY = 619;
        minX = 0;
        minY = 10;
        int alto = 43;
        int ancho = 120;
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
        return new Rectangle(x, y, 120, 43);
    }

    public void Mover(int flecha) {//recibe un entero que es el entero 
        switch (flecha) {
            case 38://flecha arriba
                if (y>=(minY+alto)) {
                    y -= 10;
                }
                break;
            case 40://flecha abajo
                if (y<=(maxY-alto)) {
                    y += 10;
                }
                break;
            case 37://flecha izquierda
                if (x>=(minX+ancho)) {
                    x -= 10;
                }
                break;
            case 39://flecha derecha
                if (x+ancho<=(maxX+ancho)) {
                    x += 10;
                }
                break;

        }
    }
}
