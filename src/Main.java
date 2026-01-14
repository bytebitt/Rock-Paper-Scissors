import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};
        boolean playAgain = true;

        do {
            boolean isValidChoice = false;

            System.out.print("Enter your move (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            int randomIndex = random.nextInt(options.length);
            String computerChoice = options[randomIndex];

            for (String option : options) {
                if (option.equals(userChoice)) {
                    isValidChoice = true;
                    break;
                }
            }

            if (isValidChoice) {
                System.out.println("Computer choice: " + computerChoice);
                if ((userChoice.equals("rock") && computerChoice.equals("scissors") ||
                        userChoice.equals("paper") && computerChoice.equals("rock") ||
                        userChoice.equals("scissors") && computerChoice.equals("paper"))) {

                    System.out.println("You won!");
                } else if (userChoice.equals(computerChoice)) {
                    System.out.println("It's a tie");
                } else {
                    System.out.println("Computer wins");
                }
            } else {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.print("Play again? (Y/N): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals("N")) {
                playAgain = false;
            }

        } while (playAgain);

        scanner.close();
    }
}
