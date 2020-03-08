class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	public Emp() //when you create an object
	{
		eid=1;
		salary=30000;
		System.out.println("in constructor");
	}
	static // when you load a class
	{
		ceo="Rahul";
		System.out.println("in static");
	}
	public void show()
	{
		System.out.println(eid +" : "+salary+" : "+ceo);
	}
}
public class StaticDemo {
	public static void main (String args[])
	{
		Emp navin=new Emp();
		Emp rahul=new Emp();
		
		navin.show();
		rahul.show();
		
	}

}
