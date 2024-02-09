package git.Poyyali;

public class Stringprograme {
	public static void main(String[] args) {
		String name ="welcome to the java";
		String mm="";
		String output = "";
		String [] sp = name.split(" ");
		for (int i =sp[0].length()-1;i>=0; i--){
			char ca = sp[0].charAt(i);
			mm = mm+ca;
			}
		output=mm+" "+sp[1]+" "+sp[2]+" "+sp[3];
		System.out.println(output);
	}

}
