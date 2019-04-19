/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        SimpleVim sp = new SimpleVim();
        try {
            sp.creatFile("D:\\test.txt");
            sp.writeFile();     
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
        
        
        
        
    }

}
