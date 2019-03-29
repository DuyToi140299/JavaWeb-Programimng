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
public class StudentManager extends Manager{
    private static final int MAX_STUDENT = 20;
    private int quantity;
    Student []list;
    

    public StudentManager() {
        quantity = 0;
        list = new Student[MAX_STUDENT];
    }
    
    
    @Override
    void add() {
        Student st = new Student();
        if(quantity <= MAX_STUDENT){
            st.input();
            list[quantity] = st;
            quantity++; 
        }
        else
            System.out.println("Khong the them !");
        
    }

    @Override
    void show() {
        for (Student student : list) {
            if(student != null)
            System.out.println("id = "+student.getId()+", name = "+student.getName()+", email = "+student.getEmail());
        }
    }

    @Override
    void search(String name) {
        boolean found = false;
        for (int i = 0; i < list.length; i++) {
            Student temp = list[i];
            if(temp == null) continue;
            if(temp.getName().equals(name)){
                System.out.println("id = "+temp.getId()+", name = "+temp.getName()+", email = "+temp.getEmail());
                found = true;
            }
            
        }
        if( found = false)
            System.out.println("Khong tim thay !");
    }
    
    
    
}
