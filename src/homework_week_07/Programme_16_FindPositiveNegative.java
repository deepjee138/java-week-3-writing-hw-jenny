package homework_week_07;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 *  * “ZERO”
 */

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        // declare the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        // scanner close
        scanner.close();
    }

    // finding positive negative zero
    public static void findNumberIsPositiveNegativeOrZero(int number){
        if (number>0){
            System.out.println("Is a Positive number:" +number);
        } else if (number<0) {
            System.out.println("Is a nagetive Number:" + number);
        } else   {
            System.out.println("Is Zero:"+number);

        }

    }
    }

