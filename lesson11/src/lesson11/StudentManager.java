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
public class StudentManager {
    private static final int MAX_STUDENT = 20;
    private Student[] listStudent;
    private int currQuantity ;
    Scanner sc = new Scanner(System.in);
    
    
    public StudentManager(){
        currQuantity = 0;
        this.listStudent = new Student[MAX_STUDENT];
    }

    public Student[] getListStudent() {
        return listStudent;
    }

    public void setListStudent(Student[] listStudent) {
        this.listStudent = listStudent;
    }
    
    
    public boolean add(Student stud){
        if(currQuantity <= MAX_STUDENT){
            listStudent[this.currQuantity] = stud;
            currQuantity++;
            return true;
        }else{
            return false;
        }
 
    }
    
    public void search(String name){
        boolean found = false;
        for (int i = 0; i < listStudent.length; i++) {
            Student temp = listStudent[i];
            if(temp == null) continue;
            if(temp.getName().equals(name)){
                System.out.println(temp);
                found = true;
            }
              
        }
        if(!found)
            System.out.println("Khong tim thay");
        
    }
    
    public void list(){
        for(Student stud : listStudent){
            if(stud != null)
            System.out.println(stud);
        }
     
    }
    
    public void list(boolean order){
        if(order){
            //Sắp xếp tăng dần
            for (int i = 0; i < listStudent.length-1; i++) {
                for (int j = 0; j < listStudent.length; j++) {
                    if(this.listStudent[i]== null || this.listStudent[j]== null) continue;
                    if(this.listStudent[i].getName().compareTo(this.listStudent[j].getName()) > 0){
                        Student temp = this.listStudent[i];
                        this.listStudent[i] = this.listStudent[j];
                        this.listStudent[j] = temp;
                    }
                    
                }
            }
        }else{
            for (int i = 0; i < listStudent.length-1; i++) {
                for (int j = 0; j < listStudent.length; j++) {
                    if(this.listStudent[i]== null || this.listStudent[j]== null) continue;
                    if(this.listStudent[i].getName().compareTo(this.listStudent[j].getName()) < 0){
                        Student temp = this.listStudent[i];
                        this.listStudent[i] = this.listStudent[j];
                        this.listStudent[j] = temp;
                    }
                    
                }
            }
        
        }
        for (Student student : listStudent) {
            System.out.println(student);
        }
    
    }
    
    
    
    
}
