package Hilos;

/**
 *
 * @author Flor
 */
public class Podio {

    private int valor = 0;

    public synchronized void incremento() {
        int aux;
        aux = valor;
        aux++;
        valor = aux;
    }

    public long getValor() {
        return valor;
    }

}
