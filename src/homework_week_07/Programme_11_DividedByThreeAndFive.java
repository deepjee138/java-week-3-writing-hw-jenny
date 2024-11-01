package homework_week_07;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 *  * and 5 separately.
 *  */


public class Programme_11_DividedByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Number Divisible by 3 are: ");
        for (int i = 1; i<=100; i++){
           dividedByThree(i);
        }

        System.out.println("__________________________________________-----------");
        System.out.println("Number divisible by 5 are:");
        for (int x = 1; x<=100; x++){
            System.out.println(x);
        }
    }

    // divided by three
    public static void dividedByThree(int number) {
        if (number % 3 == 0) {
            System.out.println(number + ",");
        }
    }
        // divided by five method
        public static void dividedByFive(int number){
            System.out.println(number+",");
        }
    }

