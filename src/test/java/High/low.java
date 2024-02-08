package High;

public class low  {
public low() {
	this(234);
	System.out.println("Default Constructor");
}
public low(int id) {
	this ("dot");
	System.out.println("int Constructor");
}
public low(String Name) {
	this(true);
		System.out.println("String Constructor");
}
public low(float value) {
	super();
	System.out.println("float Constructor");
}
public low(boolean Constructor) {
	this(134.67f);
		System.out.println("boolean Constructor");
}
public static void main(String[]args) {
   low c= new low();
   
   
}
}