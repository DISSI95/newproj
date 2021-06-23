/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Late extends M{
    
      int x=3;
public Late(){
    
    super();
}
    private void Setprice(int x){
        this.drinkprice=x;
    }
    
    public int getdrinkprice(){
        return this.x;
    }
    public int print(){
        System.out.println("Your drink is: Late");
        return x;
    }

 
   
    
}
