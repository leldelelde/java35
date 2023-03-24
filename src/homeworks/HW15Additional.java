package homeworks;

import java.util.Scanner;

public class HW15Additional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, please enter 'rock', 'paper', 'scissors', 'lizard' or 'spock'");
        String player1Input = scanner.nextLine().toLowerCase().trim();

        System.out.println("Player 2, please enter 'rock', 'paper', 'scissors', 'lizard' or 'spock'");
        String player2Input = scanner.nextLine().toLowerCase().trim();

        rockPaperScissorsLizardSpock(player1Input, player2Input);
    }
    //Method
    private static boolean isPlayersInputValid (String player1, String player2){
        return (player1.matches("rock|paper|scissors|lizard|spock") && player2.matches("rock|paper|scissors|lizard|spock"));
    }
    public static String rockPaperScissorsLizardSpock (String player1, String player2){
        if(isPlayersInputValid(player1, player2)){
            if (player1.matches(player2)){
                System.out.println("Player's 1 move: " + player1 + ", Player's 2 move: " + player2 + ". Result: --> TIE");
            } else if ((player1.equals("rock") && player2.matches("scissors|lizard"))
                    || (player1.equals("scissors") && player2.matches("paper|lizard"))
                    || (player1.equals("paper") && player2.matches("rock|spock"))
                    || (player1.equals("lizard") && player2.matches("paper|spock"))
                    || (player1.equals("spock") && player2.matches("rock|scissors"))) {
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
