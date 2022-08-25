package impPrograms;

public class Duplicate1 {
	
	public static void main(String[] args) {
		
		String a = "gayatrri";
		char[] ar = a.toCharArray();
		
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
				System.out.println(ar[j]);
				}
			}
		}
			
	}

}
