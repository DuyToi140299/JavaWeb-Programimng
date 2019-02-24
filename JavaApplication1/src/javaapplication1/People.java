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
public class People {
    private int age = 0;
    public String name;
    protected String addr;
    static int numOfObject;
    People(int ag, String na,String ad){
        ++numOfObject;
        age = ag;
        name = na;
        addr = ad;
    }
    
    void display(){
        System.out.println("Name: "+name + "\nAge: "+age +"\n Address: "+addr);
    
    }
    public static void main(String[] args) {
        numOfObject = 0;
        People student = new People(23,"Tran Hai Yen","Ha Noi");
        student.display();
        System.out.println("Number Of Object : "+People.numOfObject);
        People student1 = new People(20,"Nguyen Duy Toi","Ha Noi");
        System.out.println("Number Of Object : "+People.numOfObject);
    }
}
