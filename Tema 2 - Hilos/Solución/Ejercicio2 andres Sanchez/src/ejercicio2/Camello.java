package ejercicio2;

/**
 *
 * @author Andrés
 */
public class Camello {

    private String nombre;
    private int dorsal;
    private static int dorsalDisponible = 1;
    private int puntos;

    public Camello(String nombre, String dorsal, int posicion, int puntos) {
        this.nombre = nombre;
        this.dorsal = dorsalDisponible;
        dorsalDisponible++;
        this.puntos = puntos;
    }

    public Camello() {
    }

    public Camello(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    @Override
    public String toString() {
        return "Camello{" + "nombre=" + nombre + ", dorsal=" + dorsal + ", puntos=" + puntos + '}';
    }

    

}
