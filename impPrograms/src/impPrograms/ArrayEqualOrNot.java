package impPrograms;

import java.util.Arrays;

public class ArrayEqualOrNot {

	public static void main(String[] args) {
		
		int a[]= {20,30,40};
		int b[]= {10,20,30};
		int c[]= {20,30,40};
		
		System.out.println(Arrays.equals(a , b));
		System.out.println(Arrays.equals(b , c));
		System.out.println(Arrays.equals(a , c));
	}
}
