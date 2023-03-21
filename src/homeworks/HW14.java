package homeworks;

import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float initialPrice;
        float discount;

        System.out.println("Please enter initial price");
        initialPrice = scanner.nextFloat();
        System.out.println("Please enter amount of discount");
        discount = scanner.nextFloat();

        priceWithDiscount(initialPrice, discount);
    }

    // Discount method - two float values, returns float value
    public static float priceWithDiscount(float initialPrice, float discount) {
        float priceAfterDiscount = 0;
        char percentageSign = '%';
        if (discount <= 100) {
            priceAfterDiscount = initialPrice - ((initialPrice * discount) / 100);

            System.out.printf("Initial price is %.2f, discount is %.2f %c, final price is %.2f", initialPrice, discount, percentageSign, priceAfterDiscount);
        } else {
            System.out.println("Discount is too high!");
        }
        return priceAfterDiscount;
    }
}
