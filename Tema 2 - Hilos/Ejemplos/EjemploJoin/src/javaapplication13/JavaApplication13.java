/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author faranzabe
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Hilo h1 = new Hilo("H1");
            Hilo h2 = new Hilo("H2");
            Hilo h3 = new Hilo("H3");
            HiloImplementado h4 = new HiloImplementado("H4");
            
            h1.start();h2.start();h3.start();h4.start();
            
            h1.join();
            h2.join();
            h4.join();
            
            
            System.out.println("Soy el main acabando");
        } catch (InterruptedException ex) {
        }
        
        
    }
    
}
