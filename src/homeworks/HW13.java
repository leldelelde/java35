package homeworks;

import java.util.Arrays;

public class HW13 {
    public static void main(String[] args) {

        int [] myArray = new int[] {11, 56, 48, 34, 19, 201, 16, 9, 12, 63};
        System.out.println("Original Array: " + Arrays.toString(myArray));

        max(myArray);
        min(myArray);
    }
    public static int max (int [] my_array){
        int max = my_array[0];

        for (int i = 0; i< my_array.length; i++){
            if (my_array[i]>max){
                max = my_array[i];
            }
        }
        System.out.println("Maximum value for the above array = " + max);
        return max;
    }

    public static int min (int [] my_array){
        int min = my_array[0];

        for (int i = 0; i< my_array.length; i++){
            if (my_array[i]<min){
                min = my_array[i];
            }
        }
        System.out.println("Minimum value for the above array = " + min);
        return min;
    }
}
