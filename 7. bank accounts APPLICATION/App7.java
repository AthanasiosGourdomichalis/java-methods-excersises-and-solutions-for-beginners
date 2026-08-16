import java.util.Scanner;

class App7  {

	public static void main(String args[]) {
		
		System.out.println("Creating an account ");// requested message
		Scanner in = new Scanner(System.in);// Scanner object 'in' to read account details (account number, customer name, and initial balance) input by the user

		System.out.print("Account Number  : ");//prompt for account number
		String number = in.nextLine();//input String

		System.out.print("Customer Name   : ");//prompt for customer name
		String name = in.nextLine();//input String

		System.out.print("Initial balance : ");//prompt for initial balance
		double balance = Double.parseDouble(in.nextLine());// converts String input to Double, using Double.parseDouble
		
    	Account Account1 = new Account (name, number, balance);// the application initially creates a bank account as an object of the Account class, calling the constructor

    		
		for (;;){
			System.out.println ("\n---------------");
			System.out.println ("1. Deposit");
			System.out.println ("2. Withdraw");
			System.out.println ("3. Account Details");
			System.out.println ("4. Add Interest");
			System.out.println ("0. Exit");
			System.out.println ("---------------");
			System.out.print ("> ");
			int choice = in.nextInt();
			if (choice == 1){
				System.out.println("Deposit ... ");//message
				System.out.println(Account1);//basically calling toString for readable printing of the object
				System.out.print("Amount: ");//message
				in.nextLine();//nextLine() before reading Amount basically flushes the buffer to avoid reading an empty line/String (since previous reads leave the '\n' newline unconsumed)
				double Amount = Double.parseDouble(in.nextLine());//converts String input to double, this is the deposit amount
				Account1.Deposit(Amount);//calls the deposit method of the Account class
				System.out.println("New Balance    : " + String.format("%.2f",Account1.getBalance()));// message and use of format() so that the account balance is displayed with two decimal places
			}
			else if (choice == 2) {
				System.out.println("Withdraw ... ");//message
				System.out.println(Account1);//basically calling toString for readable printing of the object
				System.out.print("Amount: ");//message
				in.nextLine();// nextLine() before reading Amount clears the buffer so we don't read an empty line/string, since previous inputs do not consume the '\n' newline character
				double Amount = Double.parseDouble(in.nextLine());//converts String input to double, this is the withdrawal amount
				Account1.Withdraw(Amount);//calls the withdraw method of the Account class
				System.out.println("New Balance    : " + String.format("%.2f",Account1.getBalance()));//message and use of format to display the account balance with two decimal places
			}
			else if (choice == 3) {
				System.out.println(Account1);//display account details. Basically calling toString for readable printing of the object
			}
			else if (choice == 4) {
				System.out.println("Add Interest ");//message
				System.out.println(Account1);//Basically calling toString for readable printing of the object
				Account1.addInterest();//calls addInterest of the Account class to calculate and add interest to the account balance
				System.out.println("New Balance    : " + String.format("%.2f",Account1.getBalance()));//message and use of format so that the account balance is displayed with two decimal places
			}
			else if (choice == 0) break;
		}

   }//main

}//class