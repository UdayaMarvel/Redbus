package git.karna;

import java.util.Arrays;

public class Count {
	public static void main(String[] args) {
		String str = "Java is a Programming Language";
		char[] c = str.toCharArray();
		System.out.println(str);
		Arrays.sort(c);
		for(int i=1;i<c.length;i++) {
			int count = 0;
			if(c[i]!=c[i-1]) {
				for(int j=i;j<c.length;j++) {
					if(c[i]==c[j]){
						count+=1;
					}
				}System.out.println(c[i]+" : "+count);
			}
		}
	}
}
