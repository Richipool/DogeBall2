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
         raqueta = new Raqueta();
        bola.setDirecion((float)1.2);
        bola.setVelocidad((float)9.0);
    }
    public Bola getBola() {
        return bola;
    }

    public Raqueta getRaqueta() {
        return raqueta;
    }
    
}
