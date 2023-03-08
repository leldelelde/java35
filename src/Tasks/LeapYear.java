package Tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a year ");
        int InputYear = scanner.nextInt();

        if (InputYear < 0){
            System.out.println("Invalid input");
        } else if (InputYear > 2100) {
            System.out.println("You are looking too far in the future, live for today");
        } else {
            if (((InputYear % 400) == 0) || ((InputYear % 4 == 0) && (InputYear % 100 != 0))) {
                System.out.println("Leap year");
            } else{
                System.out.println("Not a leap year");
            }

            }

        }

}
