package org.example.Shuffle;

import org.example.Card;
import java.util.Comparator;

public class SuitShuffle implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        return card1.getSymbol().compareTo(card2.getSymbol());
    }
}

