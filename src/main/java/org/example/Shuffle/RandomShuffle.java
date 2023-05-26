package org.example.Shuffle;

import org.example.Card;
import java.util.Collections;
import java.util.ArrayList;

public class RandomShuffle {
    public static ArrayList<Card> getRandom(ArrayList<Card> cards) {
     Collections.shuffle(cards);
     return cards;
    }

}


