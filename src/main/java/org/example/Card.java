package org.example;

public class Card {
    protected String suit;
    protected String symbol;
    protected int value;

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return "The " + symbol + " of " + suit + ". Value = " + value;
    }

}

