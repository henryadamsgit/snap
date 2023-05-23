package org.example;

import java.util.ArrayList;

public class CardGame {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();

        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"\u2665", "\u2663", "\u2666", "\u2660"};

        for (String suit : suits) {
            for (String symbol : symbols) {
                int value = getSymbolValue(symbol);
                cards.add(new Card(symbol, suit, value));
            }
        }
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
