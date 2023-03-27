package homeworks;

import java.util.Random;
import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, please enter 'rock', 'paper' or 'scissors'");
        String player1Input = scanner.nextLine().toLowerCase().trim();

        //System.out.println("Player 2, please enter 'rock', 'paper' or 'scissors'");
        //String player2Input = scanner.nextLine().toLowerCase().trim();

        //Approach if the second input would come from computer
        String[] words = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String player2Input = words[randomIndex];
        System.out.println("Computer: " + player2Input);


        rockPaperScissors(player1Input, player2Input);
    }
    //Method
    private static boolean isPlayersInputValid (String player1, String player2){
        return (player1.matches("rock|paper|scissors") && player2.matches("rock|paper|scissors"));
    }
    public static String rockPaperScissors (String player1, String player2){
        if(isPlayersInputValid(player1, player2)){
            if (player1.matches(player2)){
                System.out.println("Player's 1 move: " + player1 + ", Player's 2 move: " + player2 + ". Result: --> TIE");
            } else if ((player1.equals("rock") && player2.equals("scissors"))
                    || (player1.equals("scissors") && player2.equals("paper"))
                    || (player1.equals("paper") && player2.equals("rock"))) {
                System.out.println("Player's 1 move: " + player1 + ", Player's 2 move: " + player2 + ". Result: --> Player1 wins");
            } else {
                System.out.println("Player's 1 move: " + player1 + ", Player's 2 move: " + player2 + ". Result: --> Player2 wins");
            }
        } else {
            System.out.println("Player's 1 or Player's 2 input is incorrect!");
        }
        return player1 + player2;
    }
}
