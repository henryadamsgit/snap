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
        Card previousCard = null;

        System.out.println("Welcome to SNAP! Please press enter to start...");
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();

        while (!hasWon && cards.size() > 0) {
            Card currentCard = cards.remove(0);
            System.out.println("You drew a card: " + currentCard);

            if (previousCard != null && previousCard.getSymbol().equals(currentCard.getSymbol())) {
                hasWon = true;
                System.out.println("SNAP! YOU WIN!");
                break;
            }

            previousCard = currentCard;

            System.out.println("Press enter for another card...");
            userInput.nextLine();
        }

        if (!hasWon) {
            System.out.println("YOU RAN OUT OF CARDS TO MATCH! GAME OVER");

        }
    }
}
