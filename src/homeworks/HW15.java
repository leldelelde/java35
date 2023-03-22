package homeworks;

import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, please enter 'rock', 'paper' or 'scissors'");
        String player1Input = scanner.nextLine().toLowerCase().trim();

        System.out.println("Player 2, please enter 'rock', 'paper' or 'scissors'");
        String player2Input = scanner.nextLine().toLowerCase().trim();

    }

    //Method
    private static boolean isPlayersInputValid (String player1, String player2){
        return (player1.matches("rock|paper|scissors") && player2.matches("rock|paper|scissors"));
    }
    public static String rockPaperScissors (String player1, String player2){
        if(isPlayersInputValid(player1, player2)){


        } else {
            System.out.println("Your input is incorrect!");
        }

    }


}
