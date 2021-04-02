
package t2ej4;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Guille
 */
public class Numero extends Thread{
    
    private String cad;
    private int num;
    private static JTextArea txtA;
    private static JTextField txt;

    public Numero() {
    }

    public Numero(String cad) {
        this.cad = cad;
    }
    
    public Numero(JTextArea txtA, JTextField txt){
        this.cad = txtA.getText();
        this.txt = txt;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    

    @Override
    public void run(){
        
        String str = this.getCad();
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                this.num++;
            }
        }
        txt.setText(String.valueOf(num));
        System.out.println("Hay un total de "+this.getNum()+" numeros");
        
    }
    
    
    
}
