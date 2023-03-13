package homeworks;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name");
        String inputName = scanner.nextLine().toLowerCase().trim();
        int k = 0;
        boolean palindrome = true;

        for (int i = 0; i < inputName.length()/2; i++) {
            if (inputName.charAt(i) == inputName.charAt(inputName.length() - 1 - i)) {
                // System.out.println(inputName.charAt(i) == inputName.charAt(inputName.length() - 1 - i));
                k++;
                // System.out.println(k);
            } else {
                k--;
            }
        }
            if (k <= 0) {
                System.out.println(inputName.toLowerCase().trim() + " is not a palindrome");
            } else {
                System.out.println(inputName.toLowerCase().trim() + " is a palindrome");
            }

        }

}




