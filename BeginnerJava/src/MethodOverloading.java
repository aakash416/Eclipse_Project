class casio
{
	int num1;
	int num2;
	String operation;
	public casio()
	{
		num1=0;
		num2=0;
		operation="nothing";
	}
	public casio(int i)
	{
		num1=i;
		num2=0;
		operation="nothing";
	}
	public casio(int i, int j)
	{
		num1=i;
		num2=j;
		operation="nothing";
	}
	public casio(int i, int j, String op)
	{
		num1=i;
		num2=j;
		operation=op;		
	}
}
public class MethodOverloading {
	public static void main (String args[])
	{
		casio obj=new casio(4,5,"Add");
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.operation);

	}

}
