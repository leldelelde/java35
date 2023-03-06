package basics;

public class PrintFormating {
    public static void main(String[] args) {

       // System.out.println();
       // System.out.print();

        // s - String
        // d - integer
        // f - float/ double
        // c - char
        // b - boolean

        String name = "Bob";
        int age = 34;

        System.out.println("Hello " + name + " your age is " + age);

        System.out.printf("Hello %s your age is %d\n", name, age);

        double height = 192.2342534d;

        System.out.printf("%s is %f cm tall", name, height);
        System.out.printf("\n%s is %.2f cm tall", name, height);

        // Hello Bob! Your age is 34 and your height is 192.23 cm. Good job Bob!

        System.out.printf("\nHello %1$s! Your age is %2$d and your height is %3$.2f cm. Good job %1$s!", name, age, height);


    }
}
