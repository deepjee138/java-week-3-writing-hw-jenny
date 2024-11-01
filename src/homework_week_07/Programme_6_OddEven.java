package homework_week_07;

import java.util.Scanner;

/**
 *  Write a java program to input any number and find out if it’s odd or even
 */

public class Programme_6_OddEven {
    public static void main(String[] args) {

        // scanner declaration
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number you wants to check");
        int number=scanner.nextInt();
        Programme_6_OddEven oddEven=new Programme_6_OddEven();
        System.out.println(number + " is " + oddEven.isEvenOrOddNumber(number) + " number");


        // scanner close
        scanner.close();
    }

    // checking the number is odd even
    public String isEvenOrOddNumber(int number){
        if (number % 2 == 0){
            return "Even";

        }else {
            return "Odd";
        }
    }
}


