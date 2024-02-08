package git.Udaya;


public class santos {
	public santos() {
		this(123);
		System.out.println("default ");	
	}
	
	public santos(int id) {
		this("sandy");
		System.out.println("default "+id);	
	}
	
	public santos(String name) {
		this(11.5f);
		System.out.println("string "+name);	
	}
	
	public santos(float value) {
		//this("123.32f");
		System.out.println("float "+value);	
	}
	
	public static void main(String[] args) {
		santos a = new santos();
	}
}


