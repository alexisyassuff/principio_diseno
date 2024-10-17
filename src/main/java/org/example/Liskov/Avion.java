package org.example.Liskov;

public class Avion implements Movible, Volador {
    @Override
    public void mover() {
        System.out.println("El avión está moviéndose en la pista.");
    }

    @Override
    public void volar() {
        System.out.println("El avión está volando en el cielo.");
    }
}
