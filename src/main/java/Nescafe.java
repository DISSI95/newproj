/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Nescafe extends M{
   int x=5;
   
public Nescafe(){
    
    super();
}
    private void Setprice(int x){
        this.drinkprice=x;
    }
    
    public int getdrinkprice(){
        return this.x;
    }
   public int print(){
       System.out.println("Your drink is: Nescafe");
        
       return 0;
    }

 
}
