package org.example.Shuffle;

import org.example.Card;

import java.util.Comparator;

public class NumberShuffle implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
    return Integer.compare(card1.getValue(),(card2.getValue()));
    }

}
