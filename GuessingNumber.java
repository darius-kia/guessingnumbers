import java.util.*;
import javax.swing.*;
import java.awt.*;

public class GuessingNumber {

    public static void main(String[] args) {
        // Scanner reader = new Scanner(System.in);
        int max = 10;
        while (true) {
            String response = JOptionPane.showInputDialog("Type \"start\" to begin a new game or \"limit\" to change the limit: ", "");
            if (response.equals("limit")) {
                max = Integer.parseInt(JOptionPane.showInputDialog("Enter a new limit: ", ""));
            } else if (response.equals("start")) {
                guessingGame(max);
            }
        }
    }

    public static void guessingGame(int max) {
        // Scanner reader = new Scanner(System.in);
        Random random = new Random();
        int count, ran = random.nextInt(max) + 1;
        boolean win = false;
        int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number from 1-" + max + ": ", ""));
        for (count = 1; count < 11; count++) {
            if (guess > ran) {
              guess = Integer.parseInt(JOptionPane.showInputDialog("The number is lower...\nTries: " + count + "\n"));
            } else if (guess < ran) {
              guess = Integer.parseInt(JOptionPane.showInputDialog("The number is higher...\nTries: " + count + "\n"));
            } else {
                win = true;
                break;
            }
        }
        if (win) {
            JOptionPane.showMessageDialog(null, "Congratulations, you guessed the number in " + count + " guesses!\n");
        } else {
            JOptionPane.showMessageDialog(null, "The number was: " + ran + "\n");
        }
    }
}
