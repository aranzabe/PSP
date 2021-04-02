package Hilos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Flor
 */
public class Hilo_2 extends Thread {

    //ATRIBUTOS
    private String nombre;
    private int dorsal;
    private int avance;
    private int total;
    public static Podio podio = new Podio();
    private JProgressBar pgb;
    public static ArrayList posicion = new ArrayList();

    //--------------------------------------------------------------------------
    //CONSTRUCTORES
    public Hilo_2() {
    }

    public Hilo_2(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public Hilo_2(String nombre, int dorsal, JProgressBar pgb) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.pgb = pgb;
    }

    //--------------------------------------------------------------------------
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static Podio getPodio() {
        return podio;
    }

    public static void setPodio(Podio podio) {
        Hilo_2.podio = podio;
    }

    //--------------------------------------------------------------------------
    //METODOS
    @Override
    public void run() {
        int lanzadas = 1;

        while (total < 50) {
            avance = lanzarBola();
            total += avance;

            try {

                System.out.println("El camello " + nombre + " con dorsal " + dorsal + " avanza " + avance + " posiciones. Bolas lanzadas: "
                        + lanzadas + ". TOTAL AVANZADO = " + total);

                pgb.setValue(total);

                Thread.sleep(750);
            } catch (InterruptedException ex) {

            }
            lanzadas++;

        }

        podio.incremento();

        this.addPosicion();

        if (posicion.size() == 5) {

            JOptionPane.showOptionDialog(null, "1º Posición: \t" + posicion.get(0) + "\n2º Posición: \t" + posicion.get(1)
                    + "\n3º Posición: \t" + posicion.get(2) + "\n4º Posición: \t" + posicion.get(3) + "\n5º Posición: \t" + posicion.get(4), "PODIO",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);

        }

        System.out.println("---------------- El camello " + nombre + " con dorsal " + dorsal + " ha lanzado "
                + lanzadas + " bolas y ha llegado a la meta en la posición " + podio.getValor() + ". ----------------");

    }

    /**
     * Metodo que tira la bola
     *
     * @return
     */
    private int lanzarBola() {
        int bola = (int) (Math.random() * 10) + 1;

        switch (bola) {
            case 1:
            case 2:
            case 3:
                if (crearPporcentaje() < 40) {
                    this.avance += bola;

                } else {
                    bola = 0;
                }

                break;

            case 4:
            case 5:
            case 6:
            case 7:
                if (crearPporcentaje() < 30) {
                    this.avance += bola;

                } else {
                    bola = 0;
                }

                break;

            case 8:
            case 9:
                if (crearPporcentaje() < 20) {
                    this.avance += bola;

                } else {
                    bola = 0;
                }

                break;

            case 10:
                if (crearPporcentaje() < 10) {
                    this.avance += bola;

                } else {
                    bola = 0;
                }

                break;
            default:

        }
        return bola;
    }

    private int crearPporcentaje() {
        //Creamos un num aleatorio entre 1 y 100
        int porcen = (int) (Math.random() * 100) + 1;

        return porcen;

    }
    
    private synchronized void addPosicion(){
        posicion.add(nombre);
    }

}
