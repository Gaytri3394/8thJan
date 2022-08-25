package argumentAndReturnType;

public class WithArgumentlAndNoReturnType {
	
	public static void d1(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
	}
	
	public void d2(int d,int e) {
		int f=d-e;
		System.out.println(f);
	}
	
	public static void main(String[]args) {
		d1(12,98);
		WithArgumentlAndNoReturnType oj = new WithArgumentlAndNoReturnType();
		oj.d2(35, 10);
	}

}
