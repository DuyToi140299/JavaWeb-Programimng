/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin";
        FileUtils fu = new FileUtils();
//      fu.getFolder(path);
//      fu.getFile(path);
//      fu.getImage(path);
//      fu.getFileWithExt("txt", path);
        fu.lastModifiedTime(path);
    }
    
}
