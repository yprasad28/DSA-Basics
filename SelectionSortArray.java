package PatternsJava;


public class SelectionSortArray {
	
	public static void selectionSort(int[] arr, int n) {
		int i, j, temp;
		for(i =0; i < n-1;i++) {
			
			int min_index = i;
			for(j=i+1;j<n;j++) {
				if(arr[j] < arr[min_index]) {
					
					min_index = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		
	}
	
	public static void printArray(int[] arr) {
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 64, 25, 12, 22, 11 };
		int n = arr.length;
		System.out.println("Original Array: ");
		printArray(arr);
		selectionSort(arr, n);
		System.out.println("Sorted Array : ");
		printArray(arr);
		
	}

}
