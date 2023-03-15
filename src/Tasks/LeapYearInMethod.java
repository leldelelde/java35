package Tasks;

import java.util.Scanner;

public class LeapYearInMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Please enter any year ");
        year = scanner.nextInt();

        determineLeapYear(year);
        System.out.println(determineLeapYearString(year));

    }
    public static void determineLeapYear (int year){
        if (year < 0){
            System.out.println("Invalid input");
        } else if (year > 2100) {
            System.out.println("You are looking too far in the future, live for today");
        } else {
            if (((year % 400) == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("Leap year");
            } else{
                System.out.println("Not a leap year");
            }
        }

    }

    public static String determineLeapYearString (int year){
        String answer;
        if (((year % 400) == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            //return "Leap year"; < 1st option
            answer = "Leap year";
        } else{
            // return "Not a leap Year"
            answer = "Not a leap year";
        }
        return answer;
    }
}
