/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Store {
    private static final int MAX_P = 20;
    private Product[] product;
    private int currQuantity;

    public Store() {
        this.product = new Product[MAX_P];
        this.currQuantity = 0;
    }

    public Store(Product[] product) {

        this.product = product;
    }

    public Product[] getProducts() {
        return product;
    }

    public void setProducts(Product[] product) {
        this.product = product;
    }
    
    public void addProduct(){
        // Tạo ra sản phẩm
        Product p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn thêm smartPhone/Camera = 1/0?");
        int choose = sc.nextInt();
            if(choose ==0){
                p = new Camera();

            }
            else
                p = new SmartPhone();
            
            p.addNew();
            
        if(currQuantity >= product.length){
            System.out.println("Không thêm được");
            return ;   
        }    
        
        product[currQuantity] = p; // Thêm sản phẩm vào danh sách
        currQuantity++;
       
   
    }
    
    public void listProduct(){
        System.out.println("====================Danh Sach====================");
        System.out.println(" | Mã sản phẩm | Tên sản phẩm | Giá | Số lượng |");
        for(Product p : product){
            if(p == null)
                break;
            System.out.println(p);
        }
        System.out.println("=================================================");
    
    }
    
    public void search(String name){
        for(Product p : product){
            if(p == null)
                break;
            if(p.getName().equals(name)){
                System.out.println(p);
                return ;
            }
           
        }  
        System.out.println("Không tìm thấy !");
        
    }
    
    
}
