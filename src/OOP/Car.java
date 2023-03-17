package OOP;

public class Car {

    //Fields

    private String colour;
    private String brand;
    private int maxSpeed;

    //Setter methods
    public void setColour(String colour){
        this.colour = colour; //this.colour represents 7th line in this file
    }
    public void setBrand (String brand){
        this.brand = brand;
    }
    public void setMaxSpeed (int maxSpeed){
        //adding a data validation
        if (maxSpeed >= 30){
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Invalid input");
        }

    }

    //Getter methods
    public String getColour (){
        return colour;
    }
    public String getBrand(){
        return brand;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    //Method
    public void printCarInfo(){
        System.out.println("Car info: ");
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Max speed: " + maxSpeed);

    }
}
