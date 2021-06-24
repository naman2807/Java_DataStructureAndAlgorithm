package practical;

import java.util.Arrays;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment12{
    public static void main(String[] args) {
        int[] arr = {12,8,16,5,2};
        System.out.println("Unsorted array is ---> "+
                Arrays.toString(arr));
        Experiment12 obj = new Experiment12();
        obj.selectionSort(arr);
        System.out.println("Sorted array is ---> "+ Arrays.toString(arr));
    }
    public void selectionSort(int[] arr) {
        // step 1
        int sortedIndex = arr.length;
        int maxElement;
        int maxElementInedx;
        // step 2
        for (int i = 0; i < arr.length; i++) {
            maxElement = arr[0];
            maxElementInedx = 0;
            // step 3 , find max element
            for (int j = 0; j < sortedIndex; j++) {
                if (maxElement < arr[j]) {
                    maxElement = arr[j];
                    maxElementInedx = j;
                }
            }
            System.out.println(maxElement);
            // step 4 , swap
            sortedIndex--;
            int temp = arr[maxElementInedx];
            arr[maxElementInedx] = arr[sortedIndex];
            arr[sortedIndex] = temp;
        }
    }
}
