package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        
        double[] numbers = new double[length];
        double minNumber =10000000;
        int minNumberIndex =0;
        
       for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }
        for (int index = 0; index < numbers.length; index++) {
            if(numbers[index]<minNumber){
               minNumber =numbers[index];
                minNumberIndex = index;
            }
        }

            System.out.println("Min index: "+ minNumberIndex);
        
        
    }

}