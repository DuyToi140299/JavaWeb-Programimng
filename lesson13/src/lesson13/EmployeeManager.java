/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson13;

/**
 *
 * @author Admin
 */
public class EmployeeManager extends Manager{
    private static final int MAX_EP = 20;
    private int quantity;
    Employee []list;

    public EmployeeManager(int quantity, Employee[] list) {
        this.quantity = quantity;
        this.list = list;
    }

    public EmployeeManager() {
        this.quantity = 0;
        list = new Employee[MAX_EP];
                
    }
        
    
    
    @Override
    void add() {
        Employee ep = new Employee();
        if(quantity <= MAX_EP){
            ep.input();
            list[quantity] = ep;
            quantity++; 
        }
        else
            System.out.println("Khong the them !");
    }

    @Override
    void show() {
        for (Employee emp : list) {
            if(emp != null)
            System.out.println("id = "+emp.getId()+", name = "+emp.getName()+", email = "+emp.getSalary());
        }
    }

    @Override
    void search(String name) {
       boolean found = false;
        for (int i = 0; i < list.length; i++) {
            Employee emp = list[i];
            if(emp == null) continue;
            if(emp.getName().equals(name)){
                System.out.println("id = "+emp.getId()+", name = "+emp.getName()+", email = "+emp.getSalary());
                found = true;
            }
            
        }
        if(found = false)
            System.out.println("Khong tim thay !");
    }
    
}
