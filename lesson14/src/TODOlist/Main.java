/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TODOlist;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Task task1 = new Task(43,"weqwew","eqweqw",false);
        Task task2 = new Task(654,"dbf","fnfe",true);
        Task task3 = new Task(65435,"d5bf","fntfe",true);
        TaskManager tg = new TaskManager();
        tg.add(task1);
        tg.add(task2);
        tg.add(task3);
        tg.showAll();
        tg.showDone(true);
        
    }
}
