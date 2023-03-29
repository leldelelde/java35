package Tasks.Carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floor length");
        double length = scanner.nextDouble();

        System.out.println("Please enter floor width");
        double width = scanner.nextDouble();

        //Create floor object
        Floor floor = new Floor(length, width);
        System.out.println("Floor m^2: " + floor.getArea());

        System.out.println("Please enter carpet price per m^2");
        double carpetCost = scanner.nextDouble();

        //Create Carpet object
        Carpet carpet = new Carpet(carpetCost);

        System.out.println("Carpet price per m^2: " + carpet.getCost());

        //Create Calculator class object and
        //pass floor and carpet class objects as input

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("In total carpet will cost: " + calculator.getTotalCost() + " EUR");

    }
}
