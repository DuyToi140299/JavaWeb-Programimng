/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson15;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.println("=====MENU=====");
            System.out.println("1. Load data ");
            System.out.println("2. Add new ");
            System.out.println("3. Save ");
            System.out.println("4. Search ");
            System.out.println("5. Exit ");
            System.out.println("Choose number 1 - 5 :");
            choose = sc.nextInt();
            sc.nextLine();
            switch(choose){
                case 1:
                    System.out.print("File > ");
                    String file = sc.nextLine();
                    if(manager.load(file))
                        System.out.println("Successful");
                    else
                        System.out.println("Error !");
                    break;
                case 2:
                    manager.add();
                    break;
                case 3:
                    if(manager.save())
                        System.out.println("Successful");
                    else
                        System.out.println("Error");
                    break;
                case 4:
                    System.out.println("ID > ");
                    int id = sc.nextInt();
                    Customer cus = manager.search(id);
                    if(cus != null)
                        System.out.println(cus);
                    else
                        System.out.println("NOT FOUND !!!");
                    break;
                case 5:
                    System.out.println("EXITED !!");
                    break;
                    
            }
               
        }while(choose != 5);
        
        
    }
}
