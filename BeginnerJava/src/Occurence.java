import java.util.Scanner; 
class Occurence {  
  public static void count(String str) 
   { 
	int cou[] = new int[256]; // ranges
	int len = str.length(); 
	for (int i = 0; i < len; i++) 
		cou[str.charAt(i)]++; 
	char array[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
	   array[i] = str.charAt(i); 
	   int flag = 0; 
	   for (int j = 0; j <= i; j++) { 
		if (str.charAt(i) == array[j])  
			flag++;                 
	   } 
	   if (flag == 1)  
	      System.out.println("Occurrence of character " + str.charAt(i)
		 + " in the String is : " + cou[str.charAt(i)]);             
	} 
   } 
   public static void main(String[] args) 
   {  
	
	Scanner Obj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter your String");
    String userName = Obj.nextLine();  // Read user input
    String str = userName; 
	count(str); 
   } 
}