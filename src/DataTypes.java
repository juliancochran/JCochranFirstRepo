import java.util.Scanner;

/**
 * Sample code discussing data types, Chapter 5
 * @version 10.26.2022
 * @author jcochran
 */
public class DataTypes {
    private double coolFactor;

    private final int YEAR = 365;
    private final int LEAP_YEAR = YEAR + 1;

    //public void printCoolness() {
        //System.out.println(main.coolFactor);
    //}

    public void canIUpdateLeapYear()    {
        //LEAP_YEAR += 1;
    }

    public static int digitSwap(int num)   {
        int ones = num % 10;
        num -= ones;
        int tens = num % 100;
        num -= tens;
        tens /= 10;
        num += (ones*10);
        num += tens;

        return num;



        //System.out.println("DEBUG: " + ones + " " + tens);
        //return 0;
    }

    public static void main(String[] args) {
        //int hours, double pay;
        int num = 123;
        System.out.println(num + "\t" + digitSwap(num));
        num = 30;
        System.out.println(num + "\t" + digitSwap(num));
        num = 5;
        System.out.println(num + "\t" + digitSwap(num));

        /*double coolFactor = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
        if(name.toLowerCase().equals("julian")) {
            coolFactor = 1.0;
        }
        System.out.println("Your name is: " + name);
        System.out.println("And your coolness is " + coolFactor);*/
    }
}
