package Tasks;

public class Triangle {
    //Fields
    private double side1;
    private double side2;
    private double side3;

    //Setter methods
    public void setSide1 (double side1){
        this.side1 = side1;
    }
    public void setSide2 (double side2) { this.side2 = side2;}
    public void setSide3 (double side3) { this.side3 = side3;}

    //Getter methods


    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

   //Validation method
    private boolean isValid (double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 >side1) {
            return true;
        } else {
            return false;
        }
        // or return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 >side1);
    }
    public double areaTriangle (){
        double area = 0;
        if (isValid(side1, side2, side3)){
            double halfOfPerimeter = (side1 + side2 + side3)/2;
            double pValue = halfOfPerimeter*(halfOfPerimeter-side1)*(halfOfPerimeter-side2)*(halfOfPerimeter-side3);
            area = Math.sqrt(pValue);
        } else {
            System.out.println("Triangle is not valid");
        }
        return area;
    }
}
