class clas
{
	int num1;
	int num2;
	int result;
	public clas (int num1, int num2)
	{
		this.num1=num1; //current object
		this.num2=num2;		
	}
	
}
public class Object2 {
	public static void main (String args [])
	{
		clas obj =new clas(4,5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}