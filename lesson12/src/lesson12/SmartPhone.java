/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SmartPhone extends Product {
     private boolean hasCamera;
     private int sim;

    public SmartPhone() {
        super();
    }

    public SmartPhone(boolean hasCamera, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }
    
    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    @Override
    public void addNew() {
        super.addNew(); 
        System.out.println("Co camera hay khong (1/0)");
        int choose = sc.nextInt();
        if(choose == 1){
            hasCamera = true;
        }else {
            hasCamera = false;
        }        
        System.out.println("Sim :");
        sim = sc.nextInt();
        sc.nextLine();
    }
    
   
     
    
    
    
    
    
}
