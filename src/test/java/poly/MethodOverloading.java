package poly;

public class MethodOverloading {

	public void studentDetails(int regno)
	{
		System.out.println("student register number:" +regno);
	}
	public void studentDetails(String name)
	{
		System.out.println("student name:" +name);
	}
	
	public static void main(String[] args) {
		MethodOverloading c= new MethodOverloading();
		c.studentDetails(123);
		c.studentDetails("karthick");
	}
}
