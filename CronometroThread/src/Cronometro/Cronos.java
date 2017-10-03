package Cronometro;

import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Cronos extends Thread {

    int minutos = 0;
    int segundos = 0;
    int milisegundos = 0;
    JLabel lblCronos;
    boolean x = false;

    public Cronos(JLabel lblCronos) {
        this.lblCronos = lblCronos;
    }

    public boolean isX() {
        return x;
    }

    public void setX(boolean x) {
        this.x = x;
    }

    public void reset() {
        this.milisegundos = 0;
        this.segundos = 0;
        this.minutos = 0;
        if (!this.x) {
            lblCronos.setText(minutos + " : " + segundos + " : " + milisegundos);
        }
    }

    public void run() {
        while (true) {
            System.out.println("run");
            if (this.x) {
                try {
                    milisegundos++;
                    if (milisegundos == 999) {
                        segundos++;
                        milisegundos = 0;
                    }
                    if (segundos == 59) {
                        minutos++;
                        segundos = 0;
                    }
                    Thread.sleep(1);
                    lblCronos.setText(minutos + " : " + segundos + " : " + milisegundos);
                } catch (InterruptedException ex) {
                    System.out.println("Algo salio Mal");
                }
            }
        }
    }

}
