package Collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {

        //Declaring ArrayList object
        ArrayList<String> car = new ArrayList<String>();

        //Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        //Print out all elements
        System.out.println(car);

        //Get element by index
        System.out.println(car.get(0));

        //Add element at the specific index
        car.add(2, "Toyota");
        System.out.println(car);

        //changing elements value
        car.set(3, "Ford");
        System.out.println(car);

        //remove element
        car.remove(5);
        System.out.println(car);
        car.remove("Mercedes");
        System.out.println(car);

        //what is the size of the ArrayList
        System.out.println(car.size());
        
        //deleting all the elements
        car.clear();
        System.out.println(car);



    }
}
