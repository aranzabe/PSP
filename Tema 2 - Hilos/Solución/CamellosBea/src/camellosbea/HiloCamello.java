/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camellosbea;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class HiloCamello extends Thread{
    
    
    /**
     * VARIABLES
     * @NOMBRE nombre del camello
     * @DORSAL numero de dorsal del camello
     * @GANADOR variable estatica inicializada a 0 para ir aumentando la posicion del podio
     * @podio contiene el podio de los camellos
     */
    private String nombre;
    private int dorsal;
    private boolean continuar = true;
    private static int ganador = 0;
    public static  int podio [] = new int [4];

    
    public HiloCamello(){
        
    }
    public HiloCamello(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
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

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    
    private synchronized void podio(){
        podio[ganador] = this.getDorsal();//Asignamos el camello en su posicion del podio
        ganador++;//sumamos uno para que vaya aumentando en el array del podio
        System.out.println(this.getNombre()+" con dorsal: "+this.getDorsal()+ " ha llegado a la meta!!!!!");   
    }
    
  

    @Override
    public void run() {
        int pos = 0;
        int avance;
        while (continuar){
            //Creamos el porcentaje 
             avance = (int) Math.floor(Math.random()*100+1);
             //System.out.println("Avance"+ avance);
            
            if( avance < 40){//Si el avance es menor a 40 
                if(pos < 3){//y la posicion menor a 3
                   pos++;//aumentamos posicion
                
                   System.out.println(this.getNombre()+ " en posicion: "+pos);
                   
                }
            }
            if(avance < 30){//Si el avance es menor a 30
                if(pos < 7){//Y la posicion menor a 7
                    pos++;//aumentamos posicion
                   
                   System.out.println(this.getNombre()+ " en posicion: "+pos);
                   
                }
            }
            if(avance < 20){//Si el avance es menor a 20
                if(pos <9){//y la posicion menor a 9
                    pos ++;//aumentamos posicion
                   
                    System.out.println(this.getNombre()+ " en posicion: "+pos);
                    
                }
            }
            if(avance < 10){//Si el avance es menor a 10
                if(pos <10){//Y la posicion menor a 10
                   
                    pos++;//Aumentamos posicion
                   
                    System.out.println(this.getNombre()+ " en posicion: "+pos);
                    
                  
                }
                if(pos == 10){
                    podio();
                    continuar = false;
                }
            }
            
        }
        
    }
    
    
    
}
