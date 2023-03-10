package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        //Example1
        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("ab");
        Matcher matcher1 = pattern.matcher("abb");

        System.out.println(matcher.matches());
        System.out.println(matcher1.find());

        //Example 2
        // Any 3 symbols that would be any lower case letter or number from 5 to 9
        //                                   [defines range]{number of symbols}, "input which is looked for
        System.out.println(Pattern.matches("[a-z5-9]{3}", "ar6"));
        //this (example2) allows also symbols like @ etc, the they should be put in []

        //2 uppercase letters followed by at least 2 lower case letters and then 3 numbers

        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2,}[0-9]{3}", "LZego648"));
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2,}[0-9]{3}", "aLZego648"));

        // 2 to 7 any letter or any numbers
        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,7}", "Rdi67"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleae enter your car's plate number");
        String plateNumber = scanner.nextLine();

        //2 uppercase letters followed by one "-" symbol and then 2 to 4 numbers
        if (Pattern.matches("[A-Z]{2}-[0-9]{2,4}", plateNumber)){
            System.out.println("Your plate number is valid!");
        }else{
            System.out.println("Your plate number is not valid");
        }






    }
}
