package Tasks;

import java.util.Scanner;

public class CallTriangleClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter size of 1st side");
        double side1Size = scanner.nextDouble();
        System.out.println("Please enter size of 2nd side");
        double side2Size = scanner.nextDouble();
        System.out.println("Please enter size of 3rd side");
        double side3Size = scanner.nextDouble();

        Triangle triangle1 = new Triangle();

        triangle1.setSide1(side1Size);
        triangle1.setSide2(side2Size);
        triangle1.setSide3(side3Size);

        double result = triangle1.areaTriangle();
        System.out.println("result = " + result);

    }
}
