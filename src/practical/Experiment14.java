package practical;

import java.util.Arrays;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment14 {
    public static void main(String[] args) {
        int[] arr = {25,2,8,60,3};
        System.out.println("Unsorted array ---> "+ Arrays.toString(arr));
        Experiment14 obj = new Experiment14();
        int lower = 0;
        int upper = arr.length-1;
        obj.quickSort(arr,lower,upper);
        System.out.println("Sorted array ---> "+Arrays.toString(arr));
    }
    public void quickSort(int[] arr,int lower, int upper){
        // step 1
        if(lower>=upper){
            return;
        }
        //step 2
        int pivotIndex = partition(arr,lower,upper);
        // step 3
        quickSort(arr,lower,pivotIndex-1);
        // step 4
        quickSort(arr,pivotIndex+1,upper);
    }
    private int partition(int[] arr, int lower, int upper) {
        // step 1
        int pivot = arr[lower];
        // step 2
        int down = lower;
        // step 3
        int up = upper;
        // step 4
        while(down<up){
            // step 4a
            while(down<=upper && arr[down]<=pivot){
                down=down+1;
            }
            // step 4b
            while (up>=lower && arr[up]>pivot){
                up=up-1;
            }
            // step 4c
            if(down<up){
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        // step 5
        arr[lower] = arr[up];
        arr[up] = pivot;
        // step 6
        return up;
    }
}
