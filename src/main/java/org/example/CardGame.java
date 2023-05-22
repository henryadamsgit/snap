package org.example;

import java.util.ArrayList;

public class CardGame {
    private static int getSymbolValue(String symbol) {
        if (symbol.equals("A")) {
            return 14;
        } else if (symbol.equals("K")) {
            return 13;
        } else if (symbol.equals("Q")) {
            return 12;
        } else if (symbol.equals("J")) {
            return 11;
        } else {
            return Integer.parseInt(symbol);
        }
    }

    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();

        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"\u2665", "\u2663", "\u2666", "\u2660"};

        for(String suit : suits) {
            for (String symbol : symbols) {
                int value = getSymbolValue(symbol);
                cards.add(new Card(symbol, suit, value));
            }
        }

        // print all cards
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
