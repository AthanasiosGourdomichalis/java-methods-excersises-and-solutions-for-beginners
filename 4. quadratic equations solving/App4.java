import java.util.Scanner;

class App4 {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);//Scanner type object

		System.out.print("Enter the first number: ");//prompt for number a
		double a = in.nextDouble();//input, double number a
		
		System.out.print("Enter the second number: ");//prompt for number b
		double b = in.nextDouble();//input, double number b

		System.out.print("Enter the third number: ");//prompt for number c
		double c = in.nextDouble();//input, double number c
		
//now we have the standard quadratic equation ax^2 + bx + c = 0

		if (b*b - 4*a*c <0.0){//if the radicand is a negative number, the equation has no real roots and our program displays a message
			System.out.println("There are no real values for the quadratic equation. ");// message indicating no real roots exist
		} else {
			double res1 = (-b + Math.sqrt(b*b - 4*a*c))/ (2*a) ;//the first root is obtained by using +
			double res2 = (-b - Math.sqrt(b*b - 4*a*c))/ (2*a) ;//the second is obtained by using the -

			System.out.printf("The first solution is : %.3f%n", res1 );//format the result to 3 decimal places, first solution
			System.out.printf("The second solution is : %.3f%n", res2 );//format the result to 3 decimal places, second solution
		}//if-else
	}//main
}//class

