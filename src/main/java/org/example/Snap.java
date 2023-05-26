package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {
    ArrayList<Card> cards;

    public Snap(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void playGame() {
        boolean hasWon = false;
        boolean isPlayer1Turn = true;
        Card previousCard = null;

        System.out.println("Welcome to SNAP! Player 1 press enter to start...");
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();

        while (!hasWon && cards.size() > 0) {
            Card currentCard = cards.remove(0);

            if (isPlayer1Turn) {
                System.out.println("Player 1 drew a card: " + currentCard);
            } else {
                System.out.println("Player 2 drew a card: " + currentCard);
            }

            if (previousCard != null && previousCard.getSymbol().equals(currentCard.getSymbol())) {
                if (isPlayer1Turn){
                    System.out.println("Player 1 WINS!");
                } else {
                    System.out.println("Player 2 WINS!");
                }
                hasWon = true;
                break;
            }
            previousCard = currentCard;
            isPlayer1Turn = !isPlayer1Turn;

            System.out.println("Press enter for another card...");
            userInput.nextLine();
        }

        if (!hasWon) {
            System.out.println("YOU RAN OUT OF CARDS TO MATCH! GAME OVER");
        }
    }
}
