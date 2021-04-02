package ejt2_cuentabanco;

/**
 *
 * @author Chema
 */
public class CuentaStatic {
    
    //atributos
    public static int cantidad;
    
    
    //constructor
    static {
        cantidad = 1000;
    }
    
    //getters y setters

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        CuentaStatic.cantidad = cantidad;
    }
    
    

}
