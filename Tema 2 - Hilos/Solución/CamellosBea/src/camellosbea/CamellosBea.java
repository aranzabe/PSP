/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camellosbea;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class CamellosBea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        
        //Creo los camellos
        HiloCamello ha = new HiloCamello ("Camello 1", 1);
        HiloCamello hb = new HiloCamello ("Camello 2", 2);
        HiloCamello hc = new HiloCamello ("Camello 3", 3);
        HiloCamello hd = new HiloCamello ("Camello 4", 4);
        
        //Se ejecutan 
        ha.start();
        hb.start();
        hc.start();
        hd.start();
        
        
        //Esto es para que el main espere a los hilos y ejecute lo que el tiene
        try {
            ha.join();
            hb.join();
            hc.join();
            hd.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CamellosBea.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\n PODIO CAMELLOS \n");
        for (int i = 0; i < HiloCamello.podio.length; i++) {
            System.out.print(HiloCamello.podio[i]+ "\t");
            
            
        }
        
    
       
        /*HiloCamello h = new HiloCamello();
        for (int i = 0; i < h.podio.length; i++) {
            System.out.print(h.podio[i]+"\t");
        }*/
        System.out.println("");
    }
    
    
    
    
}
