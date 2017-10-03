package Cronometro;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Cronos extends Thread {

    int minutos = 0;
    int segundos = 0;
    JLabel lblMinutos;

    public Cronos(JLabel lblMinutos) {
        System.out.println("Iniciar Hilo");
        this.lblMinutos = lblMinutos;
    }

    public void run() {
        while (true) {
            try {
                segundos++;
                Thread.sleep(1000);
                if (segundos == 59) {
                    minutos++;
                    segundos = 0;
                }
                lblMinutos.setText("");
            } catch (InterruptedException ex) {
                System.out.println("Algo salio Mal");
            }
        }
    }

}
