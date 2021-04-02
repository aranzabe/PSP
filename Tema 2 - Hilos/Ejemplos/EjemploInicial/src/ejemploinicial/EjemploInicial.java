/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploinicial;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author faranzabe
 */
public class EjemploInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int numero = 10;
            Numero numObj = new Numero(0);
            
            Hilo ha = new Hilo("A", numero, numObj);
            Hilo hb = new Hilo("B", numero, numObj);
            
            ha.start();
            hb.start();
            Thread.sleep(500);
            System.out.println("Soy el hilo main finalizando. Para mí, la variable vale: " + numero);
            System.out.println("Numero obj: " + numObj.getN());
        } catch (InterruptedException ex) {
        }
    }

}
