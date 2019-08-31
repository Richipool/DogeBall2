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
    int alto = 120;
    int ancho = 20;

    public Raqueta() {
        x = 260;
        y = 200;
        maxX = 0;
        maxY = 0;
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

    /*public Rectangle getBounds() {
        return new Rectangle(x, y, 123, 43);
    }*/

}
