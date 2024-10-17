package org.example.Liskov;

public class Coche implements Movible {
    @Override
    public void mover() {
        System.out.println("El coche está moviéndose por la carretera.");
    }
}
