package Calculator;

import java.util.Scanner;

public class BasicCalculator  {

	 int Num1;
	 int Num2;

	public BasicCalculator(int a, int b) {
		Num1=a;
		Num2=b;
	}



	void Add() {

		System.out.println("The Addition of " + Num1 + " & " + Num2 + " is : "+( Num1+Num2));

	}

	void Subtract() {
		System.out.println("The subtraction of " + Num1 + " & " + Num2 + " is : " + (Num1-Num2));

	}

	void Multi() {
		System.out.println("The Multiplication of " + Num1 + " & " + Num2 + " is : "+ (Num1*Num2));
	}

	void Devide() {

		System.out.println("The Devide of " + Num1 + " & " + Num2 + " is : "+ (Num1/Num2));
	}



	public static void main(String args[]) {

		System.out.println("Enter an operator to perform the Basic Calculator Function :\n ");
		Scanner Scnr =new Scanner(System.in);
		String inputoptr=Scnr.next();
		char optr=inputoptr.charAt(0);
		
		BasicCalculator calc = new BasicCalculator(50, 10);
		
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





