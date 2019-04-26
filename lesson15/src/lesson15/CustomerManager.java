/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson15;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CustomerManager {
    
    private List<Customer> list ;
    private String path = "cust.dat";

    public CustomerManager() {
        list = new ArrayList<>();
    }
    
    public boolean load(String file){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)));
            List<Customer> read = (List<Customer>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return false;
        }
        
        return true;
    }
    
    public void add(){
        Customer cus = new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.print("ID > ");
        cus.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Name > ");
        cus.setName(sc.nextLine());
        System.out.print("Address > ");
        cus.setAddress(sc.nextLine());
        System.out.println("Age > ");
        cus.setAge(Integer.parseInt(sc.nextLine()));
        
        list.add(cus);
        
    }
    
    public Customer search(int id){
        for (Customer cus : list) {
            if(cus.getId() == id)
                return cus;
        }
        
//        int index = this.list.indexOf(new Customer(id));
//        if(index > 0)
//            return this.list.get(index);
        
        return null;
    }
    
    public boolean save(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(list);
            oos.flush();
            oos.close();
           
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
     
        return true;
    }
    
    
    
    
}
