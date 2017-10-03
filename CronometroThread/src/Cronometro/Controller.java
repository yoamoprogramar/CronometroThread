package Cronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    public static void main(String[] args) {
        Controller c = new Controller();
    }
    Vista view;
    Cronos h;
    String cronos="";

    public Controller() {
        view = new Vista();
        view.setVisible(true);
        
        h = new Cronos(view.lblMinutos);
        view.btnStart.setActionCommand("Start");
        view.btnReset.setActionCommand("Reset");
        view.btnReset.setActionCommand("Stop");
        view.btnStart.addActionListener(this);
        view.btnReset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "Start":
                h.start();
                break;
            case "Stop":
                break;
            case "Reset":
                break;
        }
    }
}
