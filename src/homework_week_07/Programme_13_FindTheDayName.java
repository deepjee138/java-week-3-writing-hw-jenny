package homework_week_07;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 *  * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Programme_13_FindTheDayName {
    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number between 1 to 7:");
        int number=scanner.nextInt();
       Programme_13_FindTheDayName m1=new Programme_13_FindTheDayName();
       m1.findTheDayName(number);

      // scanner close
        scanner.close();
    }
    public  void findTheDayName(int day){
        switch (day){
            case 1:
                System.out.println("It's Monday");
            case 2:
                System.out.println("It's Tuesday");
            case 3:
                System.out.println("It's Wednesday");
            case 4:
                System.out.println("It's Friday");
            case 5:
                System.out.println("It's Thursday");
            case 6:
                System.out.println("It's Saturday");
            case 7:
                System.out.println("It's Sunday");
            default:
                System.out.println("Week contain 1 to 7 days");
        }
    }
}
