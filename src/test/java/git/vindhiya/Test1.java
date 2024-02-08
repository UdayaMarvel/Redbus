package git.vindhiya;

public class Test1 {
	public static void main(String[] args) {
		int n=898756;
		int i,j=0;
		
		while(n>0) {
		i=n%10;
		j=(j*10)+i;
		n=n/10;
		}
		if(n==j) {
			System.out.println("palindrom"+j);
		}
		else {
			System.out.println("not a polindrom"+j);
			
		}
		  	

	}}
