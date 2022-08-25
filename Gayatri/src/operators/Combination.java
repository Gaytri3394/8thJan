package operators;

public class Combination {
	
	
	public static void main(String[]args) {
		int x = 45;
		int y = 65;
		
		if (x>y) {
			System.out.println("gayatri");//no
		}
		if (x<y) {
			System.out.println("Saurabh");// yes
		}
		if (x==y) { // equal condition
			System.out.println("Krishika");// no
		}
		if (!(x>y)) {
			System.out.println("om");// yes
		}
		if (!(x<y)) {
			System.out.println("vihan");// no
		}
		if (!(x>y)) {
			System.out.println("raju");// yes
		}
		if (x!=y) {
			System.out.println("Aradhya");
		}
		if ((x<y)&&(x==45)) {
			System.out.println("hrudai");// yes
		}
		if ((x>y)&&(y==65)) {                // and condition (even if one is false then it does not give output )
			System.out.println("pari");// no
		}
		if ((x<y)||(y==65)) // or condition (even if one is true then it gives output)
			System.out.println("vandana");
	}

}