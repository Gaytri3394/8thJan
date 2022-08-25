package array;

public class ReversArray {
	
	public static void main(String[]args) {
		int[]a= {10,29,45,65,87,98,100,34,65,81,75};
		
		System.out.print("Before Reversing: ");
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
			
		System.out.print("Before Reversing: ");
		for (int i=a.length-1; i>=0; i--)
			System.out.print(a[i]+" ");
	}

}
