package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        
        char[] letters = new char[length];
        char[] reversedLetters = new char[length];
        
        for (int index = 0; index < letters.length; index++) {
            letters[index] = input.next().charAt(0);
        }
          int j = 0;
        for (int index = letters.length -1; index >= 0; index--) {
                reversedLetters[j] = letters[index];
                j++;
        }
        System.out.println("Reversed symbols: "+Arrays.toString(reversedLetters));
    }

}