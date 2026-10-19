package Inheritance;
/*
* Title of Class: Machine3
* Author's Name: Milda Kuciauskas
* Purpose: 
*
* Resources:
https://www.w3schools.com/c/c_conditions_elseif.php
* 
*/

public class Machine3 extends VendingMachine {
public static String location = "123 Main St";
public static double budget;
public static String choice;
public static String type;
public static void getTypeChoice(String c) { //way to check type of something?
        if (c.substring(0,1).equals("A")){
                type = "drink";
                System.out.println("Your choice is a drink. Your drink will cost " + VendingMachine.drinkPrice + c.substring(1,2));
        }
        else if (c.substring(0,1).equals("B")){
               type = "chip";
                System.out.println("Your choice is a bag of chips. Your chips will cost " + VendingMachine.chipPrice + c.substring(1,2));
        }
        else if (c.substring(0,1).equals("C")){
                type = "candy";
                System.out.println("Your choice is candy. Your candy will cost " + VendingMachine.candyPrice + c.substring(1,2));
        }
        else {
                System.out.println("That is not a valid choice.");
                System.exit(0);

        }
}
}
