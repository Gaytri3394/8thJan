package constructor;

public class ConstructorIntro {
	
	public ConstructorIntro() {
		System.out.println("bobo is cute 1");
	}
	
	public ConstructorIntro(int a) {
		System.out.println("bobo is cute 2");
	}
	
	public ConstructorIntro(boolean a) {
		System.out.println("bobo is cute 3");
	}
	
	public ConstructorIntro(float c) {
		System.out.println("bobo is cute 4");
	}
	
	public ConstructorIntro(int a , int b) {
		System.out.println("bobo is cute 5");
	}

	public ConstructorIntro(boolean a , int b) {
		System.out.println("bobo is cute 6");
	}
	public static void main (String[]args) {
		ConstructorIntro obj = new ConstructorIntro();
		ConstructorIntro obj1 = new ConstructorIntro(45);
		ConstructorIntro obj2 = new ConstructorIntro(true);
		ConstructorIntro obj3= new ConstructorIntro(56.7f);
		ConstructorIntro obj4 = new ConstructorIntro(44,90);
		ConstructorIntro obj5 = new ConstructorIntro(false,109);

	}

}
