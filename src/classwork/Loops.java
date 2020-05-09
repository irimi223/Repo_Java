package classwork;

public class Loops {

    public static void main(String[] args) {

        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        for (int j = 1; j <= 10; j += 2) {
            System.out.println(j + 1);
        }

        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.println("Even -> " + j);
            } else
                System.out.println("Odd -> " + j);
        }

        int number = 1;

        while (number <= 30) {
            if (number % 3 == 0 || number % 5 == 0) {
                if (number % 3 == 0) {
                    if (number % 5 == 0) {
                        System.out.println("Number divisible by both");
                    } else System.out.println("Number divisible by 3");
                } else {
                    System.out.println("Number divisible by 5");
                }
            } else {
                System.out.println("Number: " + number);
            }
            number++;
        }

        /**
         * int[] numbers = {87, 90, 95, 120, 543};
         * Write code to calculate the sum of array numbers (87+90+95+120+543)
         *
         */

        int[] numbers = {87, 90, 95, 120, 543};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);

        String[] students = {"happy", "philip", "peacephlo", "king Pharr"};
        String keyword = "ph";

        for (int i = 0; i < students.length; i++) {
            boolean containsph = students[i].toLowerCase().contains(keyword.toLowerCase());
            if (containsph == true) {
                System.out.println(students[i]);
            }
        }

        String[] students2 = {"gophilippso", "philip", "peacephlo", "king Pharr"};
        String keyword2 = "philip";

        for (int i = 0; i < students.length; i++) {
            boolean containskey = students[i].equalsIgnoreCase(keyword2);
            if (containskey == true) {
                System.out.println("Index = " + i);
                break;
            }
        }

        /**
         # Take user input for Fans name or store Fans name in a variable
         and based on name, print his/her favorite sports name
         * Football
         Deepak
         * Soccer
         Karina
         * Cricket
         Ahsan
         * Baseball
         Guzel
         * Not a Fan of Sports
         Irina
         * */

        String fansName = "Deep";
        switch (fansName) {
            case "Deepak":
                System.out.println("favorite sport Footbal");
                break;
            case "Karina":
                System.out.println("favorite sport Soccer");
                break;
            case "Ahsan":
                System.out.println("favorite sport Cricket");
                break;
            case "Guzel":
                System.out.println("favorite sport Baseball");
                break;
            case "Irina":
                System.out.println("not a fan of sports");
                break;
            default: {
                System.out.println("Unknown fan's name");
            }
        }
    }
}