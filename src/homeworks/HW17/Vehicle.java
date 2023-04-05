package homeworks.HW17;

/*public class Vehicle {
    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle (float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float getCalculatedFuelUsage(float fuelUsage, int passengers) {
        return fuelUsage + (passengers * fuelUsage * 0.05f);
    }

    public float maxDistance (float fuel, float fuelUsage, int passengers){
       float calculatedFuelUsage = getCalculatedFuelUsage(fuelUsage, passengers);
       float distance = (fuel / calculatedFuelUsage) * 100f;
       return distance;
    }

    public float maxDistance(){
      return maxDistance (fuel, fuelUsage, passengers);
    }
}*/

public class Vehicle {
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public Vehicle (float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float maxDistance (float fuel, float fuelUsage, int passengers){
        return (fuel / (fuelUsage + (passengers * fuelUsage * 0.05f))) * 100f;

    }

    public float maxDistance(){
        return (fuel / (fuelUsage + (passengers * fuelUsage * 0.05f))) * 100f;
    }
}

