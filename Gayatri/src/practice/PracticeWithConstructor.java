package practice;

class PracticeWithConstructor {
	
	int Maths;
	int Chem;
	int Physc;
	
	public PracticeWithConstructor(int Maths, int Chem , int Physc) {
		this.Maths=Maths;
		this.Chem=Chem;
		this.Physc=Physc;
	}
	public void A1() {
	System.out.println("maths:"+ Maths);
	System.out.println("chem :"+ Chem);
	System.out.println("physc:"+ Physc);
	System.out.println(""+"toatal marks of Student:");
	}
	
public static void main(String[]args) {
	PracticeWithConstructor gayatri1 = new PracticeWithConstructor(12,14,16);
	PracticeWithConstructor gayatri2 = new PracticeWithConstructor(13,15,17);
	PracticeWithConstructor gayatri3 = new PracticeWithConstructor(18,19,10);
    gayatri1.A1();
    System.out.println(gayatri1.Maths+ gayatri1.Chem+ gayatri1.Physc);
    gayatri2.A1();
    System.out.println(gayatri2.Maths+gayatri2.Chem+gayatri2.Physc);
    gayatri3.A1();
    System.out.println(gayatri3.Maths+gayatri3.Chem+gayatri3.Physc);
  }
}
