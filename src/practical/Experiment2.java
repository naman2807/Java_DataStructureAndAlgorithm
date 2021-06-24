package practical;

import java.util.LinkedList;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment2 {
    public static void main(String[] args) {
        System.out.println("Enter 4 numbers: ");
        for (int i = 0; i < 4; i++) {

        }
    }
    public static int getNumber(LinkedList<Integer> list){
        StringBuilder builder = new StringBuilder("");
        list.forEach(builder::append);
        return Integer.parseInt(builder.toString());
    }

}
