package git.Bharath;

import java.util.Scanner;

public class JavaTest {
	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);
	        String name = scanner.nextLine();
	        char[] word = name.toCharArray();
	                 
	        String reverse = "";
	   
	 for(int i = name.length() - 1; i >= 0; i--)
	 {
	 reverse = reverse + name.charAt(i);
	 }
	  
	 System.out.println(reverse);
	         
	    }
}


