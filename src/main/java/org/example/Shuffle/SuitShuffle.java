package org.example.Shuffle;

import org.example.Card;

import java.util.ArrayList;
import java.util.Comparator;

public class SuitShuffle implements Comparator<Card> {


   // Sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A of hearts, then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc.) and stores the new shuffled
   // deck back into the deckOfCards attribute.

    @Override
    public int compare(Card card1, Card card2) {
        return card1.getSymbol().compareTo(card2.getSymbol());
    }
}

