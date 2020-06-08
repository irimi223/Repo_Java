package homework;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.*;

public class Hw_9_HashMap {

    /**
     * Question 1:
     * Create a method, that will return all duplicates values with count from the given String List
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     *      */
    public static void main(String[] args) {

        //String[] words = {};

        ArrayList<String> words = new ArrayList<>(Arrays.asList("happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"));

        System.out.println(words);
        duplicates(words);

        equalValues();

        System.out.println("Best score scores: " + students());

    }

    public static void duplicates (ArrayList <String> words) {
       Set<String> wordsSet = new HashSet<>(words);
       HashMap<String, Integer> dupl = new HashMap<>();

        for (String setWord : wordsSet) {
            int n =0;
        for (String arrayWord : words) {
                if (setWord.equalsIgnoreCase(arrayWord)) {
                    n = n+1;
                }
            } dupl.put(setWord, n);
        }
        HashMap<String, Integer> result = new HashMap<>();
        for (String mapWord : dupl.keySet()){
            if (dupl.get(mapWord) >1) {
                result.put(mapWord, dupl.get(mapWord));
            }
        }
        System.out.println(result);
    }



    /*
     *
     * Question:2
     * Create a hashMap with any numbers of key-value pairs from the user
     * Key should be Integer
     * Value should be String
     * if there are keys with same value, print the keys otherwise, create method that will "All keys have different values"
     */

    public static void equalValues () {

        Scanner input = new Scanner(System.in);
        System.out.println("Pls write number of pairs you want to enter:");
        int num = input.nextInt();
        HashMap<Integer, String> givenMap = new HashMap<>();
        for (int n = 0; n < num; n++) {
            System.out.println("Pls enter a key:");
            int key = input.nextInt();
            System.out.println("Pls enter a String value for " + key + " key:");
            String value = input.next();
            givenMap.put(key, value);
        }
        //System.out.println(givenMap);

        Set<String> valueSet = new HashSet<>(givenMap.values());
        //System.out.println(valueSet);
        if (valueSet.size() == givenMap.size()) {
            System.out.println("All keys have different values");
        } else {

            for (String setWord : valueSet) {
                for (String mapWord : givenMap.values()) {
                    if (setWord.equals(mapWord)) {

                        break;
                    }

                }
            }
        }
    }



       /* for (int i = 0; i< givenMap.size(); i++) {
           for (int j = 0; j< givenMap.size(); j++) {
                if (givenMap.get(i) == givenMap.get(j)) {
                    System.out.println("Keys with same values: " + i + " " + j);
               //System.out.println(givenMap.get(i) + givenMap.get(j));
                }
            }
        } */






     /*
     * Question 3:
     * Create a hashMap with any numbers of key-value pairs from the user (Key - String, Value - Integer)
     * Create a method that will take hashMap as input and returns the name of student(s) who scored maximum marks.
     */

    public static String students () {

        Scanner input = new Scanner(System.in);
        System.out.println("Pls write number of pairs you want to enter:");
        int num = input.nextInt();
        HashMap<String, Integer> stMarks = new HashMap<>();
        for (int n = 0; n < num; n++) {
            System.out.println("Pls enter a student name:");
            String name = input.next();
            System.out.println("Pls enter a mark for " + name + " student:");
            int mark = input.nextInt();
            stMarks.put(name, mark);
        }
        //System.out.println(stMarks);

        Collection<Integer> scores = stMarks.values();
        //System.out.println(scores);

        Integer maxScore = Collections.max(scores);
        //System.out.println(maxScore);

        String bestStudent = "";
        for (String name : stMarks.keySet()) {
            if (stMarks.get(name).equals(maxScore)) {
                bestStudent = name;
                break;
            }
        }
        return bestStudent;
    }

}
