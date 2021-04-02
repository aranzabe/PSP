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
public class HiloImplementado implements Runnable {
    private Thread t;

    public HiloImplementado(String nombre) {
        t = new Thread(this);
        t.setName(nombre);
    }
    

    @Override
    public void run() {
        try {
            if (!this.t.getName().equals("H3")) {
                Thread.sleep(2000);
            }
            else {
                Thread.sleep(3000);
            }
        } catch (InterruptedException ex) {
        }
        System.out.println("Soy " + this.t.getName() + " acabando.");
        
    }
    
    public void start(){
        this.t.start();
    }
    
    public void join(){
        try {
            this.t.join();
        } catch (InterruptedException ex) {
        }
    }
    
}
