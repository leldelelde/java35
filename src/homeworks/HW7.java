package homeworks;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the required size of the array:");
        int sizeOfArray = scanner.nextInt();

        String [] ArrayFromInput = new String[sizeOfArray];

        //Length of array
        //System.out.println(ArrayFromInput.length);

        int i = 0;
        do {
            System.out.println("Please enter element number: " + (i+1));
            int elementNr = scanner.nextInt();
            i++;
        }while (i != sizeOfArray );
    }
}
