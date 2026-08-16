import java.util.Scanner;

class App3 {
	
	/*
	* 	Returns the mathematical combinations function C(n, k)
	*/
	static int combinations(int n, int k) {
		return factorial(n)/(factorial(k)*factorial(n-k));//combinations calculation
		
	} // combinations


	/*
	* 	Returns the factorial of n
	*/
	static int factorial(int n) {
		if (n==0){
			return 1;
		}else{
			int i=1; //counter 1, 2, 3, ..., n for the calculation
			int res=1; //result
			long res_long=1; //long result, for the overflow check

			while(i<=n){
				if ( res_long > Integer.MAX_VALUE){//iteratively check, during factorial calculation, that no integer overflow occurs
					res = -1;//the result is assigned the value -1 in case of overflow
					break;//if overflow occurs, then the calculation does not continuen sumbei uperxeilisi, tote den sinexizetai o upologismos
				}

				res_long = res_long*i ;// n!=1*2*....*n
				i++;//increment by one
			}

			if (res!=-1) {//no overflow occurred
				res = (int) res_long;//at the end, the result of the calculation is assigned to the variable res
			}
			return res;// returns res which is of type int

		}//if-else statement

	}// factorial
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);//Scanner class object

		System.out.print("Give the first positive integer (n) = ");//message
		int n = in.nextInt();//input-first integer

		System.out.print("Give the second positive integer (k) = ");//message
		int k = in.nextInt();//input-second integer
		
		if (((n>0) && (k>0)) && (n>=k)){//validity check
			if ((factorial(n)==-1) || (factorial(k)==-1) || factorial(n-k)==-1){// check that no overflow occurred in any of the required factorials for calculating the number of combinations
				System.out.println("Error: Factorial result variable has had Integer Overflow.");//in case of overflow, the program displays an appropriate message and terminates its execution
			}
			else {int c = combinations(n, k);//calculate combinations using the static method 
			System.out.println("The number of combinations is : " + c);//message
			}
		} else {
			System.out.println("Your data input was invalid.");//error message for invalid input
		}//if-else statement
		
	}//main
		
}//class

