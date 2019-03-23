/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        StudentManager manager = new StudentManager();
        Student st = new Student("Anh","nguyenvananh@gmail.com",34);
        Student st1 = new Student("Yen","TranThiHaiYen99@gmail.com",19);
        int choose ;
        System.out.println("");
        do{ 
             System.out.println("---Student Manager---");
             System.out.println("1. List");
             System.out.println("2. Search");
             System.out.println("3. Add");
             System.out.println("4. Exit");
            choose = sc.nextInt();
            switch(choose){
                case 1 :
                    manager.list();
                    break;
                case 2 :
                    manager.search("Yen");
                    break;
                case 3 :
                    manager.add(st);
                    manager.add(st1);
                    break;
                case 4 :
                    System.out.println("Exited !");
                    break;
            }
        
        }while(choose !=4);
        
    }
    
}
