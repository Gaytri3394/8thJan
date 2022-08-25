package VerInheritance;

public class Cls2 extends Cls1 {
	
	int a = 200;
	static int b = 105;
	
	public void m1() {
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String[]args) {
		Cls2 aa = new Cls2();
		aa.m1();
	}
	}
