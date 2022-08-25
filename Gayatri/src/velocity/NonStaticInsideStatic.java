package velocity;

public class NonStaticInsideStatic {
	
	public void B1() {
		System.out.println("om");
	}
   public static void B2() {
	   NonStaticInsideStatic objB = new NonStaticInsideStatic() ;
	   objB.B1();
   }
   public static void main(String[]args) {
	   B2();
   }
}
