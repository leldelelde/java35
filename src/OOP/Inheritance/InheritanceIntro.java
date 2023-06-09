package OOP.Inheritance;
//Normally this would be in separate file
class Parent {
    public void printParent(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void printChild (){
        System.out.println("This is child class");
    }
}

public class InheritanceIntro {
   public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printParent();

        Child child = new Child();
        child.printParent();
        child.printChild();
    }
}
