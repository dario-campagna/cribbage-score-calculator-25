package sdm.running.example;

import java.util.List;

public class CribbageHand {
    private final List<Card> handCards;
    private final Card starterCard;

    public CribbageHand(List<Card> handCards, Card starterCard) {
        this.handCards = handCards;
        this.starterCard = starterCard;
    }

    public Card starterCard() {
        return starterCard;
    }

    public List<Card> handCards() {
        return handCards;
    }

    public int getScore() {
        char suite = handCards.getFirst().suite();
        if (handCards.stream().allMatch(card -> card.suite() == suite)) {
            return 4;
        }
        if (handCards.contains(new Card('J', starterCard.suite()))) {
            return 1;
        }
        return 0;
    }
}
