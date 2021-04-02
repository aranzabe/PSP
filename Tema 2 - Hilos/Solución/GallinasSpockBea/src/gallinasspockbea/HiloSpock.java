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
public class HiloSpock extends Thread {
      
    Corral corral;

    public HiloSpock (Corral corral){
        this.corral = corral;
       
    }
    private void esperar(){
        try {
            //int random = (int)(Math.random()*(30-15+1)+15);//Aleatorio entre 15 y 30
            int random = (int)(Math.random()*(5-1+1)+1);
            Thread.sleep(random* 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloSpock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run() {
        int posi, posj, random;
        boolean continuar = true;
        int cont = 0;

        while(continuar){
            esperar();
            random = (int) ((Math.random()*100)+1);//generamos la probabilidad
            
            if(random <= 2){
                continuar = false;//detenemos el hilo
                System.out.println(this.getName()+" ha muerto :((((((");
            }else{//ponemos el huevo
                    posi = (int) Math.floor(Math.random()*4);  // Valor entre M y N, ambos incluidos.
                    posj = (int) Math.floor(Math.random()*4);  // Valor entre M y N, ambos incluidos.
                    ponerHuevo(posi, posj);
                    cont++;
            }
        }
        System.out.println(this.getName()+" ha puesto un TOTAL de huevos: "+cont);
    }
    /**
     * Metodo sincronizado para que no entren 2 gallinas en la misma casilla 
     * @param posi
     * @param posj 
     */
    private void ponerHuevo (int posi, int posj){
        corral.ponerHuevo(posi, posj);
    }
    
    
}
