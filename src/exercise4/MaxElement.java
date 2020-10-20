package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        
        double[] numbers = new double[length];
        double maxnumber =0;
        
       for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }
        for (int index = 1; index <= numbers.length; index++) {
            if(numbers[index]>numbers[index-1]){
               maxnumber =numbers[index];
            }
        }

            System.out.println("Max number: "+maxnumber);
        
    }

}