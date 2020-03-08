class calcc
{
	int num1;
	int num2;
	int result;
	public calcc (int num1, int num2)
	{
		this.num1=num1;// current object
		this.num2=num2;
	}
	
}
public class Object3 {
	public static void main (String args[])
	{
		calcc obj=new calcc(4,5); //constructor
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
	}

}
