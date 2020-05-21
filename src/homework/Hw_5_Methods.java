package homework;

import java.util.Arrays;

public class Hw_5_Methods {

    public static void main(String[] args) {
        String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"};
        String nameToSearch = "fahry";
        //int index = position(names, nameToSearch);
        /*if (index >0) {
            //System.out.println(index);
            System.out.println(names[index] + " is on position " + (index + 1));
        } else {
            System.out.println(nameToSearch + " is not present in the array");
        }

         */


        int[] numbers = {12, 22, 3308, 33, 887};
        System.out.println("Average of the given array: " + aver(numbers));
        System.out.println("Maximum of the given array: " + maximum(numbers));

        int[] scores = {90, 98, 91, 99, 81};
        String[] stNames = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        //int indexOfMax = maximumScore(scores);
        //System.out.println("maximum score " + scores[indexOfMax]);
        System.out.println(studentScores(stNames,scores) + " scored the maximum score (" + scores[maximumScore(scores)]+")");
    }
    /**
     *
     * String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"}
     * String nameToSearch = "philip";
     * Create a method that will tell the position of name of the given array
     * If name present in the names-array, tel user the position (i.e. index+1) else say, name not present
     *
     * philip is on position-4
     * happy is not present in the array
     *
     */

    public static int position (String[] arrayNames, String nmToSearch) {
        int pos =0;
        for (int z = 0; z < arrayNames.length; z++) {
            if (arrayNames[z].equalsIgnoreCase(nmToSearch)) {
            //if (arrayNames[z] == nmToSearch) {
                pos = z+1;
                break; // when we found our value we dont need to continue the loop
            }
        }
        if (pos >0) {
            //System.out.println(index);
            System.out.println(arrayNames[pos-1] + " is on position " + pos);
        } else {
            System.out.println(nmToSearch + " is not present in the array");
        }
        return pos;

    }
    /**
     * Create a method to find average of an int-array
     * Average of the given array: 123
     */

    public static int aver (int[] array) {
        int sum = 0;
        int av = 0;
       for (int j : array) {
           sum+=j;
       } av = sum/array.length;
       return av;
    }

    /**
     * Create a method to find maximum value in the given int-array
     * int[] numbers = {45, 22, 11, 65, 189, 91, 100, 81};
     *
     * Maximum value in the given array: 189
     */

    public static int maximum (int [] array) {
        int max = array[0];
        for (int j=1; j<array.length; j++) {
            if (j>max ) {
                max = j;
            }
        } return max;
    }

    /**
     * Create a method that will tell the name of student with maximum marks/score.
     * int[] scores = {90, 89, 191, 100, 81};
     * String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
     *
     * Jesse scored the maximum score(191)
     */

    public static int maximumScore (int [] marks) {
        int maxScore = 0;
        int index = 0;
        for (int i=0; i<marks.length; i++) {
            if (marks[i] > maxScore) {
                maxScore = marks[i];
                index = i;
            }

        }
            return index;
        }

    public static String studentScores (String[] studNames, int [] marks) {

        String studentName = "";
        int indexOfMax = maximumScore(marks);
        //System.out.println("In" + indexOfMax);
        for (String student : studNames) {
            studentName = studNames[indexOfMax];
        }
        return studentName;
    }

}
