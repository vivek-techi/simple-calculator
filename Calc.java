package calculator;

import java.util.Scanner;

public class Calc { 
	public static void main(String[]args) { 
		double num1,num2;
		
		Scanner chart = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		
		 num1 = chart.nextDouble();
		 num2 = chart.nextDouble();
		
		System.out.println("enter an operator (+,-,*,/): ");
		char operator = chart.next().charAt(0);
		
		double result;
		
		switch (operator) {
		case '+':
			
			result = num1 + num2 ;
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
			
			
			default:
				System.out.println("please enter the correct operator");
				return;
				
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		
	}

}
