/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class StudentManager {

    private List<Student> list;
    private String path;
    private Scanner sc = new Scanner(System.in);

    public StudentManager() {
        list = new ArrayList<>();
        this.path = "student.txt";

    }

    public void addNew() {
        Student stud = new Student();
        System.out.print("Input name > ");
        stud.setName(sc.nextLine());
        System.out.print("Input date of birth > ");
        stud.setDob(sc.nextLine());
        System.out.print("Input email > ");
        stud.setEmail(sc.nextLine());
        System.out.print("Input rollnumber > ");
        stud.setRollnumber(sc.nextLine());

        list.add(stud);

    }

    public Student search(String name) {
        for (Student stud : list) {
            if (stud.getName() == name) {
                return stud;
            }
        }
        return null;
    }

    public void update(String name) {
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName() == name) {
                list.get(i).setName(sc.nextLine());
                list.get(i).setDob(sc.nextLine());
                list.get(i).setEmail(sc.nextLine());
                list.get(i).setRollnumber(sc.nextLine());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Name not found !! ");
        }

    }

    public void delete(String name) {
        Student student = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName() == name) {
                student = list.get(i);
                break;
            }

        }
        if (student != null) {
            list.remove(student);

        } else {
            System.out.println("Not found !!");
        }

    }

    public void saveFiles() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(new File(path));
        try {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void read() {
        try {
            FileInputStream fis = new FileInputStream(new File(path));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student read = (Student) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

}
