package Cronometro;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JLabel min, seg, p;
    JLabel lblCronos;
    JButton btnStart, btnReset, btnStop;

    public Vista() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setTitle("Cronometro");
        this.setSize(400, 200);
        this.setResizable(false);   
        
        lblCronos = new JLabel("");
        lblCronos.setFont(new Font("Arial Black", 0, 40));
        lblCronos.setForeground(Color.white);
        lblCronos.setBackground(Color.red);
        lblCronos.setOpaque(true);
        lblCronos.setBorder(new LineBorder(Color.BLACK,3));
        this.getContentPane().add(lblCronos, new AbsoluteConstraints(30, 30, 250, 100));
        btnStart = new JButton("Start");
        this.getContentPane().add(btnStart, new AbsoluteConstraints(300, 30, 70, 20));
        btnStop = new JButton("Stop");
        this.getContentPane().add(btnStop, new AbsoluteConstraints(300, 60, 70, 20));
        btnReset = new JButton("Reset");
        this.getContentPane().add(btnReset, new AbsoluteConstraints(300, 90, 70, 20));
    }

}
