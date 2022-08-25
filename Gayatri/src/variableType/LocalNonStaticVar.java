package variableType;

public class LocalNonStaticVar {

	
	static int a = 223;
	float b =  22.90f;
	int c = 32;
	
	public void b1() {
		int a = 260;
		float b =99.45f;
		int c = 56;
		
		System.out.println(LocalNonStaticVar.a);
		System.out.println(this.b );
		System.out.println(this.c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	public static void main(String[]args) {
		LocalNonStaticVar obj = new LocalNonStaticVar();
		obj.b1();
	}
}
