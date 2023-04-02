package homeworks.HW17;

public class Car extends Vehicle {
    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }
    public float getCalculatedFuelUsage(float fuelUsage, int passengers) {
        float calculatedFuelUsage = fuelUsage + (passengers * fuelUsage * 0.05f);

        if (airConditioner) {
            return calculatedFuelUsage * 1.1f;
        }
        return calculatedFuelUsage;
    }
}