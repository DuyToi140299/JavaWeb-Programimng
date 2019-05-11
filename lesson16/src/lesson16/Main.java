/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson16;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        StudentManager mng = new StudentManager();
        int choose = 0;
        do{
            System.out.println("========MENU========");
            System.out.println("1. Add new ");
            System.out.println("2. Search ");
            System.out.println("3. Update ");
            System.out.println("4. Delete ");
            System.out.println("5. Read file ");
            System.out.println("6. Write file ");
            System.out.println("7. Exited !! ");
            System.out.println("Input number > ");       
            choose = sc.nextInt();
            sc.nextLine();
            switch(choose){
                case 1 :
                    mng.addNew();
                    break;
                case 2 :
                    System.out.print("Input name > ");
                    String name = sc.nextLine();
                    Student stud = mng.search(name);
                    if(stud == null)
                        System.out.println("Not found !");
                    else
                        System.out.println(stud);   
                    break;
                case 3 :
                    System.out.print("Input name > ");
                    String name1 = sc.nextLine();
                    mng.update(name1);
                    break;
                case 4 :
                    System.out.print("Input name > ");
                    String name2 = sc.nextLine();
                    mng.delete(name2);
                    break;
                case 5 :
                    mng.read();
                    break;
                case 6 :
                    mng.saveFiles();
                    break;
                case 7 :
                    System.out.println("Exited !!");
                    break;
            }
        
        }while(choose != 6);
        
        
        
    }
    
}
