//How to reverse words in String in java?

public class WordReverse {
	public static void main(String[] args) {
		String str="welcome to java world";
		String spiltArray[]=str.split(" ");
		for(int i=spiltArray.length-1;i>=0;i--)
		{
			System.out.print(spiltArray[i]+" ");
		}
	}

}
