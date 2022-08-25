package variableType;

public class LocalStaticVar {

	static int a = 21;
	boolean b = true ;
	int c =  45;
	
	public static void a1() {
		int a = 87;
		boolean b = false ;
		int c =  65;
		
		System.out.println(LocalStaticVar.a);
		LocalStaticVar obj = new LocalStaticVar();
		System.out.println(obj.b);
		LocalStaticVar obj1 = new LocalStaticVar();
		System.out.println(obj1.c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
   public static void main(String[]args) {
	a1();
   }
}
