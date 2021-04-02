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
public class Recurso {

    private int valor;
    private boolean consumido;

    public Recurso() {
        this.consumido = true;
    }

    public synchronized int producirValor() {

        if (this.consumido) {
            this.valor = (int) (Math.random() * 100);
            this.consumido = false;
            System.out.println(Thread.currentThread().getName() + " produce: " + this.valor);
            notifyAll();

        } else {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }

        return this.valor;
    }

    public synchronized int consumirValor() {

        int dato = 0;

        if (!this.consumido) {
            dato = this.valor;
            this.consumido = true;
            System.out.println(Thread.currentThread().getName() + " consume: " + dato);
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        return dato;
    }
}
