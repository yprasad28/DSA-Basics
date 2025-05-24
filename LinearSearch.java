package PatternsJava;

public class LinearSearch {
	
	public static int linearSearch(int[] array, int x) {
		int n = array.length;
		for(int i=0;i<n;i++) {
			if(array[i] == x) {
				return i;
			}
		}
		return -1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,4,6,9,8,9,5};
		int x = 8;
		
		int result = linearSearch(array, x);
		if(result == -1) {
			System.out.println("Element not Found");
		} else {
			System.out.println("Element found at index : " + result);
		}

	}

}
