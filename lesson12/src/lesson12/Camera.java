/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12;

/**
 *
 * @author Admin
 */
public class Camera extends Product{
    boolean hasWifi;

    public Camera() {
    }

    public Camera(boolean hasWifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }

    public Camera(boolean hasWifi) {
       this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    @Override
    public void addNew() {
        super.addNew();
        System.out.println("Có wifi hay không ?");
        int choose = sc.nextInt();
        if(choose == 1)
            hasWifi = true;
        if(choose == 0)
            hasWifi = false;
    }
    
    
    
   
    
    
    
    
}
