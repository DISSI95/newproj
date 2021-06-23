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
public class Main {
    public static void main (String [] args){
   
      Cup q = new Cup();
     int x;
    // int u;// for water level
     
     
    Scanner g = new Scanner(System.in);
       
     
      
     
     System.out.println("Please choose your Cup Size between 1 and 3 where Size 1= Small , Size 2= Meduim and Size 3= Large");
     int p = g.nextInt();
    
      Scanner v = new Scanner(System.in);
     
     System.out.println("Please choose your favorite drink between 1 and 4");
     int s = v.nextInt();
    
        
    
     switch(s){
         
         case 1:
             
          Nescafe S = new Nescafe();
          
        System.out.println((S.print())+ ("Your cost is :" + S.getdrinkprice())+"JD");
        if(p==1){
          x= q.waterlevel - q.CupS;
      }
     else  if (p==2){
                  x= q.waterlevel - q.CupM;
     }
          else if(p==3){
              x= q.waterlevel - q.CupL;
          }
                break;
                case 2:
             
          Late L = new Late();
        System.out.println((L.print())+ ("Your cost is :" +L.getdrinkprice())+"JD");
        if(p==1){
          x= q.waterlevel - q.CupS;
      }
     else  if (p==2){
                  x= q.waterlevel - q.CupM;
     }
          else if(p==3){
              x= q.waterlevel - q.CupL;
          }
        break;
                
                case 3:
             
          Cappucino C = new Cappucino();
        System.out.println((C.print())+ ("Your cost is :" +C.getdrinkprice())+"JD");
        if(p==1){
          x= q.waterlevel - q.CupS;
      }
     else  if (p==2){
                  x= q.waterlevel - q.CupM;
     }
          else if(p==3){
              x= q.waterlevel - q.CupL;
          }
        break;
        case 4:
             
          HotChocolate H = new HotChocolate();
        System.out.println((H.print())+ ("Your cost is :" +H.getdrinkprice())+"JD");
        if(p==1){
          x= q.waterlevel - q.CupS;
      }
     else  if (p==2){
                  x= q.waterlevel - q.CupM;
     }
          else if(p==3){
              x= q.waterlevel - q.CupL;
          }
        break;
       }
      
      }
      }
    
    // if(v.nextInt()>0 && v.nextInt()<5){
       //  Nescafe S = new Nescafe();
       //  System.out.println((S.print())+ (S.getdrinkprice()));
    // }
      //  Nescafe S = new Nescafe();
      //  S.getdrinkprice();
     //   System.out.println((S.print()) + "The Cost is:" + S.getdrinkprice() );
        
        
        /*HotChocolate H = new HotChocolate();
        
        H.getdrinkprice();
        System.out.println((H.print()) + "The Cost is:" + H.getdrinkprice() );
        
        
        Late L = new Late ();
        L.getdrinkprice();
        System.out.println((L.print()) + "The Cost is:" + L.getdrinkprice() );
        
        Cappucino C = new Cappucino ();
        C.getdrinkprice();
        System.out.println((C.print()) + "The Cost is:" + C.getdrinkprice() );
        
        */
     
        
        
    
    

