package Methods;
import java.util.*;
public class intro {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter 1 for addition\n"
				+ "Enter 2 for subtraction\n"
				+ "Enter 3 for multiplication\n"
				+ "Enter 4 for division");
		int choice = key.nextInt();
		
		System.out.println("Enter x: ");
		double x = key.nextDouble();
		System.out.println("Enter y: ");
		double y = key.nextDouble();
		
		
		switch(choice) {
			case 1: 
				System.out.println(add(x,y));
				break;
			case 2:
				System.out.println(sub(x,y));
				break;
			case 3:
				System.out.println(mul(x,y));
				break;
			case 4:
				System.out.println(div(x,y));
				break;
			default: 
				System.out.println("Wrong choice!");


		}
			
	}
	
	public static double add(double x, double y) {
		double result = 0;
		result = x + y;
		return result;
	}
	
	public static double sub(double x, double y) {
		double result = 0;
		result = x - y;
		return result;
	}
	
	public static double mul(double x, double y) {
		double result = 0;
		result = x * y;
		return result;
	}

	public static double div(double x, double y) {
		double result = 0;
		result = x / y;
		return result;
	}
}
