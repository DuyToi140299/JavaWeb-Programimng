/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Admin
 */
public class SoNguyenTo {
    private int a;
    
    public SoNguyenTo(){
    }
    public SoNguyenTo(int x){
        this.a = x;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public boolean isSoNguyenTo(int x){
        if( x < 2) return false;
        else{
            for (int i = 2; i < x; i++) 
                if(x % i  ==0)
                  return false;
            
        }   
        return true;
    }
    public int timSoNguyenToTiepTheo(){
        int continues = 2;
        for (int j = a+1; j < a*a; j++){ 
            if(isSoNguyenTo(j)){
                continues = j;
                break;
            }
        }        
        return continues;
    }
            
    
}
