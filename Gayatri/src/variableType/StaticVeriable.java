package variableType;

public class StaticVeriable {

	public static int a = 28;// Static variable with static method & non static method
	public static boolean b = true ; 
	
	public static void L1() {
		System.out.println(a);
	}
	public void L2() {
		System.out.println(a);
	}
	
	public static void L3() {
		System.out.println(b);
	}
	
	public void L4(){
	System.out.println(b);
	}
	
	public static void main(String[]args) {
	System.out.println(a);
	StaticVeriable objl = new StaticVeriable();
	L1();
	objl.L2();
	L3();
	objl.L4();
	
	
	}
}
