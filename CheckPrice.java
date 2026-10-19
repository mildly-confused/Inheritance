package Inheritance;
/*
* Title of Class: CheckPrice
* Author's Name: Milda Kuciauskas
*
* Resources:
https://www.geeksforgeeks.org/java/convert-a-string-to-an-numeric-in-java/
* 
*/

import java.util.Scanner;
public class CheckPrice extends Machine3{
   // private double bud;
 //   private String cho;
    public CheckPrice(double bud, String cho) {
         Scanner I1 = new Scanner(System.in);
      if (Machine3.type.equals("drink")) {
            if (bud >= VendingMachine.drinkPrice + Integer.parseInt(cho.substring(1,2))) {
                    System.out.println("You have sufficient funds. Vend? Type Y or N");
                    if (I1.next().equals("N")) {
                    CancelVend.cancel();
                    }
                    else //(I1.next().equals("Y")) 
                        {
                          System.out.println("Object vended.");   
                          ReturnChange.change();   
                    }
            }
            else {
                System.out.println("Insufficient funds.");
            }
        }
     else if (Machine3.type.equals("chip")) {
            if  (bud >= VendingMachine.chipPrice + Integer.parseInt(cho.substring(1,2))) {
                    System.out.println("You have sufficient funds. Vend? Type Y or N");
                    if (I1.next().equals("N")) {
                   CancelVend.cancel();
                    }
                 else //(I1.next().equals("Y")) 
                   {
                          System.out.println("Object vended.");  
                        ReturnChange.change();   
    
                    }
            }
            else {
                System.out.println("Insufficient funds.");
            }
        }
     else if (Machine3.type.equals("candy")) { //check statements?????
             if (bud >= VendingMachine.chipPrice + Integer.parseInt(cho.substring(1,2))) {
                    System.out.println("You have sufficient funds. Vend? Type Y or N");
                    if (I1.next().equals("N")) { 
                   CancelVend.cancel();

                    }
                    else {
                          System.out.println("Object vended.");
                          ReturnChange.change();   
      
                    }
            }
            else {
                System.out.println("Insufficient funds.");
            }
        }

    }
   

}
