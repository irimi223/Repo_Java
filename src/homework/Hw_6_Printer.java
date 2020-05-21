package homework;

public class Hw_6_Printer {

    public static void main(String[] args) {

        PrinterFunc p1 = new PrinterFunc();

        p1.getSummary();

        p1.print(13,true);

        p1.print(90,false);

        p1.addingToner(15);

        p1.print(10,true);

        p1.print(2,true);

       // p1.addingPages(1);

       // p1.getSummary();
    }
}
