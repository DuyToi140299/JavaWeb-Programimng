/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    private Map<String, String> map;

    public Menu() {
        map = new HashMap();
        this.loadData("vi");
    }

    public void loadData(String lang) {
        try {
            String file = "menu-" + lang + ".locale";
            BufferedReader bf = new BufferedReader(
                                      new InputStreamReader(
                                             new FileInputStream(file)));
            this.map.clear();
            while (true) {
                String line = bf.readLine();
                if (line == null) {
                    break;
                }

                String split[] = line.split("=");
                this.map.put(split[0], split[1]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void print() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n-------%s-------", this.map.get("menu"));
        System.out.printf("\n1. %s", this.map.get("add"));
        System.out.printf("\n2. %s", this.map.get("search"));
        System.out.printf("\n3. %s", this.map.get("update"));
        System.out.printf("\n4. %s", this.map.get("delete"));
        System.out.printf("\n5. %s", this.map.get("save"));
        System.out.printf("\n6. %s", this.map.get("language"));
        System.out.printf("\n7. %s", this.map.get("exit"));
        System.out.printf("\n%s", this.map.get("choose"));

        System.out.print(this.map.get("mess"));
        int la = Integer.parseInt(sc.nextLine());
        if (la == 1) {
            this.loadData("en");
        } else if (la == 2) {
            this.loadData("vi");
        }
    }

}
