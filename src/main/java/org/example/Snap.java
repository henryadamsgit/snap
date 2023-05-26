package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Snap extends CardGame {
    ArrayList<Card> cards;
    boolean isPlayer1Turn;

    public Snap(ArrayList<Card> cards) {
        this.cards = cards;
        this.isPlayer1Turn = true;
    }

    public void playGame() {
        boolean playAgain = true;

        while (playAgain) {
            final boolean[] hasWon = {false};
            Card previousCard = null;

            System.out.println("Welcome to SNAP!");
            System.out.println("Player 1, press enter to start...");
            Scanner userInput = new Scanner(System.in);
            userInput.nextLine();

            while (!hasWon[0] && cards.size() > 0) {
                Card currentCard = cards.remove(0);
                System.out.println("Player " + (isPlayer1Turn ? "1" : "2") + " drew a card: " + currentCard);

                if (previousCard != null && previousCard.getSymbol().equals(currentCard.getSymbol())) {
                    System.out.println("THERE'S A MATCH! Player " + (isPlayer1Turn ? "1" : "2") + ", type 'snap' quick!");

                    Timer timer = new Timer();
                    TimerTask task = new TimerTask() {
                        @Override
                        public void run() {
                            System.out.println("Time's up! Player " + (isPlayer1Turn ? "1" : "2") + " didn't SNAP in time.");
                            hasWon[0] = true;
                        }
                    };

                    // Timer duration (3 seconds)
                    timer.schedule(task, 3000);
                    String snapInput = userInput.nextLine();
                    timer.cancel();


                    if (snapInput.equals("snap")) {
                        System.out.println("SUCCESSFUL SNAP! Player " + (isPlayer1Turn ? "1" : "2") + " WINS!");
                        hasWon[0] = true;
                        break;
                    } else {
                        System.out.println("Incorrect input. Player " + (isPlayer1Turn ? "1" : "2") + " LOSES!");
                    }
                }

                previousCard = currentCard;
                isPlayer1Turn = !isPlayer1Turn;

                System.out.println("Press enter for another card...");
                userInput.nextLine();
            }

            if (!hasWon[0]) {
                System.out.println("YOU RAN OUT OF CARDS TO MATCH! GAME OVER");
            }

            System.out.println("Would you like to play again? Enter 'yes' to restart or enter 'quit' to exit.");
            String restartInput = userInput.nextLine();
            playAgain = restartInput.isEmpty() || restartInput.equals("yes");
            if (!playAgain) {
                System.out.println("Thank you for playing SNAP!");
            }
        }
    }
}
