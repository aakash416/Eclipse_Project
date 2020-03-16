import java.util.Scanner;

//Write a program to print the sum of squares of the elements of an array of size N. N can be any integer between 1 and 100. 


public class SumOfN {
	public static void main (String []args)
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int numArray[] =new int[N];
		
		int sum=0;
		for (int i=0; i<N;i++)
		{
			numArray[i]=s.nextInt();
		}
		for (int i=0; i<N; i++)
		{
			sum+=numArray[i]*numArray[i];
		}
		System.out.println(sum);
		s.close();
	}

}
