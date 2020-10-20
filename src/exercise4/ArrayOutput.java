package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        
        int[] numbers = new int[length];
        
         
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
              for (int j = 0 ; j < i; j++) {
                System.out.print(" ");
              }
            System.out.println(numbers[i]);
        }

        
       
    }

}