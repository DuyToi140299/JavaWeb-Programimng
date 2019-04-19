/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SimpleVim {

    public void creatFile(String path) throws IOException {
        boolean isCreat = false;
        try {
            File file = new File(path);
            isCreat = file.createNewFile();
            if (isCreat) {
                System.out.println("Da tao file thanh cong!");
            } else {
                System.out.println("Tao file that bai");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }

    public void writeFile()  {
        File file = new File("D:\\demo.txt");
        try{  
            PrintWriter pw= new PrintWriter(file);
            pw.println("Hello world");
            pw.println("Đúng chưa nhể ?? ");
            pw.println("?? :D tại sao không ghi vào file ?? :D");
           
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
       
            
      

    }

}
