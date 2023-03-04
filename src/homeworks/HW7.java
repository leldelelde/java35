package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the required size of the array:");
        int sizeOfArray = scanner.nextInt();
        int [] ArrayFromInput = new int[sizeOfArray];

        //Length of array
        //System.out.println(ArrayFromInput.length);
        System.out.println("Enter the elements of the array one by one");

        for (int i = 0; i < sizeOfArray; i++){
            System.out.println("Please enter element number: " + (i+1));
            int elementNr = scanner.nextInt();
            ArrayFromInput[i] = elementNr;
        }
        System.out.print("Source Array: ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(ArrayFromInput[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int k = 0; k < sizeOfArray; k++) {
            sum = sum + ArrayFromInput[k];
        }
        System.out.println("Sum of all elements : " + sum);
    }
}
