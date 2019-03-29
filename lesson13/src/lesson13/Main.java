/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson13;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        Manager st = new StudentManager();
        Manager emp = new EmployeeManager();
        Menu menu = new Menu();
        do{
            menu.display();
            choose = sc.nextInt();
            sc.nextLine();
            switch(choose){
                case 1 :
                    st.add();
                    break;
                case 2 :
                    st.show();
                    break;
                case 3 :
                    st.search(sc.nextLine());
                    break;
                case 4 :
                    System.out.println("Exited !");
                    break;
            }
        }while(choose !=4);
    }
    
    
}
