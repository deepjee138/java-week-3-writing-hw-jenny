package homework_week_07;

import java.util.Scanner;

/*** 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 *
 */

public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {

        // Scanner declaration
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the number");
        int number=scanner.nextInt();
        isItOddOrEvenNumber(number);

        // scanner close
        scanner.close();

    }
    //Checking the number is odd or even
    public static void isItOddOrEvenNumber(int number){
        String evenOrOdd=(number %2 == 0)? "Even" : "Odd";
        System.out.println("The"+ number + "Is" + evenOrOdd+ "number");
    }
}
