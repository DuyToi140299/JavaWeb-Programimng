/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Admin
 */
public class StaticEx {
    
    public static void doST(){
   
    }
    public static void main(String[] args){
        Person s = new Person();
        s.setId(100);
        System.out.println("id= "+s.getId());
        
        Person s1 = new Person();
        s1.increase();
        System.out.println("id= "+s1.getId());
        
        Person s2 = new Person();
        s2.increase();
        System.out.println("id= "+s2.getId());
    
    
    }
    
}
