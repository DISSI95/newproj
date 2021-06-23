/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
 class M {
   // String drink;
    
    int waterlevel;// another subclass..........
    int Nescap;
    int Latcap;
    int Capcap;
    int Hotcap;
    
    
  //static Scanner scan = new Scanner(System.in);
    
    
        float drinkprice ;
    public M(){ 
        
    }
    public void Setdrinkprice(int drinkprice){
        this.drinkprice=drinkprice;
       
    }
    public int getdrinkprice(){
        
        return this.getdrinkprice();
               
    }
    
    public void Setwaterlevel(int y){
        
       this.waterlevel=500;
       this.waterlevel=y;
        
    }
    public int getwaterlevel(){
        return this.waterlevel;
    }
   private void SetNescap(int z){
       this.Nescap=200;
       this.Nescap=z;
       
   }
   public int getcoffecap(){
       
       return this.Nescap;
       
   }
   
   private void SetLatcap(int b){
       this.Latcap=200;
       this.Latcap=b;
   }
   public int getLatcap(){
       return this.Latcap;
   }
   
    private void SetHotcap(int b){
       this.Hotcap=200;
       this.Hotcap=b;
   }
   public int getHotcap(){
       return this.Hotcap;
   }
    private void SetCapcap(int b){
       this.Capcap=200;
       this.Latcap=b;
   }
   public int getCapcap(){
       return this.Capcap;
   }
   
 }