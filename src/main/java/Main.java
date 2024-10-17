package org.example;


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

    //Liskov
        Flyable flyingBird = new FlyingBird();
        Aguila aguila = new Aguila();

        aguila.fly();
        flyingBird.fly(); // Salida: El pájaro está volando

        // Los pingüinos no vuelan, por lo tanto no usamos la interfaz Flyable
        Penguin penguin = new Penguin();
        System.out.println("Los pingüinos no pueden volar");


    }

}

