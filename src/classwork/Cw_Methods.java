package classwork;

public class Cw_Methods {

    public static void main(String[] args) {
        int[] numbers = {121, 32, 43, 54, 64, 11, 81, 91, 23, 73};
        int numbersTotal = arrayTotal(numbers);
        System.out.println(numbersTotal);

        String message = "haPPy new yEaR";
        System.out.println("Reverse message: " + reverse(message));

        String word = "raCec";
        System.out.println("is " + word + " a palindrome: " + isPalindrome(word));

    }
    public static int  arrayTotal (int[] array) {
        int sum =0;
        for (int i : array) {
            sum+=i;
        }
        return sum;
    }

    public static String reverse (String msg) {

        String reverseMessage = "";
        String[] messageArray = msg.split("");
        //System.out.println(Arrays.toString(messageArray));
        for (int z = messageArray.length - 1; z >= 0; z--) {
            reverseMessage = reverseMessage + messageArray[z];
        }
        return reverseMessage;
    }


    public static boolean isPalindrome (String word) {

        //boolean result = true;
        String reverseWord = "";
        String[] wordArray = word.split("");
        //System.out.println(Arrays.toString(wordArray));

        for (int i = wordArray.length - 1; i >= 0; i--) {
            reverseWord = reverseWord + wordArray[i];
        }
        boolean isPalindrome = reverseWord.equalsIgnoreCase(word);
        return isPalindrome;
    }

       //System.out.println("is " + word + " a palindrome: " + result);


    }

