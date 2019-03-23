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
public class Main {
     public static void main(String[] args) {
         
        Store st = new Store(); 
        int choose;
        do{
            System.out.println("1. AddProduct");
            System.out.println("2. ListProduct");
            System.out.println("3. SearchProduct");
            System.out.println("4. Exit");
            Scanner sc = new Scanner(System.in);
            choose = sc.nextInt();
            sc.nextLine();
            switch(choose){
                case 1:
                    st.addProduct();
                    break;
                case 2:
                    st.listProduct();
                    break;
                case 3:
                    System.out.println("Input name :");
                    st.search(sc.nextLine());
                    break;
                case 4:
                    System.out.println("Exited !");
                    break;
            
            }
            
            
        }while(choose != 4);
    
    }
}