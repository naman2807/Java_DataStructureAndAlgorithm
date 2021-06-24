package practical;

import java.util.Arrays;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment13 {
    public static void main(String[] args) {
        int[] arr = {12,8,16,2,5};
        System.out.println("Unsorted array is ---> "+
                Arrays.toString(arr));
        Experiment13 obj = new Experiment13();
        obj.insertionSort(arr);
        System.out.println("Sorted array is ---> "+ Arrays.toString(arr));
    }
    public void insertionSort(int[] arr){
        int sortedIndex = 0;
        int unsortedIndex;
        for (unsortedIndex = 1; unsortedIndex < arr.length;
             unsortedIndex++) {
            int nextAvailableElement = arr[unsortedIndex];
            for (int j = unsortedIndex; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    System.out.println("After swapping ");
                    System.out.println(Arrays.toString(arr));
                }
                else{
                    break;
                }
            }
        }
    }

}
