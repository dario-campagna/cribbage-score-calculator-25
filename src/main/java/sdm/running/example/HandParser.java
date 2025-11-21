package sdm.running.example;

import java.util.ArrayList;
import java.util.List;

public class HandParser {

    private final CardParser cardParser = new CardParser();

    public CribbageHand parse(String handAsString) {
        List<Card> handCards = new ArrayList<>();
        for (int i = 0; i < handAsString.length()-2; i+=2) {
            Card card = cardParser.parse(handAsString.substring(i, i + 2));
            handCards.add(card);
        }
        return new CribbageHand(handCards, cardParser.parse(handAsString.substring(8,10)));
    }
}
