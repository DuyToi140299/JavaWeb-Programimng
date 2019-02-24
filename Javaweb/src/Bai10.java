
import static java.lang.Math.pow;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n :");
        n = sc.nextInt();
        int temp = n;
        int count =0;
        while(temp!=0){
            temp /= 10;
            count ++;
        }
        count--;
        int s =0;
        temp =n;
        while(temp !=0){
            s += (temp %10)*pow(10,count);
            count --;
            temp /= 10;
        }
        System.out.println(s+"");
        if(s == n)System.out.println(n+" la so doi xung");
        else    System.out.println(n+" khong la so doi xung");
        
    }
}
