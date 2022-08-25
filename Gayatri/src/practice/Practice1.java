package practice;

public class Practice1 {
	
	public int a= 17;
	
	
	public static void main(String[]args) {
		Practice1 objk = new Practice1();
		System.out.println(objk.a);
		
		Practice1 objk2 = new Practice1();
		objk2.a=44;
		System.out.println(objk.a);
		System.out.println(objk2.a);
	}

}
