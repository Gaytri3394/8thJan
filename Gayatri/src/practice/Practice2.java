package practice;

public class Practice2 {

	int maths;
	int chem;
	int phys;
	static int outoff=100;
	
	public static void main() {
		Practice2 gayatri = new Practice2();
		Practice2 saurabh = new Practice2();
		Practice2 sangeeta = new Practice2();
		
		gayatri.maths=40;
		gayatri.chem=55;
		gayatri.phys=65;
		
		saurabh.maths=54;
		saurabh.chem=82;
		saurabh.phys=34;
		
		sangeeta.maths=52;
		sangeeta.chem=74;
		sangeeta.phys=66;
		
		System.out.println("Marks of gayatri Maths , Chem , Phys :"+gayatri.maths+" "+gayatri.chem+" "+gayatri.phys);
		System.out.println("Marks of saurabh Maths , Chem , Phys :"+saurabh.maths+" "+saurabh.chem+" "+saurabh.phys);
		System.out.println("Marks of sangeeta Maths , Chem , Phys :"+sangeeta.maths+" "+sangeeta.chem+" "+sangeeta.phys);
	}
}
