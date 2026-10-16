package Inheritance;
/*
* Title of Class: MachineRunner
* Author's Name: Milda Kuciauskas
* Purpose: To run this program and collect input from the user to allow them to purchase a snack from this vending machine
*
* Resources: 
*  https://stackoverflow.com/questions/66085060/how-to-stop-a-program-with-user-input
* 
*/
import java.util.Scanner;
public class MachineRunner extends Machine3 {
  
public static void main (String args[]) {
    
    System.out.println("Hello! Welcome to Machine 3! The location is " + Machine3.location);
    System.out.println("This machine has three columns and four rows");
    System.out.println("What is your budget for a snack today?");
    Scanner input = new Scanner(System.in);
    Machine3.budget = input.nextDouble();
    if(Machine3.budget < 1.00) {
        System.out.println("You do not have sufficent funds to purchase any snacks from this machine :(");
        System.exit(0);
    }
    System.out.println("Which snack would you like? The columns range from A-C and the rows range from 1-4. Please input your selection in a format with a capital letter and then your number selection.");
    Machine3.choice = input.next();
    System.out.println("Your choice is " + Machine3.choice + ".");
    //CheckPrice.InBudget();
}
}
