package homework_week_07;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 *  * any other alphabet should be invalid entry
 */

public class Programme_8_PrintCityName {
    public static void main(String[] args) {


        // scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a A to Z:");
        char city = scanner.next().charAt(0);
        Programme_8_PrintCityName cityName=new Programme_8_PrintCityName();
        cityName.printCityName(city);
        // closing scanner
        scanner.close();
    }

    // Print the city Name
    public void printCityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("Ahemdabad");

        } else if (city == 'B' || city == 'b') {
            System.out.println("Baroda");

        } else if (city == 'C' || city == 'c') {
            System.out.println("Chandgadh");


        } else if (city == 'D' || city == 'd') {
            System.out.println("Daman");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Endimbarug");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Fatsar");

        } else {
            System.out.println("Not between A to Z");
        }
    }
}