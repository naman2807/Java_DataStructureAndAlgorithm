package practical;

import java.util.Scanner;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment1 {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] array = new int[10];
    public static void main(String[] args) {
        System.out.println("Enter the elements: ");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        for (int i = 0; i < array.length; i++) {

        }
    }
}
