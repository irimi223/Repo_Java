package homework1;

public class TempConverter {

    public static void main(String[] args) {

        double tempC = 25;
        double tempF = 9.0/5 * tempC + 32;
        double tempK = tempC + 273;
        double tempF2 = 9.0/5 * (tempK - 273) + 32;
        double tempC2 = tempK - 273;
        double tempK2 = 5.0/9 * (tempF -32) + 273;

        System.out.println("Temp F = " + tempF);
        System.out.println("Temp K = " + tempK);
        System.out.println("Temp F2 = " + tempF2);
        System.out.println("Temp C2 = " + tempC2);
        System.out.println("Temp K2 = " + tempK2);
    }
}
