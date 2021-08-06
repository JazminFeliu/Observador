package com.company;


import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introducir texto: ");
        FuenteEvento fuenteEvento = new FuenteEvento();

        fuenteEvento.addObserver(new Observer() {
            @Override
            public void update(Observable obj, Object arg) {
                System.out.println("Respuesta recibida: " + arg);
            }
        });
        new Thread(fuenteEvento).start();
    }
}
