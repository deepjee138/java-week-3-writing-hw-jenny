package homework_week_07;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */

public class Programme_18_SumOfArray {
    public static void main(String[] args) {
        // numeric array declaration
        int[]numArray={
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787
        };
        int sum= 0;
        // calculation the sum of array
        for (int i=0;i < numArray.length;i++){
            sum= sum+ numArray[i];
        }
        System.out.println("value of the elements of the array:"+ Arrays.toString(numArray));
        System.out.println("Sum of the value of the array:    "+ sum);


    }
}
