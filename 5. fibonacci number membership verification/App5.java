class App5 {
	
	public static void main(String args[]){// main accepts the args array of strings as an argument

		int number = Integer.parseInt(args[0]);//parse the string to int, so our application takes an integer argument when executed


		if(number==0){// special case, number = 0, the first Fibonacci sequence number
			System.out.println("Fibonacci number = " + number);//message
			System.out.println(number + " is a fibonacci number ");// 0 is a sequence number
		}else if (number==1){// special case, number = 1, the second Fibonacci sequence number
			System.out.println("Fibonacci number = 0");//first, message for 0
			System.out.println("Fibonacci number = " + number);//message for 1
			System.out.println(number + " is a fibonacci number ");// 1 is a sequence number
		}else{ // general cases, the algorithm step

		int first=0; //F0=0
		int prev=1; //F1=1

		//by definition, the first two Fibonacci numbers are 0 and 1
		
		System.out.println("Fibonacci number = " + first);
		System.out.println("Fibonacci number = " + prev);//message for the first 2

		int cur = first+prev;//each subsequent number is the sum of the two preceding ones

		for (;;){ //a for loop without initialization, condition, and step is an infinite loop, terminated by break
			System.out.println("Fibonacci number = " + cur);
			first = prev; 
			prev = cur;
			cur = first+prev; // Fn = Fn-1 + Fn-2
			if (cur >= number){break;}//break the loop if we exceed the number being checked for Fibonacci
		}

		System.out.println("Fibonacci number = " + cur);//for numbers in the sequence, the inner loop message is not displayed since the if breaks the loop, so we display the message outside the loop
		if (cur == number ){//if the last number in the loop is a Fibonacci number, then the user's parameter is a Fibonacci number, so we display the message
			System.out.println( number + " is a fibonacci number "  );//message if it is Fibonacci
		} else {
			System.out.println( number + " is not a fibonacci number " );//otherwise message if it is not Fibonacci
		}//if-else
			
	}//if-else if-else
		
	}//main
}//class

