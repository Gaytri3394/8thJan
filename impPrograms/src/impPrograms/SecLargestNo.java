package impPrograms;

public class SecLargestNo {

	public static void main(String[] args) {
		int []a = {12,13,66,78,90,101,888,23,26,72,111};
		int empty = 0;
		
		for(int i = 0; i<a.length; i++) {
			for(int j =i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					empty = a[i];
					a[i]=a[j];
					a[j]=empty;
				}
			}
		}
		System.out.println("Result:" +a[1]);
		
	}
}
