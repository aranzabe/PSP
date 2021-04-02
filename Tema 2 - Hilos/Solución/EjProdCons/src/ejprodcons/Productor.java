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
public class Productor extends Thread {

    Recurso r;

    public Productor(Recurso r, String nombre) {
        super(nombre);
        this.r = r;
    }

    @Override
    public void run() {

        do {
            this.r.producirValor();
        } while (true);

    }
}
