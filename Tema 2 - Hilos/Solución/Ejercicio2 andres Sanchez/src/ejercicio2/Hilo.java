package ejercicio2;

/**
 *
 * @author Andrés
 */
public class Hilo extends Thread {

    Camello camello;

    public Hilo(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        int hoyo;
        double porcentaje;
        double posicion;
        try {

            camello = new Camello(this.getName());
            porcentaje = Math.floor(Math.random() * (1 - 100) + 100);
            hoyo = (int) porcentaje;

            do {
                if (hoyo > 49 && hoyo <= 59) {//50%
                    posicion = Math.floor(Math.random() * (1 - 3) + 3);
                    if (posicion == 1) {
                        this.camello.setPuntos(this.camello.getPuntos() + 1);
                        System.out.println("");
                        System.out.println("Se ha añadido 1 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    } else {
                        this.camello.setPuntos(this.camello.getPuntos() + 2);
                        System.out.println("");
                        System.out.println("Se ha añadido 2 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    }
                    //
                }

                if (hoyo > 59 && hoyo <= 69) {//60%
                    posicion = Math.floor(Math.random() * (1 - 3) + 3);
                    if (posicion == 1) {
                        this.camello.setPuntos(this.camello.getPuntos() + 1);
                        System.out.println("");
                        System.out.println("Se ha añadido 1 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    } else {
                        this.camello.setPuntos(this.camello.getPuntos() + 2);
                        System.out.println("");
                        System.out.println("Se ha añadido 2 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    }
                    //
                }

                if (hoyo > 69 && hoyo <= 79) {//70%
                    posicion = Math.floor(Math.random() * (1 - 3) + 3);
                    if (posicion == 1) {
                        this.camello.setPuntos(this.camello.getPuntos() + 1);
                        System.out.println("Se ha añadido 1 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                    } else {
                        this.camello.setPuntos(this.camello.getPuntos() + 2);
                        System.out.println("Se ha añadido 2 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                    }
                    //
                }

                if (hoyo > 79 && hoyo <= 89) {//80%
                    posicion = Math.floor(Math.random() * (1 - 3) + 3);
                    if (posicion == 1) {
                        this.camello.setPuntos(this.camello.getPuntos() + 1);
                        System.out.println("");
                        System.out.println("Se ha añadido 1 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    } else {
                        this.camello.setPuntos(this.camello.getPuntos() + 2);
                        System.out.println("");
                        System.out.println("Se ha añadido 2 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    }

                }
                //

                if (hoyo > 89 && hoyo <= 99) {//90%
                    posicion = Math.floor(Math.random() * (1 - 3) + 3);
                    if (posicion == 1) {
                        this.camello.setPuntos(this.camello.getPuntos() + 1);
                        System.out.println("");
                        System.out.println("Se ha añadido 1 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    } else {
                        this.camello.setPuntos(this.camello.getPuntos() + 2);
                        System.out.println("");
                        System.out.println("Se ha añadido 2 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    }

                }
                //

                if (hoyo > 39 && hoyo <= 49) {//40%
                    posicion = Math.floor(Math.random() * (1 - 3) + 3);
                    if (posicion == 1) {
                        this.camello.setPuntos(this.camello.getPuntos() + 1);
                        System.out.println("");
                        System.out.println("Se ha añadido 1 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    } else {
                        this.camello.setPuntos(this.camello.getPuntos() + 2);
                        System.out.println("");
                        System.out.println("Se ha añadido 2 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    }

                }
                //

                if (hoyo > 29 && hoyo <= 39) {//30%
                    posicion = Math.floor(Math.random() * (4 - 7) + 7);
                    if (posicion == 4) {
                        this.camello.setPuntos(this.camello.getPuntos() + 4);
                        System.out.println("");
                        System.out.println("Se ha añadido 4 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    }
                    if (posicion == 5) {
                        this.camello.setPuntos(this.camello.getPuntos() + 5);
                        System.out.println("");
                        System.out.println("Se ha añadido 5 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    }
                    if (posicion == 6) {
                        this.camello.setPuntos(this.camello.getPuntos() + 6);
                        System.out.println("");
                        System.out.println("Se ha añadido 6 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    } else {
                        this.camello.setPuntos(this.camello.getPuntos() + 7);
                        System.out.println("");
                        System.out.println("Se ha añadido 7 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    }
                }
                //
                if (hoyo > 19 && hoyo <= 29) {//20%
                    posicion = Math.floor(Math.random() * (8 - 9) + 9);
                    if (posicion == 8) {
                        this.camello.setPuntos(this.camello.getPuntos() + 8);
                        System.out.println("");
                        System.out.println("Se ha añadido 8 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    } else {
                        System.out.println("");
                        this.camello.setPuntos(this.camello.getPuntos() + 9);
                        System.out.println("Se ha añadido 9 punto al camello " + this.getName());
                        System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                        System.out.println("");
                    }
                }
                //
                if (hoyo > 0 && hoyo <= 19) {//10%
                    this.camello.setPuntos(this.camello.getPuntos() + 10);
                    System.out.println("");
                    System.out.println("Se ha añadido 10 punto al camello " + this.getName());
                    System.out.println("El camello " + this.getName() + " tiene actualmente " + camello.getPuntos());
                    System.out.println("");
                }
                //
            } while (camello.getPuntos() < 100);

            System.out.println("El camello " + this.camello.getNombre() + " ha llegado a la meta.");
//            if (camello.getPuntos() > 100) {
//                do {
//                    camello.setPuntos(camello.getPuntos() - 1);
//                } while (camello.getPuntos() > 100);
//
//            }

        } catch (Exception e) {
            System.out.println("Error en " + e);
        }

    }

}
