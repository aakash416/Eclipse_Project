class AB
{
	public void show()
	{
		System.out.println("in A show");
	}	
}
public class AnonymousDemo {
	public static void main(String[] args) {
	AB obj=new AB()
	{
		public void show()
		{
			System.out.println("im best");
		}
	};
	obj.show();
	}
}
