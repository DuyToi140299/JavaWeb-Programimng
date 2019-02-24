/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Admin
 */
public class HelloJava1 extends JFrame {
    public HelloJava1(){
        JLabel label = new JLabel("Hello Java!",SwingConstants.CENTER);
        label.setForeground(Color.red);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(label); 
    }
    public static void main(String[] args){
            new HelloJava1().setVisible(true);
    }
}
