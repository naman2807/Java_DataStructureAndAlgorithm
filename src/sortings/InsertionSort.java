package sortings;

import java.util.Arrays;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: sortings
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 13-09-2021
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = new int[]{20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex ++){
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;

        }

        Arrays.stream(intArray).forEach(System.out::println);
    }
}
