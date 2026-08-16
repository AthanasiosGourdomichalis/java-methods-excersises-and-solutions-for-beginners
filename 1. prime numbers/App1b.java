import java.util.Scanner;

class App1b {
		
    static boolean isPrime(int x){
		boolean flag=true;
		int i=2;
		while((i<=x-1) && (flag==true)){
			if (x%i==0){
				flag = false;
			}
			i++;
		}//while-block
		return flag;
	}//we check if x is prime in the exact same way, except isPrime is static so that we don't need to instantiate an App1b object
		
  	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Give an integer number : ");
		int number = in.nextInt();
	
	
		if (isPrime(number)==true){//we DO NOT instantiate an App1b object; the method is static, so we invoke it directly inside main
			System.out.println("Your number is a prime number.");
		}else{
			System.out.println("Your number is NOT a prime number.");
		}//if-else 
			
			 
		}//main

}//class





