package execption;

public class CustomException {
	
	public static void M1(int age) {
		if (age < 18)
			throw new IllegalArgumentException("Voting is not allowed");
		else
			System.out.println("Voting is allowed");
	}
	
	public static void main (String[]args) {
		CustomException ref = new CustomException();
		ref.M1(17);
		
		System.out.println("Upload Adhar Card");
	}

}
