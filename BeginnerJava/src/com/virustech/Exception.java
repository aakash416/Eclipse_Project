package com.virustech;

public class Exception {
	public static void main(String[] args) {
		try{
			int i=5;
			int j=3;
			int k=i/j;
			System.out.println("output is "+k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("erro");
		}
		finally
		{
			System.out.println("bye");
		}
	}

}
