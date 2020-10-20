package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        
        double[] numbers = new double[length];
        double maxnumber =0;
        
       for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }
        for (int index = 0; index < numbers.length; index++) {
            if(numbers[index]>maxnumber){
               maxnumber =numbers[index];
            }
        }

            System.out.println("Max number: "+maxnumber);
        
    }

}