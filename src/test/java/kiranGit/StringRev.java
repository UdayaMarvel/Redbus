package kiranGit;

public class StringRev {
	public static void main(String[] args) {
        String ref = "This is task";
        String[] split = ref.split(" ");
        String rev = split[2]+" "+split[1]+" "+split[0];
        System.out.println(rev);
        
    }

}
