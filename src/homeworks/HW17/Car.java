package homeworks.HW17;

public class Car extends Vehicle {
    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }
    public float maxDistance(){
        float total = (fuel / (fuelUsage + (passengers * fuelUsage * 0.05f))) * 100f;

        if (airConditioner && passengers > 0) {
            return fuel / (fuelUsage + ((passengers * fuelUsage * 0.05f) *1.1f)) * 100f;
        } else if (airConditioner && passengers == 0){
            return (fuel / (fuelUsage * 1.1f)) * 100f;
        }
        return total;
    }
}