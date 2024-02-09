package sridhar;

public class string {

	public static void main(String[] args) {
			
			String name="Welcome To The Java";
			int vow = 0;
			int b=0;
			
			int length=name.length();
			System.out.println("Total length:"+ length);
			for (int i=0;i<name.length();i++) {
			char t=name.charAt(i);
			
			if (t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||
					t=='A'||t=='E'||t=='I'||t=='O'||t=='U'){
				vow++;
				
			}
			else {
				b++;
			
			}
			
			}									
			System.out.println(vow);
			System.out.println(b);
	}
	}


