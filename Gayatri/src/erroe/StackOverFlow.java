package erroe;

public class StackOverFlow {

	public void M1() {
		System.out.println("M1 is running");
		M2();
	}
	public void M2() {
		System.out.println("M2 is running");
		M1();
	}
	public static void main(String[]args){
		StackOverFlow obj = new StackOverFlow();
		obj.M1();
		
	}
	
	

}
