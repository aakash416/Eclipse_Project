
public class Operator
/*
 * Arithmetic +,-,*,/, %
 * Bitwise << >>
 * Relational 
 * Logical
 */

{
	public static void main(String args[])
	{
		int m=6, n=4;
		int a1 = m+n;
		int a2 = m-n;
		int a3 = m*n;
		double a4 = (double)m/n;
		int a5 = m%n;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
	/*	
		++n; // pre increment 
		n++; // post increment
		*/
		m = ++n;
		
		
		System.out.println(m);
		System.out.println(n);
		
	}

}
