/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DodgeBall.model;

import java.awt.Rectangle;

/**
 *
 * @author Richard
 */
public class Raqueta {

    private int x;
    private int y;
    /*valores por defecto de los limites del ciruculo de juego 
    para que la raqueta no sobrepase del limite*/
    private int maxX;
    private int maxY;
    private int minX;
    private int minY;
    /*tamanio de la raqueta*/
    int alto;
    int ancho;
    int velocidad;

    public Raqueta() {
        maxX = 610;
        maxY = 655;
        minX = 50;
        minY = 50;
        /*tamanio de la raqueta*/
        alto = 28;
        ancho = 120;
        velocidad = 40;
        x = 290;
        y = 500;
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
