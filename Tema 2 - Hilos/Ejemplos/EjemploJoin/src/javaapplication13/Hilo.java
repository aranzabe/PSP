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
public class Hilo extends Thread {

    public Hilo(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            if (!this.getName().equals("H3")) {
                Thread.sleep(2000);
            }
            else {
                Thread.sleep(3000);
            }
        } catch (InterruptedException ex) {
        }
        System.out.println("Soy " + this.getName() + " acabando.");
    }

}
