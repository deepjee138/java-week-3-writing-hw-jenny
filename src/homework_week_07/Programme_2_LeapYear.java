package homework_week_07;

import java.util.Scanner;

/**
 * *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 *  * not?
 */

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scanner.nextInt();
        isItLeapYear(year);

        // scanner close
        scanner.close();


    }
    // checking is it leap year
    public static void isItLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("This"+ year+ " is leap year");
            return;
        }
        System.out.println("This"+ year+ " is not leap year");
    }
}
