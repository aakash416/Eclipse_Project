
public class Selection {
	public static void main (String args [])
	{
		int n=6;
		if (n==0)
		{
			System.out.println("Nothing");
			System.out.println("Number is Zero");
		}
		else if (n%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("NUmber is odd");
		
	//ternary operator
		//?: ->condition?exper1:exper2;
		
		int i=5;
		int j=0;
	//	if (i>6)
	//		j=1;
	//	else
	//		j=2;
		j=i>6?1:2;
		System.out.println(j);
		
		
		/////// Switch
		
		int s=4;
		switch(s)
		{
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Theree");
				break;
			case 4:
				System.out.println("Four");
				break;
			default:
					System.out.println("Nothing");
		}
		
	}

}
