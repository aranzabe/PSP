package ejt2_cuentabanco;

/**
 *
 * @author Chema
 */
public class Cuenta {
    
    //atributos
    public int cantidad;
    
    
    //constructor

    public Cuenta() {
    }

    public Cuenta(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //getters y setters

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

}
