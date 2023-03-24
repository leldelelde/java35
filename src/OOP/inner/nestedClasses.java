package OOP.inner;

class OuterClass {
    int num = 10;

    class InnerClass{
        int num = 5;
    }
}

public class nestedClasses {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println("Outer class value: " + outerClass.num);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("Inner class value: " + innerClass.num);


    }
}
