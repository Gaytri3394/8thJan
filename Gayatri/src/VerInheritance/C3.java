package VerInheritance;

public class C3 extends C2 {
	
	int a = 111;
	static int b = 112;
	int c = 113;
	static int d = 114;
	int e = 115;
	
	public void M3() {
		C1 obj = new C1();
		System.out.println(obj.a);
		System.out.println(C1.b);
		System.out.println(obj.c);
		System.out.println(C1.d);
		System.out.println(obj.e);
		System.out.println(super.a);
		System.out.println(C2.b);
		System.out.println(super.c);
		System.out.println(C2.d);
		System.out.println(super.e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
	
	public static void main(String[]args) {
		C3 Ac = new C3();
		Ac.M3();
	}

}
