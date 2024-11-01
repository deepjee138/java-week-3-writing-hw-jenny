package homework_week_07;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any Character:");
        char ch=scanner.next().charAt(0);

        // object creation
        Programme_12_FindInputValue inputValue=new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);

        // closing
        scanner.close();

    }
    // find the input value is
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        System.out.println("Is a ALPHABET number" + ch);

    } else if ((ch>='0' && ch< '9')) {
            System.out.println("Is a DIGIT:"+ch);
        }else {
            System.out.println("IS a SYMBOL:"+ch);
        }

        }
    }
