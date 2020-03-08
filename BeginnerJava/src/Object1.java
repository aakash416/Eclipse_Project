class Cal
{
	int num1;
	int num2;
	int result;
	
	public  Cal()
	{
		num1 =4;
		num2 =4;
		System.out.println("In constructor");
	}
	public Cal(int n)
	{
		num1 =n;
		num2 =n;		
	}
	public Cal(double d, int n)
	{
		num1=(int) d;
		num2=n;
	}
	}
public class Object1 {
	public static void main(String args [])
	{
		Cal obj= new Cal(9.5,8); //constructor
		
		System.out.println(obj.num1);
		
	}

}
