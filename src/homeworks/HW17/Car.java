package homeworks.HW17;

public class Car extends Vehicle {
    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public float maxDistance2 (float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        float impactOnFuelUsage = ((passengers * 5) / 100f) * fuelUsage;
        float total = (fuel / (fuelUsage + impactOnFuelUsage)) * 100f * 14f;
        if (airConditioner = true) {
            total += 0.1f * total;
        }
        return total;
    }
}