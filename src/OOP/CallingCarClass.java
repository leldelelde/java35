package OOP;

import Tasks.LeapYear;

import java.util.Scanner;

public class CallingCarClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter car's brand");
        String carBrand = scanner.nextLine();
        System.out.println("Please enter car's colour");
        String carColour = scanner.nextLine();
        System.out.println("Please enter car's max speed");
        int carMaxSpeed = scanner.nextInt();

        //Create new car class object - can use created class
        Car car1 = new Car();

        //Set field values with data that we got from user - this can be used only when the private is not set and set methods are not used
   /*     car1.brand = carBrand;
        car1.colour = carColour;
        car1.maxSpeed = carMaxSpeed;*/

        //Set field values with data that we got from user - when private and Setter methods are used
        car1.setBrand(carBrand);
        car1.setColour(carColour);
        car1.setMaxSpeed(carMaxSpeed);

        car1.printCarInfo();

        //Get max speed
        System.out.println(car1.getMaxSpeed());

        if (car1.getMaxSpeed() >= 300){
            System.out.println("Sports car");
        }else {
            System.out.println("Regular car");
        }


    }
}
