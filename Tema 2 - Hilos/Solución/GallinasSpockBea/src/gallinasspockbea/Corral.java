/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallinasspockbea;

/**
 *
 * @author Usuario
 */
public class Corral {

    public Casilla corral[][] = new Casilla[4][4];

    public Corral() {
        for (int i = 0; i < corral.length; i++) {
            for (int j = 0; j < corral[0].length; j++) {
                corral[i][j] = new Casilla();
            }
        }
    }
    
  

    public  void imprimirMatriz() {
        for (int i = 0; i < corral.length; i++) {
            for (int j = 0; j < corral[0].length; j++) {
                System.out.print(corral[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public void ponerHuevo(int posi, int posj) {
        this.corral[posi][posj].ponerHuevo();
    }

}
