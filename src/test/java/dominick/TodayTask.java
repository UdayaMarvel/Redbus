package dominick;

public class TodayTask {
	public static void main(String[] args) {
		String name = "Virat Kohli";
		String rev = "";
		for (int i = name.length()-1; i>=0; i--) {
			char charAt = name.charAt(i);
			rev = rev+charAt;
			
		}
		System.out.println(rev);
		
	}

}
