public class Operators {
    public static void main(String[] args) {

        //Basic arithmetic operators -, +, *, /,%
        int x = 100;
        x = x + 10;
        System.out.println(x);

        //Assignment operator =, +=, -=, *=, /=
        int a = 10;
        a = 20;
        a += 20;
        System.out.println(a);

        //Incrementation and decrementation operators ++, --

        int i = 10;
        i++;
        ++i;
        System.out.println(i);

        //Post incrementation
        int num1 = 10;
        System.out.println(num1++);
        System.out.println(num1);

        //Pre incrementation
        int num2 = 10;
        System.out.println(++num2);
        System.out.println(num2);
        
        //4 ways to increment by one
        num1 = num1 + 1;
        num1 += 1;
        num1++;
        ++num1;

        //Relational operators
        //Equality ==
        int p = 10;
        int k = 10;
        System.out.println("Equality " + (p==k));

        //Inequality !=
        System.out.println("Inequality " + (p!=k));

        //Greater than > and greater than or equal to >=
        System.out.println("Greater than " + (p>k));
        System.out.println("Greater than or equal to " + (p>=k));

        //Less than < and less than or equal to <=
        System.out.println("Less than " + (p<k));
        System.out.println("Less than or equal to " + (p<=k));

        //Logical operators
        //Logical AND - &&

        boolean sun = true;
        boolean dry = true;

        System.out.println("I will go outside " + (sun && dry));

        boolean wind = false;
        boolean rain = true;

        System.out.println("I will go outside " + (wind && rain));

        int bobsAge = 8;
        int johnAge = 9;
        int annasAge = 10;

        //Is John older than bob and younger than Anna?

        System.out.println("Is John older than bob and younger than Anna? " + ((johnAge > bobsAge) && (johnAge < annasAge)));


        //Logical OR - ||

        boolean sale = false;
        boolean rich = false;

        System.out.println("I will buy iPhone " + (sale || rich));

        //negation - !
        boolean example = true;
        System.out.println(example);
        System.out.println(!example);





    }
}
