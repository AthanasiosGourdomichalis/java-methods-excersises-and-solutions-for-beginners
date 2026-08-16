import java.util.Scanner;

class App2 {

	/*
	* 	Returns the mathematical combinations function C(n, k)
	*/
	static int combinations(int n, int k) {
		return factorial(n)/(factorial(k)*factorial(n-k));// using factorial() method it returns n! / (k! * (n - k)!)		
	} // combinations


	/*
	* 	Returns the factorial of n
	*/
	static int factorial(int n) {
		if (n==0){
			return 1;//the factorial of 0 is 1, (0! = 1)
		}else{
			int i=1;//counter for the product 1 * 2 * ... * n, calculates the factorial
			for(int j=1; j<=n; j++ ){//j is the counter that increments by one so that we multiply the product calculated so far by i with the corresponding number j
				i=i*j; // n! = 1*2*......*n
			}
			return i;//returns the factorial
		}//if-else statement
		
	}// factorial 
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);//Scanner object

		System.out.print("Give the first positive integer (n) = ");//message, first integer, is the number of elements in the set
		int n = in.nextInt();//input

		System.out.print("Give the second positive integer (k) = ");//message, second integer
		int k = in.nextInt();//input
		
		if (((n>0) && (k>0)) && (n>=k)){//check data validity based on the problem statement rules: n and k are positive integers and n >= k
			int c = combinations(n, k);
			System.out.println("The number of combinations is : " + c);//message
		} else {
			System.out.println("Your data input was invalid.");// appropriate message if the data is invalid
		}//if-else statement
	}//main

} // combinations