package org.example;

import org.example.Shuffle.NumberShuffle;
import org.example.Shuffle.RandomShuffle;
import org.example.Shuffle.SuitShuffle;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();

        String[] symbol = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suit = {"\u2665", "\u2663", "\u2666", "\u2660"};

        for (String suits : suit) {
            for (String symbols : symbol) {
                int value = getSymbolValue(symbols);
                cards.add(new Card(symbols, suits, value));
            }
        }

        // Randomly shuffle the cards
        Collections.shuffle(cards);
        getDeck(cards);

        // Cards by Number
        Collections.sort(cards, new NumberShuffle());

        //Cards by Suit
        Collections.sort(cards, new SuitShuffle());

        getDeck(cards);

        System.out.println("Player is about to draw a card...");
        dealCard(cards);
    }

    private static int getSymbolValue(String symbol) {
        if (symbol.equals("Ace")) {
            return 14;
        } else if (symbol.equals("King")) {
            return 13;
        } else if (symbol.equals("Queen")) {
            return 12;
        } else if (symbol.equals("Jack")) {
            return 11;
        } else {
            return Integer.parseInt(symbol);
        }
    }

    private static void getDeck(ArrayList<Card> cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    private static void dealCard(ArrayList<Card> cards) {
        Card topCard = cards.get(0);
        System.out.println("They drew a card: " + topCard);
    }
}
