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
    ArrayList<Bola> bolas = new ArrayList();
    public Model() {
        for(int i=0; i<cantidadBolas; i++)
            bolas.add(new Bola(Math.random()*300+200,Math.random()*300+200,-3.5,7,diametroGlobal/2));
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
    
}
