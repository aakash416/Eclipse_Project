class casico
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	public void add(double i, double j)
	{
		System.out.println(i+j);
	}	
	}
public class MethodOverloding {
	public static void main(String args[])
	{
		casico obj=new casico();
		obj.add(2,4);
		obj.add(3,5,7);
		obj.add(2.5, 4.5);
	}

}
