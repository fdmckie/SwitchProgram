import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        int daysInMonth;
        String monthWithDays;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of days in month : ");
        daysInMonth = input.nextInt();

        //begin switch
        switch (daysInMonth) {

            case 28: monthWithDays = "February (non-leap year) has ";
                     break;

            case 29: monthWithDays = "February (leap year) has ";
                     break;

            case 30: monthWithDays = "April, June, September, and November have ";
                     break;

            case 31: monthWithDays = "January, March, May, July, August, October, and December have ";
                     break;

            default: monthWithDays = "No month has ";


        } //end switch

        System.out.println(monthWithDays + daysInMonth + " day(s)");
    }
}
