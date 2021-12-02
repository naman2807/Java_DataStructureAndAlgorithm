package stack;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: stack
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 16-11-2021
 */

public class ReverseStringUsingStack {
    private static void printReverseString(String value) {
        MyStack<Character> characterMyStack = new MyStack<>();
        char[] values = value.toCharArray();
        for (char c : values) {
            characterMyStack.push(c);
        }
        for (int i = 0; i < characterMyStack.getLength(); i++) {
            System.out.print(characterMyStack.pop() + "");
        }
        System.out.println();
//        characterMyStack.stream().forEach(System.out::print);
//        System.out.println();
    }

    public static void main(String[] args) {
        printReverseString("Shikha");
    }
}
