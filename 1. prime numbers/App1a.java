import java.util.Scanner;

class App1a { 
	
	boolean isPrime(int x){ //integer parameter
		boolean flag=true;
		int i=2; //starting from 2, we check if each i in (1, x-1) divides x
		while((i<=x-1) && (flag==true)){ // we reach up to at most the number preceding int x, as long as the number being checked has no divisors in (1, x-1)
			if (x%i==0){ //if x is divisible by i
				flag = false; //x is not prime
			}
			i++; //increment by one
		}//while-block
		return flag; //true or false
	}//isPrime
		
		
    
		
  	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in); //Scanner object
		System.out.print("Give an integer number : ");//message
		int number = in.nextInt(); //reads an integer from the user

		App1a test = new App1a(); //App1a object, to call the non-static method isPrime
		if (test.isPrime(number)==true){ //check that it is prime
			System.out.println("Your number is a prime number.");//is prime
		}else{
			System.out.println("Your number is NOT a prime number.");//is not prime
		}//if-else statement
		
     	
   	}//main

}//class

