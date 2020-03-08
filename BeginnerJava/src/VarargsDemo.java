class Varargs
{
	public int add(int ...n) // Variable length argument 
	{
		int sum=0;
		for(int i:n)
		{
			sum=sum+i;
		}
		return sum;
	}
	
}
public class VarargsDemo {
	public static void main(String[] args) {
		Varargs obj=new Varargs();
		System.out.println(obj.add(3,5,3,5,7,7,3,6,7,2,323,55,45));
	}

}
