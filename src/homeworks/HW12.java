package homeworks;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name");
        String inputValue = scanner.nextLine().toLowerCase().trim();
        int k = 0;

        for (int i = 0; i < inputValue.length()/2; i++) {
            if (inputValue.charAt(i) == inputValue.charAt(inputValue.length() - 1 - i)) {
                k=0;
            } else {
                k++;
            }
        }
            if (k > 0) {
                System.out.println(inputValue + " is not a palindrome");
            } else {
                System.out.println(inputValue + " is a palindrome");
            }
    }
}




