package ejt2_cuentabanco;

/**
 * Simular una cuenta bancaria con dos hilos. Uno simulará el ingreso y el otro
 * la extracción de dinero de la cuenta. La cuenta tendrá un capital inicial.
 * Realizar 10 ingresos y 5 extracciones
 *
 * @author Chema
 */
public class EjT2_CuentaBanco {

    public static void main(String[] args) {

        //Opción A)
//        Cuenta cu = new Cuenta(1000);
//        
//        Retirada re = new Retirada(cu);
//        Ingreso in = new Ingreso(cu); 
        //Opción B)
        CuentaStatic.setCantidad(1000);
        RetiradaS re = new RetiradaS();
        RetiradaS re2 = new RetiradaS();
        RetiradaS re3 = new RetiradaS();
        RetiradaS re4 = new RetiradaS();
        IngresoS in = new IngresoS();
        IngresoS in2 = new IngresoS();
        IngresoS in3 = new IngresoS();
        IngresoS in4 = new IngresoS();

        re.start();
        in.start();
        re2.start();
        in2.start();
        re3.start();
        in3.start();
        re4.start();
        in4.start();

    }

}
