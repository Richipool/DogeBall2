/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DodgeBall.model;

import DogeBall.objects.Bola;
import DogeBall.objects.Raqueta;
import java.util.ArrayList;

/**
 *
 * @author GL552
 */
public class Model {

    private Bola bola;
    private Raqueta raqueta;
    private int cantidadBolas = 3;
    private int diametroGlobal = 80;
    private int score = 0;
    ArrayList<Bola> bolas = new ArrayList();

    public Model() {
        for (int i = 0; i < cantidadBolas; i++) {
            bolas.add(new Bola(Math.random() * 300 + 200, Math.random() * 300 + 200, -3.5, 7, diametroGlobal / 2));
        }
        raqueta = new Raqueta();
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
    }

    public int getScore() {
        return score;
    }

    public void cambiarMarcador() {
        for (int i = 0; i < cantidadBolas; i++) {
            if (bolas.get(i).isChoco() && (bolas.get(i).getX() > 362 && bolas.get(i).getX() < 445 || bolas.get(i).getY() > 244 && bolas.get(i).getY() < 320)) {
                score = score +1;
            }
            if(bolas.get(i).isChoco()&&(bolas.get(i).getX()>547&&bolas.get(i).getX()<600||bolas.get(i).getX()>186&&bolas.get(i).getX()<249)){
                score = score -1;
        }
    }
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
