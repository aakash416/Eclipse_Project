package loops;

//Write a java program to count number of even and odd digits in a given integer?
public class EvenOddCount {
	public static void main (String args[])
	{
		int n=147223;
		int evenCount=0, oddCount=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
				evenCount++;
			else
				oddCount++;
			n=n/10;
		}
		System.out.println("Even Number Count = "+evenCount);
		System.out.println("Odd Number Count = "+oddCount);
	}

}
