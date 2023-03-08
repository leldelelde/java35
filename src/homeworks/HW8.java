package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the required size of the array:");
        int sizeOfArray = scanner.nextInt();
        float [] DefinedArray = new float[sizeOfArray];
        float sum = 0;
        float average = 0f;

        System.out.println("Enter the grades of the array one by one");

        for (int i = 0; i < DefinedArray.length; i++){
            System.out.println("Please enter grade number: " + (i+1));
            DefinedArray[i] = scanner.nextFloat();
        }
        System.out.println();

        for (int k = 0; k < sizeOfArray; k++) {
            sum = sum + DefinedArray[k];
           average = sum / sizeOfArray;
        }
        System.out.printf("Average grade : %.2f\n", average);

        System.out.printf("There was passed %d values\n", sizeOfArray);
        System.out.println(Arrays.toString(DefinedArray));


    }
}
