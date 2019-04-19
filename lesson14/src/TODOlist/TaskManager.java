/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TODOlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TaskManager {

    private Task[] list;
    private int Quantity;

    public TaskManager() {
        this.list = new Task[30];
        this.Quantity = 0;
    }

    public void add(Task task) throws FileNotFoundException, IOException {
        this.list[Quantity] = task;
        Quantity++;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("task.txt")))) {
            oos.writeObject(list);
        }

    }

    public void showAll() {
        for (Task task : list) {
            if (task != null) {
                System.out.println(task);
            }
        }

    }

    public void showDone(boolean isDone) {

        if (isDone) {
            for (Task list1 : list) {
                if (list1 == null) {
                    continue;
                }
                if (list1.isDone()) {
                    System.out.println("Da lam bai tap :" + list1);
                }
            }

        }else {
            for (Task list1 : list) {
                if (list1 == null) {
                    continue;
                }
                if (!list1.isDone()) {
                    System.out.println("Chua lam bai tap :" + list1);
                }
            }
        
        
        
        }
        

    }
}
