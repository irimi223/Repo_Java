package classwork;

import jdk.nashorn.api.tree.BreakTree;

import java.util.Arrays;

public class CodeTest {

    public static void main(String[] args) {

        int[] array = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int remove = 24;
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("New array: " + Arrays.toString(removeValue(array, remove)));


        int[] setOfNum = {1, 3, 5, 4, 2, 7};
        if (missingInt(setOfNum) <= 1 ) {
            System.out.println("The set of numbers does't contain positive integers");
        } else System.out.println("Smallest missing positive integer is: " + missingInt(setOfNum));


        traffic(19);

    }

    /**
     * Question 1:
     * Create a method to return an array after remove a specific value from a given int array.
     * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     * <p>
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */

    public static int[] removeValue(int[] array, int remove) {
        int numOfR = 0;

        for (int n = 0; n < array.length; n++) {
            if (array[n] == remove) {
                numOfR = numOfR + 1;
            }
        }

        int[] newArray = new int[array.length - numOfR];
        int i = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != remove) {
                i++;
                newArray[i] = array[j];
            }
        }
        return newArray;



    }

    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0) from given array.
     * Example:
     * For array : {1, 3, 5, 4, 2, 7}
     * Method should return : 6
     * <p>
     * For array : {-1, -3, 4, 2}
     * Method should return : 1
     * <p>
     * For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * Method should return : 4
     */

    public static int missingInt(int[] setOfNum) {
        int currentInt = 0;
        boolean isFound = true;
        while (isFound) {
            isFound = false;
            currentInt++;
            for (int i = 0; i < setOfNum.length; i++) {

                if (setOfNum[i] == currentInt) {
                    isFound = true;

                    break;

                }
            }
        }
        return currentInt;
     }


    /* Question 3:
            * Scenario: Traffic ticketing system
         * Write a method, that will print (not return) the points charged against the license for over speeding.
            *    1. Speed Limit = 70
            *    2. Every 5 miles over the speed limit will add 1 point
         *    3. If user gets 12 points for a speed then license is suspended
         *
                 *  Example:
            *      user speed = 78 ; 1 points
         *      user speed = 88 ; 3 points
         *      user speed = 178 ; 21 points (License suspended).
            *      user speed = 70 ; Thank you for driving within the speed limit.
         *
                 *      88 -> 3
                 *      70
                 *      70-75 : 1
                 *      75-80 : 1
                 *      80-85 : 1
                 *      85-88
                 *
                 */
    public static void traffic (int speed) {
        int speedLimit = 70;
        int points = 0;
        if (speed > speedLimit) {
            points = (speed-speedLimit)/5;
        }
        if (points==0) {
            System.out.println("Thank you for driving within speed limit");
        } else if (points<12) {
            System.out.println("Speed: " + speed + ", Points: " + points);
        } else System.out.println(points + " points (License suspended)");
    }

}
