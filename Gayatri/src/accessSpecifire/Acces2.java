package accessSpecifire;

public class Acces2 {
	
	public static void main(String[]args) {
		
		Acce1.M1();// static method
		Acce1 obj10 = new Acce1();// non static method
		obj10.M2();
		System.out.println(Acce1.a);// static var
		System.out.println(obj10.b);// non static var
	}
	
}
