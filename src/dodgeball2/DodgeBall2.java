/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodgeball2;

import DodgeBall.control.Control;
/**
 *
 * @author GL552
 */
public class DodgeBall2 {
    private static Control control;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        control = new Control();
   
        control.jugar();
        // TODO code application logic here
        /*Cambiar la clase bola porque hay cosas que tienen que estar definidas ya estaticas y tambien probar lo del frame XD
        */
    }

}
