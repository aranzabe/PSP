
package ejercicio2;

/**
 *
 * @author Andrés
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo ca = new Hilo ("Camello1");
        Hilo cb = new Hilo ("Camello2");
        Hilo cc = new Hilo ("Camello3");
        Hilo cd = new Hilo ("Camello4");
        int contador=0;
        
        ca.start();
        cb.start();
        cc.start();
        cd.start();
        
        
        
    }
    
}
