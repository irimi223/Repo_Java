package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Hw_8_ArrayList {

public static void main(String[] args) {

    String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
    System.out.println("Original array: " + Arrays.toString(words));
    System.out.println("Duplicates values: " + duplicates(words));

    System.out.println("Duplicate values 2: " + duplicates2(words));

    int[] arr1 = {-4, 11, 32, 43, 54, 0, 65};
    int[] arr2 = {76, 11, 89, -4, 0, 43, 87, 23, 32};
    System.out.println("Array 1: " + Arrays.toString(arr1));
    System.out.println("Array 2: " + Arrays.toString(arr2));
    System.out.println("Common elements of two arrays: " + commonValues(arr1, arr2));
}

    /**
     * Create a method, that will return all duplicates values in the given String array.
     * String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
     * Result -> ["happy", "joy", "laugh"]
     *
     */
     public static ArrayList<String> duplicates (String[] words) {
      ArrayList<String> result = new ArrayList<>();
      for (int i = 0; i<words.length; i++) {
            for (int j=i+1; j<words.length; j++) {
               if (words[i].equalsIgnoreCase(words[j])) {
                   result.add(words[i]);
                   break;
               }
            }
        }
        return result;
  }
    /*
    here i tried to solve this exercise different way. It's not perfectly working as it returns each duplicate value twice.
    And i didn't want to make it look complicated by adding another for loop. So i stopped here.
     */
    public static ArrayList<String> duplicates2 (String[] words) {
        ArrayList<String> wordsList = new ArrayList<>();
        ArrayList<String> result2 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            wordsList.add(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
            if (wordsList.lastIndexOf(wordsList.get(i)) != wordsList.indexOf(wordsList.get(i))) {
                result2.add(wordsList.get(i));
            }
        } return result2;
    }
  /*
           * Create a method, that will return the common elements/value in two given int-array
           * int[] arr1 = {11, 32, 43, 54, 65}
            * int[] arr2 = {76, 11, 89, 43, 87, 23, 32}
            * Result -> [11, 32, 43]
            */

    public static ArrayList<Integer> commonValues (int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i<arr1.length; i++) {
            for (int j=0; j<arr2.length; j++) {
                if (arr1[i]==arr2[j]) {
                    result.add(arr2[j]);
                    break;
                }
            }
        }
        return result;
    }

}

