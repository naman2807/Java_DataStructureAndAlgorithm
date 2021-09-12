package sortings;

import java.util.Arrays;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: sortings
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 12-09-2021
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = new int[]{20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        Arrays.stream(intArray).forEach(System.out::println);
    }

    private static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
