/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallinasspockbea;

/**
 *
 * @author faranzabe
 */
public class Casilla {
    private int huevos;
    
    public synchronized void ponerHuevo(){
        huevos++;
        System.out.println("Soy la gallina: "+Thread.currentThread().getName()+" y acabo de poner un huevo en la posicion ");

    }
}
