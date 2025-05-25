package PatternsJava;

public class BubbleSortArray {
	
	public static void bubblesort(int[] array, int n) {
		int i, j, temp;
		boolean swapped;
		for(i = 0;i<n-1;i++) {
			swapped = false;
			for(j = 0;j<n-i-1;j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
		
		
	}
	public static void printArray(int[] array, int n) {
		int i;
		for(i =0; i< n;i++) {
			System.out.print(array[i] + " ");
		
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,9,1,2,4};
		int n = array.length;
		bubblesort(array, n);
		System.out.println("Sorted Array: ");
		printArray(array, n);
	}

}
