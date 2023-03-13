package OOP;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName = scanner.nextLine();

        System.out.println("Please enter your age");
        int usersAge = scanner.nextInt();

        printName(userName, usersAge);
       printName("Bob", 45);
       printName("Lisa", 98);
       String answer2 = greetings(userName);

        System.out.println(answer2);
    }

    public static void printName(String name, int age){
        System.out.println("Hello your name is " + name);
        System.out.println("You are " + age + " years old");
    }

    public static String greetings(String name){
        String result = "Hi " + name;
        return result;
    }
}
