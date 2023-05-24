package org.example.Shuffle;

import org.example.Card;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class RandomShuffle {
    public static Card[] getRandom(Card[] cards) {
        List<Card> random = new ArrayList<>();
        Collections.addAll(random, cards);
        Collections.shuffle(random);
        return random.toArray(new Card[random.size()]);
    }
}


