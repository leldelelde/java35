package basics;

public class Loops {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        for (int i = 0; i < 10; i++){
            System.out.println("Hello world!");
        }

        for (int i = 1; i <=10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        // Increasing by 2
        for (int i = 1; i <=10; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        //While loop
        int i = 100;
        while (i <= 10){
            System.out.println("This is while loop " + i);
            i++;
        }

        // Do while loop
        i = 100;
        do {
            System.out.println("This is do while loop " + i);
            i++;
        }while (i <= 10);


    }
}
