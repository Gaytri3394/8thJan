package polymorphism;

public class Overloadingchild extends OverloadingParent{
	
	public void G1(int a , int b) {
		System.out.println("C-c");	
	}
	
	public static void main(String[]args) {
		OverloadingParent obj = new Overloadingchild();
		obj.G1();
		obj.G1(50);
		
		
	}

}
