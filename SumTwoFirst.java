package PatternsJava;

public class SumTwoFirst {
    
    public static int sumTwo(int[] arr){
        int n = arr.length;
        if(n < 2){
            return 0;
        }
        return arr[0] + arr[1];
    }
    public static void main(String[] args) {
        
        int[] arr1 = {5,3,2,1};
        System.out.println("Sum : " + sumTwo(arr1));
        int[] arr2 = {1,2,9};
        System.out.println("Sum : " + sumTwo(arr2) );
    }
}
