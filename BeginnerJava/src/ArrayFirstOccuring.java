
public class ArrayFirstOccuring {

	public static void main(String[] args) {
// creating array
		Integer n[]={1,2,3,4,10,2,7};
		//loop the element from the first element
		for (int i=0; i<n.length; i++)
		{
			// loop the element the second element
			for(int j=i+1; j<n.length; j++)
			{
				if(n[i]==n[j])
				{
					System.out.println(n[i]);
					return;
				}
			}
		}
	}

}
