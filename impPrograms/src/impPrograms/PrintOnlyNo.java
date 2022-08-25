package impPrograms;

public class PrintOnlyNo {
	
	public static void main(String[] args) {
		
		String a = "ankkefgggsbf940805y#%^$#@76528hku";
		
		a = a.replaceAll("[^0-9]","");
	     System.out.println(a);
	}

}
