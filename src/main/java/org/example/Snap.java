package org.example;

import org.example.Shuffle.ShuffleCards;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {
    ArrayList<Card> cards;

    public Snap(ArrayList<Card> cards) {
        this.cards = cards;
    }

    private boolean checkSnap(){
        int numberOfCards = cards.size();
        if (numberOfCards >= 2) {
            Card previousCard = cards.get(numberOfCards -2);
            Card currentCard = cards.get(numberOfCards -1);
            return previousCard.getSymbol().equals(currentCard.getSymbol());
        }
        return false;
    }


    public void playGame() {
        System.out.println("Welcome to SNAP! Please press enter to start...");
        Scanner userInput = new Scanner(System.in);
        String startGame = userInput.nextLine();

        while (checkSnap()) {
            Card topCard = cards.remove(0);
            System.out.println("They drew a card: " + topCard);
            System.out.println("Press enter for another card...");
            userInput.nextLine();
        }
        System.out.println("SNAP! You win!");
    }







}
