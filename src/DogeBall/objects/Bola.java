/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DogeBall.objects;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Richard
 */
public class Bola {

    private int x;
    private int y;
    private int maxX;
    private int maxY;
    private int minX;
    private int minY;
    
    private int diametro;
    private int radio;
    private float direccion;
    private float velocidad;

    
    /**
     * @return the diametro
     */
    public int getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * @return the direcion
     */
    public float getDirecion() {
        return direccion;
    }

    /**
     * @param direcion the direcion to set
     */
    public void setDirecion(float direcion) {
        this.direccion = direcion;
    }

    /**
     * @return the velocidad
     */
    public float getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    public Bola(int x, int y, int maxX, int maxY, int minX, int minY, int diametro, int radio, float direcion, float velocidad, Color mColor) {
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
        this.minX = minX;
        this.minY = minY;
        this.diametro = diametro;
        this.radio = radio;
        this.direccion = direcion;
        this.velocidad = velocidad;
    }
    
    public Bola() {
        x=360;
        y=300;
        maxX = 0;
        maxY = 0;
        minX = 0;
        minX = 0;
        diametro = 80;
        radio = 0;
        direccion =0.0f;
        velocidad = 14.0f;
    }
    public void cambiarRegion(int maxX, int maxY, int minX, int minY){
        this.maxX = maxX;
        this.maxY = maxY;
        this.minX = minX;
        this.minY = minY;
    }
    public void rotar(int grados){
        direccion += (double)(grados*Math.PI/180);
    }
    public void mover(){
        int auxDeX = x;
        int auxDeY = y;
        x += (int)(Math.cos(direccion)*velocidad);
        y += (int)(Math.sin(direccion)*velocidad);
        if(x>=(maxX-radio)||x<=(minX+radio)){
            direccion = (float)(Math.PI-direccion);
            x = auxDeX + (int)(Math.cos(direccion)*velocidad);
            y = auxDeY + (int)(Math.sin(direccion)*velocidad);
        }
        if(y>=(maxY-radio)||y<=(minY+radio)){
            direccion = (float)(2 * Math.PI-direccion);
            x = auxDeX + (int)(Math.cos(direccion)*velocidad);
            y = auxDeY + (int)(Math.sin(direccion)*velocidad);
        }
    }           
}
