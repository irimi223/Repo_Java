package homework;

import java.sql.SQLOutput;

public class PrinterFunc {

    int tonerLevel = 100;
    int pagesCount = 100;
    boolean doubleSide = false;

    public void getSummary() {
        System.out.println("Toner level: " + tonerLevel);
        System.out.println("Pages in tray: " + pagesCount);
    }

    public void addingToner(int addToner) {
        if ((tonerLevel + addToner) <= 100) {
            tonerLevel = tonerLevel + addToner;
            System.out.println("Toner level: " + tonerLevel);
        } else {
            System.out.println("You can add no more than " + (100 - tonerLevel) + " units of toner");
        }

    }

    public void addingPages(int addPages) {
        if ((pagesCount + addPages) <= 100) {
            pagesCount = pagesCount + addPages;
            System.out.println("Pages in tray: " + pagesCount);
        } else {
            System.out.println("You can add no more than " + (100 - pagesCount) + " pages");
        }
    }

    public void print(int pages, boolean doubleSide) {
        int n =0; // counting printed pages
        for (int i = pages; i >0; i--) {
            if (pagesCount>0 && tonerLevel>0) {
                n+=1;
                tonerLevel-=1;
                if (doubleSide == false) {
                pagesCount-=1;
                } else {
                    pagesCount= pagesCount - (n%2);
                }

            } else if (pagesCount ==0) {
                System.out.println("Add paper");
                break;
            } else {
                System.out.println("Add toner");
                break;
            }

        }
        System.out.println("Printed " + n + " pages");
        getSummary();
    }
}

        /**
        if (pages <= pagesCount && pages <= tonerLevel) {
            tonerLevel = tonerLevel - pages;
            if (doubleSide == false) {
                pagesCount = pagesCount - pages;
                System.out.println("Printed " + pages + " pages single-sided");
            } else {
                pagesCount = pagesCount - (pages / 2) - (pages % 2);
                System.out.println("Printed " + pages + " pages double-sided");
            }
            getSummary();
        } else if (pages > pagesCount) {
            System.out.println("Add paper");
        } else {
            System.out.println("Add toner");
        }
    }
}
*/


