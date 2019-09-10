/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DodgeBall.model;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author GL552
 */
public class Model extends Observable {

    //private Bola bola;
    private Raqueta raqueta;
    private int cantidadBolas;
    private int diametroGlobal;
    private int score;
    ArrayList<Bola> bolas = new ArrayList();

    public Model() {
        cantidadBolas = 1;
        score = 0;
        diametroGlobal = 60;
        raqueta = new Raqueta();
        bolas = new ArrayList();
        this.agregarBolas(cantidadBolas);
    }

    public Bola getBola(int i) {
        return bolas.get(i);
    }

    public Raqueta getRaqueta() {
        return raqueta;
    }

    public void setCantidadBolas(int cantidadBolas) {
        this.cantidadBolas = cantidadBolas;
    }

    public int getDiametroGlobal() {
        return diametroGlobal;
    }

    public int getCantidadBolas() {
        return cantidadBolas;
    }

    public void mover() {
        for (int i = 0; i < cantidadBolas; i++) {
            bolas.get(i).mover(raqueta);
        }
        setChanged();
        notifyObservers();
    }

    public int getScore() {
        return score;
    }

    public boolean cambiarMarcador() {
        for (int i = 0; i < cantidadBolas; i++) {
            if (bolas.get(i).isChoco() && (bolas.get(i).getX() > 270 && bolas.get(i).getX() < 390 || bolas.get(i).getY() > 290 && bolas.get(i).getY() < 430)) {
                score = score + 1;
                setChanged();
                notifyObservers();
                return true;
            }
            if (bolas.get(i).isChoco() && (bolas.get(i).getX() > 530 && bolas.get(i).getX() < 615 || bolas.get(i).getX() > 50 && bolas.get(i).getX() < 130)) {
                score = score - 1;
                setChanged();
                notifyObservers();
                return false;
            }
        }

        return true;
    }

    public void agregarBolas(int cantBolas) {
        int cantAux = cantidadBolas;
        cantidadBolas = cantBolas;
        for (int i = cantAux; i <= cantidadBolas; i++) {
            bolas.add(new Bola(Math.random() * 300 + 200, Math.random() * 300 + 200, -1.5, 4, diametroGlobal / 2));
        }
        setChanged();
        notifyObservers();
    }

    public void cambiarVelocidad(int velocidad) {
        for (int i = 0; i < cantidadBolas; i++) {
            bolas.get(i).setDy(velocidad);
            bolas.get(i).setDx(velocidad);
            bolas.get(i).setVelocida(velocidad);
        }
        setChanged();
        notifyObservers();
    }

    public void pausa() {
        for (int i = 0; i < cantidadBolas; i++) {
            bolas.get(i).setDx(0);
            bolas.get(i).setDy(0);
            score = 0;
        }
        setChanged();
        notifyObservers();
    }

    /*
    public void setMarcador() {

        bolas.stream().forEach((i) -> {
            if (i.getChoco() && (i.x > 362 && i.x < 445  i.y > 244 && i.y < 320)) {
                sonido.play();
                System.out.println("Choco---> " + i.getChoco());
                setMarcador(1);
            }
            if (i.getChoco() && (i.x > 547 && i.x < 600  i.x > 186 && i.x < 249)) {
                sonido.play();
                System.out.println("Choco---> " + i.getChoco());
                setMarcador(-1);
            }

        });

    }

     */
}
