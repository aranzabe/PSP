
package t2ej4;

/**
 *
 * @author Guille
 */
public class Espacio extends Thread{
    
    private String cad;
    private int nEsp;

    public Espacio() {
    }

    public Espacio(String cad) {
        this.cad = cad;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public int getnEsp() {
        return nEsp;
    }

    public void setnEsp(int nEsp) {
        this.nEsp = nEsp;
    }
    
    @Override
    public void run(){
        
        String str = this.getCad();
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                this.nEsp++;
            }
        }
        System.out.println("Hay un total de "+this.getnEsp()+" espacios");
    }
}
