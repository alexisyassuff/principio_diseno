import org.example.Liskov.*;
import org.example.OpenClosed.Circle;
import org.example.OpenClosed.Rectangle;
import org.example.OpenClosed.Shape;



public class Main {
    public static void main(String[] args) {
    //Open Closed
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 3.0);

        System.out.println("Área del círculo: " + circle.area());
        System.out.println("Área del rectángulo: " + rectangle.area());

        Movible coche = new Coche();
        Movible avion = new Avion();

        // Ambos cumplen el principio de Liskov: puedo sustituir Movible por cualquier clase que lo implemente
        moverTransporte(coche);  // Salida: El coche está moviéndose por la carretera.
        moverTransporte(avion);  // Salida: El avión está moviéndose en la pista.

        // Para el avión, puedo usar también la capacidad de volar
        Volador avionVolador = (Volador) avion;
        avionVolador.volar();    // Salida: El avión está volando en el cielo.
    }

    public static void moverTransporte(Movible transporte) {
        transporte.mover();  // Llamada al método genérico, puede ser coche o avión
    }


    }



