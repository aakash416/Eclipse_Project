import java.util.Scanner;

//Java calculator program with explanation

public class Calculator {
	public static void main (String args [])
	{
		double num1, num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Numbers");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		System.out.println("Enter an operator to performe operation (+,-,*./)");
		char op=sc.next().charAt(0);
		double o=0;
		switch (op) {
		case '+':
			o=num1+num2;
			break;
		case '-':
			o=num1-num2;
			break;
		case '*':
			o=num1*num2;
			break;
		case '/':
			o=num1/num2;
			break;
		default:
			System.out.println("You have entered wrong operator");
			break;
		}
		System.out.println("output is: "+" "+num1+"  "+op+" "+num2+" = "+o);
	}
}