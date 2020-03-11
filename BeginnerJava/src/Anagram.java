//Write a java program to check two Strings are anagrams or not by sorting and comparing strings?

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc= new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println("Both String is Anagram = "+anagramCheck(str1,str2));
	}
	public static boolean anagramCheck (String str1, String str2)
	{
		char [] char1=str1.toCharArray();
		char [] char2=str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		return Arrays.equals(char1, char2) ;
	}

}
