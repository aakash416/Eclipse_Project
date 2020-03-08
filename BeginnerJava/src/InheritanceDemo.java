class Clac
{
	public int add(int i,int j)
	{
		return i+j;
	}
	}
class ClacAdv extends Clac
{
	public int sub(int i,int j)
	{
		return i-j;
	}

}
class ClacVeryAdv extends ClacAdv
{
	public int mult(int i,int j)
	{
		return i*j;
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		
	
	ClacVeryAdv c1=new ClacVeryAdv();
	int result1=c1.add(3,4);
	int result2=c1.sub(8,6);
	int result3=c1.mult(6, 3);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	
}
}