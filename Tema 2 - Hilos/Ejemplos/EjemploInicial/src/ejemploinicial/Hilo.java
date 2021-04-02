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
public class Hilo extends Thread {
    private int num;
    private Numero nObj;
    
    public Hilo(String name, int n, Numero no) {
        super(name);
        this.num = n;
        this.nObj = no;
    }

    @Override
    public void run() {
        
        if (this.getName().equals("A")){
            this.num+=4;
            this.nObj.setN(this.nObj.getN()+4);
        }
        else {
            this.num+=2;
            this.nObj.setN(this.nObj.getN()+2);
        }
        System.out.println("Soy el hilo " + this.getName() + " finalizando, para mí la variable vale: " + this.num + " la de objeto: " + this.nObj.getN());
    }
    
    
    
}
