package Calculator;

public class Functions {

	int Num1;
	int Num2;

	public Functions(int a, int b) {
		// TODO Auto-generated constructor stub

		Num1=a;
		Num2=b;
	}


	public void Add() {

		System.out.println("The Addition of " + Num1 + " & " + Num2 + " is : "+( Num1+Num2));

	}

	public void Subtract() {
		System.out.println("The subtraction of " + Num1 + " & " + Num2 + " is : " + (Num1-Num2));

	}

	public void Multi() {
		System.out.println("The Multiplication of " + Num1 + " & " + Num2 + " is : "+ (Num1*Num2));
	}

	public void Devide() {

		System.out.println("The Devide of " + Num1 + " & " + Num2 + " is : "+ (Num1/Num2));
	}



}
