package homework_week_07;

/*** Write a Java program to test if an array contains a specific
 * value.
 *
 */

public class Programme_20_FindValueInArray {

    public static void main(String[] args) {

        // declare numeric array
        int[] numArray={1789,1999,1998,1997,1996,1995,1994,1993};
        System.out.println(isArray(numArray,1865));
        System.out.println(isArray(numArray,1965));
    }
    // array find way
    public static boolean isArray(int [] array,int item){
        boolean isContain=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                isContain = true;
                break;
            }
        }
        return isContain;
    }

    }

