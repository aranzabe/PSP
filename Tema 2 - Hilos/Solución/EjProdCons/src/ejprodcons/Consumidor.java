/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejprodcons;

/**
 *
 * @author faranzabe
 */
public class Consumidor extends Thread {

    private Recurso r;

    public Consumidor(Recurso r, String nombre) {
        super(nombre);
        this.r = r;
    }

    @Override
    public void run() {

        do {
            this.r.consumirValor();
        } while (true);
    }
}
