package OOP.Inheritance;

class Vehicle {
    protected String brand;
    public void hank (){
        System.out.println("Tu tu");
        System.out.println("Brand: " + brand);
    }
}
// when it just extended, it will from main method print the same "Tu tu" and "Tesla"
// should override to get different printout
class Bike extends Vehicle {
    public void hank (){
        System.out.println("Bip Bip");
        System.out.println("Brand: " + brand);
    }
}

class GrandChild extends Bike {

}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Tesla";
        vehicle.hank();

        Bike bike = new Bike();
        bike.brand = "Cube";
        bike.hank();

        GrandChild grandchild = new GrandChild();
        grandchild.hank();
    }
}
