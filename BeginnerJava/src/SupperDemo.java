class A
{
	public A()
	{
		System.out.println("in a");
	}	
	public A(int i)
	{
		System.out.println("in int a");
	}
	
}
class B extends A
{
	public B()
	{
		super();
		System.out.println("in b");
	}
	public B(int i)
	{
		super(i);
		System.out.println("in int b");
	}
}

public class SupperDemo {
	public static void main(String[] args) {
		B obj=new B(5);
	}

}
