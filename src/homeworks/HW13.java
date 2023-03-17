package homeworks;

import java.util.Arrays;

public class HW13 {
    public static void main(String[] args) {

        int [] myArray = new int[] {11, 56, 48, 34, 19, 201, 16, 9, 12, 63};
        System.out.println("Original Array: " + Arrays.toString(myArray));

        max(myArray);


    }

    public static int max (int [] my_array){
        int i = 0;
        int k = 0;
        int j = 0;
        int maxValue = 0;
        for (int allValues : my_array){
            if (my_array[i] > my_array[i+1]){
                k = my_array[i];
            } else {
                j = my_array[i+1];
            }
            i++;
            maxValue = Math.max(j, k);
        }
        System.out.println("Maximum value for the above array = " + maxValue);
        return maxValue;
    }
}
