import java.util.Scanner;

public class NumberDemo {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the maximum Number to print");
		int n=scanner.nextInt();
		for(int i=1; i<=n;i++)
		{
			System.out.println("The number is ="+i);
		}
				
				
	}

}
