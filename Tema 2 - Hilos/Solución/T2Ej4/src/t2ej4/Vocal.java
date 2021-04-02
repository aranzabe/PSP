
package t2ej4;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Guille
 */
public class Vocal extends Thread{
    
    private String cad;
    private int nVocales;
    private static JTextArea txtA;
    private static JTextField txt;

    public Vocal() {
    }

    public Vocal(String cad) {
        this.cad = cad;
    }
    
    public Vocal(JTextArea txtA, JTextField txt){
        this.cad = txtA.getText();
        this.txt = txt;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public int getnVocales() {
        return nVocales;
    }

    public void setnVocales(int nVocales) {
        this.nVocales = nVocales;
    }
    
    

    @Override
    public void run(){

        String str = this.getCad();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                this.nVocales++;
            }
           
        }
        txt.setText(String.valueOf(getnVocales()));
        System.out.println("Hay un total de "+ this.getnVocales()+" vocales");
        
        }
        
}
