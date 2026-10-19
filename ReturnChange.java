package Inheritance;

public class ReturnChange extends Machine3{
public static void change() {
    if (Machine3.type.equals("drink")) {
    System.out.println("Your change is " + (Machine3.budget - VendingMachine.drinkPrice - Double.parseDouble(Machine3.choice.substring(1,2))));
}
else if  (Machine3.type.equals("chip")) {
    System.out.println("Your change is " + (Machine3.budget - VendingMachine.chipPrice - Double.parseDouble(Machine3.choice.substring(1,2))));
}
else {
    System.out.println("Your change is " + (Machine3.budget - VendingMachine.candyPrice - Double.parseDouble(Machine3.choice.substring(1,2))));
}
System.exit(0);

}
}
