package Arrays;

public class Arrays {
	
	public static void main(String[] args) {
		
		int[] intArray = {2,3,4,5,1,7,9};
		
		int[][] matrix1 = {{1,2,3},{5,6,7},{7,8,9}};
		int[][] matrix2 = {{1,2,3},{5,6,7},{7,8,9}};
		//since user defined class and utility package Arrays share same name. 
		//It is causing conflict between classes and to resolve that entire package with class name is used.
		java.util.Arrays.sort(intArray);
		
		String reversedArrayString = java.util.Arrays.toString(intArray);
		
		System.out.println(reversedArrayString);
		
		if (java.util.Arrays.equals(intArray, intArray)) {
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		};
		
		int index = java.util.Arrays.binarySearch(intArray, 4);
		System.out.println(index);
		
		String array2dToString = java.util.Arrays.deepToString(matrix1);
		System.out.println(array2dToString);
		

		if (java.util.Arrays.deepEquals(matrix1, matrix2)) {
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		};
	}
}
