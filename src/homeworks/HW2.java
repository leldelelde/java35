package homeworks;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        // Using scanner read speed in mp/h
        // Calculate and output speed in km/h
        // Example with input 122.7 mp/h
        // Output --> 122.7 mp/h in km/h would be equal to 197.46651

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed in mp/h");
        float speed = scanner.nextFloat();

        System.out.println(speed + " mp/h in km/h would be equal to " + (speed * 1.609344f));







    }
}
