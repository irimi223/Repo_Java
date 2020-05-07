package homework;

public class IfElseHW {

    public static void main(String[] args) {

        /*
         * Create variable to store student-score, and total-possible-score based on the percentage,
         * display grade to student
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */

        int studentScore = 105;
        int maxScore = 180;
        String grade = "";
        double percentage = studentScore * 100.0 / maxScore;
        System.out.println(percentage);

        if (percentage > 90.0) {
            grade = "A";
            System.out.println("Your percentage is " + percentage + " and your grade is " + grade);
        } else if (percentage > 80.0) {
            grade = "B";
            System.out.println("Your percentage is " + percentage + " and your grade is " + grade);
        } else if (percentage > 70.0) {
            grade = "C";
            System.out.println("Your percentage is " + percentage + " and your grade is " + grade);
        } else if (percentage > 60.0) {
            grade = "D";
            System.out.println("Your percentage is " + percentage + " and your grade is " + grade);
        } else if (percentage > 50.0) {
            grade = "E";
            System.out.println("Your percentage is " + percentage + " and your grade is " + grade);
        } else {
            grade = "F";
            System.out.println("Your percentage is " + percentage + " and your grade is " + grade);
        }

        /*
         * Checking car mode (P, D, N, R)
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N "you can put car in car wash"
         * if car mode is R "you can reverse the car"
         */

        char carMode = 'P';
        String driveType = "SpOrt";
        String lowerDriveType = driveType.toLowerCase();

        switch (carMode) {
            case 'P':
                System.out.println("You can park car");
                break;
            case 'D':
                switch (lowerDriveType) {
                    case "snow":
                    case "sport":
                    case "eco":
                        System.out.println("You are on " + lowerDriveType + " mode");
                        break;
                    default:
                        System.out.println("Unknown drive type");
                } break;
            case 'N':
                System.out.println("You can put car in car wash");
                break;
            case 'R':
                System.out.println("You can reverse the car");
                break;
            default:
                System.out.println("Unknown car mode");
        }


        /*
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */

        int number = 25;

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


    }
}
