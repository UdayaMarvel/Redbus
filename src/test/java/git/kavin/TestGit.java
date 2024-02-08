package git.kavin;

public class TestGit {
  public static void main(String[] args) {
	
	  int sumOfOdd =0;
	  int sumOfEven =0;
	  
	  for (int i = 0; i <=100 ; i++) {
		if (i%2==0) {
			sumOfEven +=i;
		}else {
			sumOfOdd+=i;
			
		}
	}
	  
	  System.out.println("Sum of Odd Numbers: " + sumOfOdd);
	  System.out.println("Sum of Even Numbers: " + sumOfEven);
}
}
