package ejt2_cuentabanco;


/**
 *
 * @author Chema
 */
public class RetiradaS extends Thread {

    final int REP = 10;
    

    //metodos
   public void retiro(){
       int cant, aux, n = (int) (Math.random() * 100);
       cant = CuentaStatic.getCantidad();
       CuentaStatic.setCantidad(cant-n);
       
       aux = CuentaStatic.getCantidad();
       System.out.println("-- Se han retirado " +n+ " Euros y quedan " +aux+ " Euros");
   }
    
    //run

    @Override
    public void run() {
        
        for (int i = 0; i < REP; i++) {
            
            try {
                retiro();
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
            
        }
        
    }
   
   
}
