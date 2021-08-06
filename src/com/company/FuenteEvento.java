package com.company;

import java.awt.image.ImageObserver;
import java.util.Observable;
import java.util.Scanner;

public class FuenteEvento extends Observable implements Runnable {

    public void run() {
        while (true) {
            String respuesta = new Scanner(System.in).next();
            setChanged();
            notifyObservers(respuesta);
        }
    }
}
