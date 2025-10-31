package sdm.running.example;

import java.util.ArrayList;
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
        List<Card> allCards = new ArrayList<>(handCards);
        allCards.add(starterCard);
        boolean hasOnePair = false;
        while (allCards.size() > 1 && !hasOnePair) {
            Card card = allCards.removeFirst();
            hasOnePair = allCards.stream().anyMatch(c -> c.rank() == card.rank());
        }
        if (hasOnePair) {
            return 2;
        }
        
        int score = 0;
        score += pointsForFlush();
        score += pointsForHisNob();
        return score;
    }

    private int pointsForFlush() {
        int points = 0;
        char suite = handCards.getFirst().suite();
        if (handCards.stream().allMatch(card -> card.suite() == suite)) {
            points += 4;
            if (handCards.getFirst().suite() == starterCard.suite()) {
                points++;
            }
        }
        return points;
    }

    private int pointsForHisNob() {
        if (handCards.contains(new Card('J', starterCard.suite()))) {
            return 1;
        }
        return 0;
    }
}
