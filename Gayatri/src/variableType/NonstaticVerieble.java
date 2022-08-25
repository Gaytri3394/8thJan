package variableType;

public class NonstaticVerieble { //Static variable with static method & non static method

	public int c = 33;
	public boolean d = true;
	 
	public static void F1() {
		NonstaticVerieble objF1 = new NonstaticVerieble();
		System.out.println(objF1.c);
	}
	public void F2() {
		System.out.println(c);
	}
	public static void F3() {
		NonstaticVerieble objF2 = new NonstaticVerieble();
		System.out.println(objF2.d);
	}
	public void F4() {
		System.out.println(d);
	}
	
	public static void  main (String[]args) {
		F1();
		NonstaticVerieble objF2 = new NonstaticVerieble();
		objF2.F2();
		F3();
		NonstaticVerieble objF4 = new NonstaticVerieble();
		objF4.F4();
	}
}
