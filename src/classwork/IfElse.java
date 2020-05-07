package classwork;

import java.util.Arrays;

public class IfElse {

    public static void main(String[] args) {

        int num = 5;
        if (5 % 2 == 1) {
            System.out.println(num);
        }

        String fullName = "my little baby";
        String[] fullNameSplit = fullName.split(" ");
        int length = fullNameSplit.length;
        //System.out.println(Arrays.toString(fullNameSplit));

        //System.out.println(length);
        if (fullNameSplit.length <=3) {
            if (fullNameSplit.length <=1) {
                System.out.println("First Name: " + fullNameSplit [0]);
            } else if (fullNameSplit.length <=2) {
                System.out.println("First Name: " + fullNameSplit[0]);
                System.out.println("Last Name: " + fullNameSplit[1]);
            } else {
                System.out.println("First Name: " + fullNameSplit[0]);
                System.out.println("Middle Name: " + fullNameSplit[1]);
                System.out.println("Last Name: " + fullNameSplit[2]);
            }

        } else System.out.println("Invalid full name entered: " + fullName);


        String monthName = "octoBER";
        String seasonName = "";
        String LowerMonthName = monthName.toLowerCase();
        //System.out.println(LowerMonthName);

        switch (LowerMonthName) {
            case "december":
            case "january":
            case "february":
                seasonName = "winter";
                System.out.println(seasonName);
                break;
            case "march":
            case "april":
            case "may":
                seasonName = "spring";
                System.out.println(seasonName);
                break;
            case "june":
            case "july":
            case "august":
                seasonName = "summer";
                System.out.println(seasonName);
                break;
            case "september":
            case "october":
            case "november":
                seasonName = "fall";
                System.out.println(seasonName);
                break;
            default:
                System.out.println("invalid: " + monthName);

        }


    }
}


