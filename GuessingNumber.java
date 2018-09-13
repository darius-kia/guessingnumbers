import java.util.*;
public class GuessingNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int max = 10;
        while (true) {
            System.out.print("Type \"start\" to begin a new game or \"limit\" to change the limit: ");
            String response = reader.nextLine();
            if (response.equals("limit")) {
                System.out.print("Enter a new limit: ");
                max = Integer.parseInt(reader.nextLine());
                System.out.println("");
            } else if (response.equals("start")) {
                guessingGame(max);
            }
        }
    }

    public static void guessingGame(int max) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        int count, ran = random.nextInt(max) + 1;
        boolean win = false;
        for (count = 1; count < 11; count++) {
            System.out.print("Guess a number from 1-" + max + ": ");
            int guess = Integer.parseInt(reader.nextLine());
            if (guess > ran) {
                System.out.println("The number is lower...\nTries: " + count + "\n");
            } else if (guess < ran) {
                System.out.println("The number is higher...\nTries: " + count + "\n");
            } else {
                win = true;
                break;
            }
        }
        if (win) {
            System.out.println("Congratulations, you guessed the number in " + count + " guesses!\n");
        } else {
            System.out.println("The number was: " + ran + "\n");
        }
    }
}
