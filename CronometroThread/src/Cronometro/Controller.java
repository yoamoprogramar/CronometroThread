package Cronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    boolean s = false;

    public static void main(String[] args) {
        Controller c = new Controller();
    }
    Vista view;
    Cronos h;
    String cronos = "";

    public Controller() {
        view = new Vista();
        view.setVisible(true);
        h = new Cronos(view.lblCronos);
        view.btnStart.setActionCommand("Start");
        view.btnReset.setActionCommand("Reset");
        view.btnStop.setActionCommand("Stop");
        view.btnStart.addActionListener(this);
        view.btnReset.addActionListener(this);
        view.btnStop.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "Start":
                if (!s) {
                    h.setX(true);
                    h.start();
                    s = true;
                } else if (!h.isX()) {
                    h.setX(true);
                }
                break;
            case "Stop":
                h.setX(false);
                break;
            case "Reset":
                h.reset();
                break;
        }
    }
}
