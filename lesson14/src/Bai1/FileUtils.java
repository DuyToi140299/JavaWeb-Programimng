/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class FileUtils {

    private String path;
    private File f;

    public FileUtils() {
    }

    public void getFolder(String path) {
        f = new File(path);
        File[] folder = f.listFiles();
        
        try {
            for (File file : folder) {
                if (file.isDirectory()) {
                    System.out.println("   Name:" + file.getName());

                } else {
                    System.out.println("Folder not found !!");
                }
            }

        } catch (NullPointerException ex) {
            System.out.println("Lỗi cái gì rồi !");
            ex.printStackTrace();
        }

    }

    public void getFile(String path) {
        f = new File(path);
        File[] file = f.listFiles();
        for (File file1 : file) {
            if (file1.isFile()) {
                System.out.println("   Name:" + file1.getName());

            } else {
                System.out.println("This isn't file");
            }

        }

    }

    public void getImage(String path) {
        f = new File(path);
        File[] file = f.listFiles();
        for (File file1 : file) {
            if (file1.getName().endsWith("png") || file1.getName().endsWith("jpg")
                    || file1.getName().endsWith("jpeg")) {
                System.out.println("   Name" + file1.getName());
            }
            else if(file1.isDirectory())
                continue;
            
        }

    }

    public void getFileWithExt(String ext, String path) {

        f = new File(path);
        File[] file = f.listFiles();
        for (File file1 : file) {

            if (file1.getName().endsWith(ext)) {
                System.out.println("   Name:" + file1.getName());

            }
            
         
        }
        System.out.println("size ~ "+f.length()/1024 + "KB");

    }
    public void lastModifiedTime(String path){
        f = new File(path);
        File[] file = f.listFiles();
        for (File file1 : file) {
            System.out.println("Last modified time file :"+new Date(file1.lastModified()));
        
        }
    
    }

}
