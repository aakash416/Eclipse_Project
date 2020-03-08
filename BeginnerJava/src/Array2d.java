
public class Array2d {
	public static void main(String []args)
	{
		int d[][]={
				{1,3,5,5},
				{3,5,6,7},
				{2,5,7,8}				
		};
		for (int i=0;i<d.length;i++) // d.length is using jagged Array
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int k[]:d)
		{
			for (int l:k)
			{
				System.out.print(" "+l);
				
			}
			System.out.println();
		}
		
	}

}
