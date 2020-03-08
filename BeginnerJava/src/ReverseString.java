//How to reverse a String in java using recursion?

public class ReverseString {
	public static void main(String[] args) {
		String s="Aakash";
		System.out.println(recursiveString(s));
	}
	private static String recursiveString(String s)
	{
		if(s==null || s.length()<=1)
		{
			return s;
		}
		return recursiveString(s.substring(1))+s.charAt(0);
		
	}

}
