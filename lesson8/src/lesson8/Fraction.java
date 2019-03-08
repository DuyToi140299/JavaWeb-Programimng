/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Fraction {
    private int numerator;
    private int denominator;
    
    public  Fraction(){
    }
    public Fraction(int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Numerator > ");
        this.numerator = input.nextInt();
        System.out.print("Denominator > ");
        this.denominator = input.nextInt();
    
    }
    public void print(){
        System.out.println(this.numerator +"/"+ this.denominator);
    }
    
    private int gcd(int a,int b){
        while(b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
    
        return a;
    }
     public void reduce() {
        int gcd = this.gcd(numerator, denominator);
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }
//    public Fraction reduce() {
//        int gcd = this.gcd(numerator, denominator);
//        int numerator = this.numerator / gcd;
//        int denominator = this.denominator / gcd;
//        return new Fraction(numerator, denominator);
//    }
    public void inverse(){
        int temp = this.numerator ;
        this.numerator = this.denominator;
        this.denominator = temp;
    }
    
    
    
}
