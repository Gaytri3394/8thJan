package impPrograms;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		 String a = "agxis#%)*$%^*vcsjk1074775RK#@!)*%jsggd";
		  a = a.replaceAll("[^a-zA-Z0-9]", "");
		  System.out.print(a);

		 
	}
}
