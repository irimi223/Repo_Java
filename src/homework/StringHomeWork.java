package homework;

import java.util.Arrays;

public class StringHomeWork {
    public static void main(String[] args) {

        String myName = "Irina";
        int myNameLength = myName.length();
        boolean startsWithK = myName.startsWith("K");
        char firstLetter = myName.charAt(0);
        String firstLetter1 = myName.substring(0, 1);
        boolean endsWithM = myName.toUpperCase().endsWith("M");

        System.out.println("Length of my first name: " + myNameLength);
        System.out.println("Does my name starts with K?: " + startsWithK);
        System.out.println("First alphabet of my name: " + firstLetter);
        //System.out.println(firstLetter1);
        System.out.println("Does my name ends with M?: " + endsWithM);

        String myStatement = "I am a good programmer";
        int lastIndexOfSpace = myStatement.lastIndexOf(" ");
        String lastWord = myStatement.substring(lastIndexOfSpace + 1);
        String[] afterSplit = myStatement.split(" ");
        int noOfWords = afterSplit.length;
        String afterReplace = myStatement.replace('r', 'f');

        System.out.println("Last word: " + lastWord);
        //System.out.println(Arrays.asList(afterSplit));
        System.out.println("Total number of words: " + noOfWords);
        System.out.println("Replace with f: " + afterReplace);

        String[] myNameSplit = myName.split("");
        //System.out.println(Arrays.toString(myNameSplit));
        int myNameL = myNameSplit.length;
        System.out.println("Length of my name: " + myNameL);





        /*
        mon-fri : if I have a meeting, print "You must go to office; you have meetings" else print "You can work from home"
         */                /** sat : print "Go Out"
         * sun : print "Take rest"
         */

       /*String message = "";
        // use switch
        System.out.println("Message : " + message);

        String[] dayName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayName = "Tuesday";
        switch (dayName)

        */


        String monthName = "April";
        // String seasonName =
        String LowerMonthName = monthName.toLowerCase();
        System.out.println(LowerMonthName);

        switch (LowerMonthName) {
            case "december":
            case "january":
            case "february":
                System.out.println("winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("fall");
                break;
            default:
                System.out.println("invalid");

        }
    }
}



