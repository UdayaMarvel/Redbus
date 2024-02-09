package git.Sneha;

public class Test1 {
	public static void main(String[] args) {
		 int n=153;
		 int a,b=0;
		 int i=n;
		 while(n>0) {
			 a=n%10;
			 b=(a*a*a)+b;//b=(b*10)+a;
			 n=n/10; 
		 }
		 if(i==b) {
			 System.out.println("Amstrong");
		 }else
		 {
			 System.out.println("Not a Amstrong");
		 }
	}

}
