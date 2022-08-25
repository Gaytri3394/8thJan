package VerInheritance;

public class C2 extends C1{
	
	int a = 106;
	static int b = 107;
	int c = 108;
	static int d = 109;
	int e = 110;
	
	public void M1() {
		System.out.println(super.a);
		System.out.println(C1.b);
		System.out.println(super.c);
		System.out.println(C1.d);
		System.out.println(super.e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
  public static void main (String[]args) {
	  C2 Ab = new C2();
	  Ab.M1();
	}
}
