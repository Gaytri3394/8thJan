package array;

public class ArrayAsending {
	
	static int empty;
	
	public static void main(String[]args) {
		int[] a = {12,44,7,99,87,65,60,98,66,55,66,32,32,56,34,102,5678,32,78,69,0,102,156,876,456,342,234,321,9898,543};
		
		for(int i=0; i<a.length; i++){
	    for(int j=i+1; j<a.length; j++){
	    	
	    	if (a[i]>a[j]) 
	    	{
	    	empty = a[i];
	    	a[i]=a[j];
	    	a[j]=empty;
	    	}
	    }
		}
		
		System.out.print("After Sorting an array is asending: ");
		System.out.println();
		for(int i=0; i<a.length; i++)
		System.out.print(a[i]+" ");
	}

}
