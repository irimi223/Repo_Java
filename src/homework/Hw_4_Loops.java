package homework;

import java.util.Arrays;

public class Hw_4_Loops {

    public static void main(String[] args) {

        /**
         * Write code to create abbreviation for any given string
         * Example: String msg = "Outfit of the day" //
         * Expected: OOTD //GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */

        String msg = "outfit Of tHe daY";
        String abr = "";
        //String msgUpper = msg.toUpperCase();
        String[] msgArray = msg.toUpperCase().split(" ");
        System.out.println(Arrays.toString(msgArray));
        for (int i=0; i<msgArray.length; i++) {
            abr = abr + msgArray[i].charAt(0);
        }
        System.out.println("Abbreviation: " + abr);

        //OR:
        String abr2 = "";
        for (String z : msgArray) {
            abr2 = abr2 + z.charAt(0);
        }
        System.out.println("Abbreviation2: " + abr);


        /**
         *

        String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        //code
        System.out.println("Line (After modification) : " + line);
        */

        String line = "big BANG tHEoRy";
        System.out.println("Line before modification: "+ line);
        String [] lineArray = line.toLowerCase().split(" ");
        //System.out.println(Arrays.toString(lineArray));
        String afterMod ="";
        String afterMod2 ="";

        for (int i=0; i<lineArray.length; i++) {
            String firstLetter = lineArray[i].substring(0,1).toUpperCase();
            //System.out.println(firstLetter);
            afterMod = afterMod + firstLetter + lineArray[i].substring(1) + " ";

        } System.out.println("Line after modification: " + afterMod);

        //OR:

        for (String i : lineArray) {
            String firstLetter = i.substring(0,1).toUpperCase();
            afterMod2 = afterMod + firstLetter + i.substring(1) + " ";
        }
        System.out.println("Line after modification 2: " + afterMod);

        /**
         * reverse a string
        String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + message);
        // code
        System.out.println("Message in reverse: " + reverseMessage);
         */

        String message = "haPPy new yEaR";
        String reverseMessage = "";
        System.out.println("Original message: " + message);

        String[] messageArray = message.split("");
        //System.out.println(Arrays.toString(messageArray));

        for (int z = messageArray.length-1; z>=0; z--) {
            reverseMessage = reverseMessage + messageArray[z];
        }
        System.out.println("Reverse message: " + reverseMessage);

        /**
         * Check if word is palindrome

        String word = "level";  //ecar
        boolean result=false;
        //code
        System.out.println("is " + word + " a palindrome: " + result);
        */

        String word = "raCecar";
        String reverseWord = "";
        String [] wordArray = word.split("");
        //System.out.println(Arrays.toString(wordArray));

        for (int i = wordArray.length-1; i>=0; i--) {
            reverseWord = reverseWord + wordArray[i];
        }
        //System.out.println(reverseWord);
        boolean result = reverseWord.equalsIgnoreCase(word);
        System.out.println("is " + word + " a palindrome: " + result);


        }
    }

