import java.util.Scanner;

public class VowelDemo {
	public static void main(String[] args) {
		System.out.println("Enter some string");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char[] Chars=str.toCharArray();
		int count=0;
		for(char c:Chars)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;	
			}
	}
		System.out.println("Number of vowel="+count);


}
}
