class Account {

   	private final double interest = 0.015 ; //interest rate used to calculate period interest, is double, fixed at 1.5% for all accounts and time, defined as final
	private String name; //customer name
	private String number;//account number
	private double balance;//and the account balance in euros

	//define variables as private for data hiding, initialize them via Constructor, and grant access using getter and toString methods

   	Account (String name, String number, double balance) { //the Account class has a constructor with parameters for customer name, account number, and initial balance
		this.name = name;
		this.number= number;
		this.balance = balance;
   	}//Constructor

   	double Deposit (double Amount){//method that performs a deposit, the amount is passed as a parameter
		if (Amount > 0.0) {//if the amount is greater than zero
			this.balance += Amount;//increases the account balance by the amount
		} else {//diaforetika
			System.out.println("Error: Deposit Amount is invalid ");//displays an appropriate message
		}
		return this.balance;//returns the account balance
   	}//Deposit

	double Withdraw (double Amount) {//method that performs a withdrawal, the amount is passed as a parameter
		if ((Amount > 0.0) && (this.balance > Amount)){// if the withdrawal amount is greater than 0 and if the balance is GREATER than the withdrawal amount
			this.balance -= Amount;//decreases the account balance by the amount
		}
		else if ( Amount <= 0.0){System.out.println("Error: Withdraw Amount is invalid ");}//otherwise displays an appropriate message
		else if (this.balance <= Amount ){System.out.println("Error: Insufficient funds ");}//otherwise displays an appropriate message

		return this.balance;//returns the account balance
   	}//Withdraw

	double getBalance (){//getter
		return this.balance;//returns the account balance
	}//getBalance

   	double addInterest (){
		this.balance += interest*this.balance ;//adds interest to the account balance based on the interest rate for one period
		return this.balance;//returns the account balance
	}//addInterest

   	public String toString(){// implementation of toString, to allow printing the object in a readable format with System.out.println
		return "Account Number : " + this.number + 
		"\nCustomer Name  : " + this.name +
		"\nBalance        : " + String.format("%.2f",this.balance);//returns a string with the account details as requested. Note the balance formatting with 2 decimal places
   	}
}
