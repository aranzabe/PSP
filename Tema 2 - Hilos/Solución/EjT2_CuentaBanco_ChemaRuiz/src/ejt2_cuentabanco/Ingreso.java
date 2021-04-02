package ejt2_cuentabanco;

/**
 *
 * @author Chema
 */
public class Ingreso extends Thread{

    final int REP = 10;
    
    //atributos
    public Cuenta cu;

    //constructor
    public Ingreso() {
    }
    
     public Ingreso(Cuenta cu) {
         this.cu = cu;
    }

     //getters and setters
    public Cuenta getCu() {
        return cu;
    }

    public void setCu(Cuenta cu) {
        this.cu = cu;
    }

    //metodos
     public synchronized void ingres(){
       int cant, aux, n = (int) (Math.random() * 100);
       cant = cu.getCantidad();
       cu.setCantidad(cant+n);
       
       aux = cu.getCantidad();
       System.out.println("++ Se han ingresado " +n+ " Euros y quedan " +aux+ " Euros");
   }
    
    //run
    @Override
    public void run() {
         for (int i = 0; i < REP; i++) {
            
            try {
                ingres();
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
            
        }
    }
    
    
    
    
    
}
