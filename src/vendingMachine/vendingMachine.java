package vendingMachine;
import java.util.Scanner;

//Created by Dylan Widecki and Cindy Blumer
public class vendingMachine {
	
	public static void main(String[] args) {
		
		//Welcome message and instructions
		System.out.println("Welcome to our vending machine");
		System.out.println("Please enter the number associated with your snack choice");
		
		//Add snack choices
		//Add price for each snack
		System.out.println("1. Potato Chips  $4.00");
		System.out.println("2. Popcorn       $3.00");
		System.out.println("3. Skittles      $2.00");
		System.out.println("4. M&M's         $2.00");
		System.out.println("5. KitKats       $2.00");
		
		//Make it so user can choose a snack option
		System.out.println("Please enter the number of the snack you would like to buy.");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
		//print total price for snack selected and ask user to insert $1 bills
		int total = 0;
		int moneyInserted = 0;
		
		if (userInput == 1) {
			total = total + 4;
			}
		else if (userInput == 2) {
			total = total + 3;
			}
		else if (userInput == 3) {
			total = total + 2;
			}
		else if (userInput == 4) {
			total = total + 2;
			}
		else if (userInput == 5) {
			total = total + 2;
			}
		else {
			System.out.println("Error: Invalid Selection");
		}
		System.out.println("The total is $" + total + ".00");
		System.out.println("Please enter the number of $1 bills you are paying with");
		moneyInserted = moneyInserted + scanner.nextInt();
		
		//confirmation message that asks user to confirm or cancel the transaction, if cancelled full refund
		System.out.println("Please enter confirm to confirm the transaction.");
		System.out.println("If you would like to cancel the transaction enter cancel.");
		String userInput2 = scanner.next();
		
		if (userInput2.equalsIgnoreCase("cancel")) {
			System.out.println("You have cancelled the transaction and will recieve a full refund.");
			moneyInserted = 0;
		}
		else if(userInput2.equalsIgnoreCase("confirm")) {
			System.out.println("You have confirmed the transaction.");
			//logic for calculating exact change given back to user if too much is given
			if (total == moneyInserted) {
				System.out.println("You have paid the exact amount, your change is $0.00");
			}
			else {
				int changeGiven = moneyInserted - total;
				System.out.println("You have overpaid, your change is $" + changeGiven + ".00");
			}
			System.out.println("You made an exceelent choice! Enjoy your snack!");
		}
	}
}
