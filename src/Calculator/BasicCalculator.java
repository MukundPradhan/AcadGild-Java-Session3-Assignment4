package Calculator;

import java.util.Scanner;


public class BasicCalculator  {

	private static Scanner scnr;

	public static void main(String args[]) {

		System.out.println("Enter an operator to perform the Basic Calculator Function :\n ");
				
		scnr = new Scanner(System.in);
		String inputoptr=scnr.next();
		char optr=inputoptr.charAt(0);
		
		Functions calc = new Functions(50, 10);

		switch (optr) {
		case '+':
			calc.Add();
			break;
		case '-':
			calc.Subtract();
			break;
		case '*':
			calc.Multi();
			break;
		case '/':
			calc.Devide();
			break;

		default:
			System.out.println("Please Enter a valid operator !!!");
			break;
		}
	}
}





