package practical;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment11 {
    int[] brr;
    public Experiment11(int[] brr){
        this.brr = brr;
    }

    public boolean binarySearch(int searchElement,int low, int high){
        if(low>high){
            return false;
        }
        int mid = (low+high)/2;
        if(searchElement == brr[mid]){
            return true;
        }
        else if(searchElement>brr[mid]){
            return binarySearch(searchElement,mid+1,high);
        }
        else{
            return binarySearch(searchElement,low,mid-1);
        }
    }
    // find index using binary search
    public int binarySearchIndex(int searchElement,int low, int high){
        int response = -1;
        if(low>high){
            return response;
        }
        int mid = (low+high)/2;
        if(searchElement == brr[mid]){
            response = mid;
            return response;
        }
        else if(searchElement>brr[mid]){
            return binarySearchIndex(searchElement,mid+1,high);
        }
        else{
            return binarySearchIndex(searchElement,low,mid-1);
        }
    }
    public boolean NonRecursiveBinarySearch(int[] arr,int searchElement){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == searchElement){
                return true;
            }
            else if(searchElement>arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        int[] brr = new int[]{30,22,25,50,22,65,22,90};
        Experiment11 obj2 = new Experiment11(brr);
        System.out.println("25 is present in given array or not :"
                +obj2.binarySearch(25,0,brr.length-1));
                System.out.println("Index of 22 is : "
                        +obj2.binarySearchIndex(22,0,brr.length-1));
                        System.out.println("Index of 90 is : "
                                +obj2.binarySearchIndex(90,0,brr.length-1));
                                System.out.println("65 is present in given array or not : "
                                        +obj2.NonRecursiveBinarySearch(brr,65));
    }

}