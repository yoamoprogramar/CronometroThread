package Cronometro;

import java.awt.Font;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JLabel min, seg, p;
    JLabel lblMinutos,lblSegundos,lblMilis;
    JButton btnStart, btnReset, btnStop;

    public Vista() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setTitle("Cronometro");
        this.setSize(400, 200);
        this.setResizable(false);   
        
        lblMinutos = new JLabel("");
        lblMinutos.setFont(new Font("Arial", 0, 15));
        this.getContentPane().add(lblMinutos, new AbsoluteConstraints(20, 60, 10, 10));
        btnStart = new JButton("Start");
        this.getContentPane().add(btnStart, new AbsoluteConstraints(300, 30, 70, 20));
        btnStop = new JButton("Stop");
        this.getContentPane().add(btnStop, new AbsoluteConstraints(300, 60, 70, 20));
        btnReset = new JButton("Reset");
        this.getContentPane().add(btnReset, new AbsoluteConstraints(300, 90, 70, 20));
    }

}
