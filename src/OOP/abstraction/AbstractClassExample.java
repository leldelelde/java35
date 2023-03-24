package OOP.abstraction;
//Abstract class
abstract class Animal{
    protected String name;
    //Regular method
    public void sleep (){
        System.out.println("ZZZZ");
    }
    //Abstract method
    public abstract  void animalSound ();
}

class Pig extends Animal {
    public void animalSound(){
        System.out.println("oink oink");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {

        //Can not create an object from abstract class
        //Animal animal1 = new Animal();

        Pig pig = new Pig();
        pig.sleep();
        pig.animalSound();


    }

}
