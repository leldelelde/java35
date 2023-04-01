package homeworks.HW17;

public class Vehicle {
    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle (float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float maxDistance1 (float fuel, float fuelUsage, int passengers){
       float impactOnFuelUsage = ((passengers * 5) / 100f) * fuelUsage;
       return (fuel / (fuelUsage + impactOnFuelUsage)) * 100f;
    }

    public float maxDistance2(){
        float impactOnFuelUsage = ((passengers * 5) / 100f) * fuelUsage;
        return (fuel / (fuelUsage + impactOnFuelUsage)) * 100f;
    }
}

