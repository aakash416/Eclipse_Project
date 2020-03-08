class calc
{
	int numb1;
	int numb2;
	int result;
	
	public void perform()
	{
		result=numb1+numb2;
	}
}

public class Object {
	public static void main (String args [])
	{
		calc obj=new calc(); //knows something and does something
		obj.numb1=4;
		obj.numb2=6;
		obj.perform();
		System.out.println(obj.result);
		
	}

}
