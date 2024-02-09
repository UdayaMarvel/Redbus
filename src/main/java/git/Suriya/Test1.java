package git.Suriya;

public class Test1 {
	
public static void main(String[] args) {
		
		String s = "malayalam";
		String s1 ="";
		String st1 = "game";
		String st11 = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		// eg. palindrome
		for(int i=st1.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			st11=st11+ch;
				
	}
		if(s.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
       // eg. for not palindrome
	if(s.equals(st1)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}
	}

}
