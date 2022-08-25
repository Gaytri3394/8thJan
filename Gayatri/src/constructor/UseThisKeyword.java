package constructor;

public class UseThisKeyword{
		
		public UseThisKeyword() {
			this(45);
			System.out.println("bobo is cute 1");
		}
		
		public UseThisKeyword(int a) {
			System.out.println("bobo is cute 2");
		}
				public static void main (String[]args) {
			UseThisKeyword obj = new UseThisKeyword();
	//		UseThisKeyword obj1 = new UseThisKeyword(45);

		}

	}

