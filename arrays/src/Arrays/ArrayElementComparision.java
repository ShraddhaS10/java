package Arrays;

public class ArrayElementComparision {

	public static void main(String[] args) {
		String[] stringArray1 = {"Sagar", "Kunal", "Jatin", "Rohit", "Rohan"};
		String[] stringArray2 = {"Sagar", "Kunal", "Jatin", "Rohit", "Rohan"};
		
		Boolean its = isArrayEqual(stringArray1,stringArray2);
		System.out.println(its);
	}
	
	public static boolean isArrayEqual(String[] stringArray1, String[] stringArray2) {
		int sizeArray1 = stringArray1.length;
		int sizeArray2 = stringArray2.length;
		
		if(sizeArray1 != sizeArray2)
			return false;
		else {
			for(int i = 0; i<sizeArray1;i++) 
				if(stringArray1[i]!=stringArray2[i]) 
					return false;	
					
			return true;
		}
	}
}
