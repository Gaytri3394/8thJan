package constructor;

public class DataInitialization {
	int a;
	int b;
	int c;
	
public DataInitialization(int a, int b, int c) {
	this.a = a;
	this.b = b;
	this.c= c;
	System.out.println(a+b+c);
	System.out.println(a-b-c);
}
public static void main (String[]args) {
	DataInitialization ok = new DataInitialization(23,45,99);
}
}