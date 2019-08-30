/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DodgeBall.model;

import DogeBall.objects.Bola;
import DogeBall.objects.Raqueta;

/**
 *
 * @author GL552
 */
public class Model {
    private Bola bola;
    private Raqueta raqueta;
    public Model() {
        bola = new Bola();
        bola.setDirecion((float)1.2);
        bola.setVelocidad((float)10.0);
        raqueta = new Raqueta();
    }
    public Bola getBola() {
        return bola;
    }

    public Raqueta getRaqueta() {
        return raqueta;
    }
    
}
