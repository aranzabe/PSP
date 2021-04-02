/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallinasspockbea;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class GallinasSpockBea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int gallina = 5;
       Corral c = new Corral();
       
        //Arrays para ingresos y extracciones
        HiloSpock gallinas[] = new HiloSpock[gallina];
        
        

        //CREO INGRESOS
        for (int i = 0; i < gallina; i++) {
           gallinas[i] = new HiloSpock(c);
        }
        
       
        
        //ARRANCO LOS HILOS
        for (int i = 0; i < gallina; i++) {
            gallinas[i].start();
        }

        //ARRANCO LOS HILOS
        for (int i = 0; i < gallina; i++) {
           try {
               gallinas[i].join();
           } catch (InterruptedException ex) {
               Logger.getLogger(GallinasSpockBea.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
       
       
      
        c.imprimirMatriz();
        
    }
    
}
