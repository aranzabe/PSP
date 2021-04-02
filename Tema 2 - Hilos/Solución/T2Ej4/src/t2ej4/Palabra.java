
package t2ej4;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Guille
 */
public class Palabra extends Thread{
    
    private String cad;
    private int nPal;
    private static JTextArea txtA;
    private static JTextField txt;

    public Palabra() {
    }

    public Palabra(String cad) {
        this.cad = cad;
    }
    
    public Palabra(JTextArea txtA, JTextField txt){
        this.cad = txtA.getText();
        this.txt = txt;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public int getnPal() {
        return nPal;
    }

    public void setnPal(int nPal) {
        this.nPal = nPal;
    }
    
    @Override
    public void run(){
        
        String str = this.getCad();
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                this.nPal++;
            }
        }
        txt.setText(String.valueOf(nPal+1));
        System.out.println("Hay un total de "+(this.getnPal()+1)+" palabras");
    }
}
