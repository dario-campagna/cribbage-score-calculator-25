package sdm.running.example;

import org.paukov.combinatorics3.Generator;

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

    public long computeScore() {
        int score = 0;
        score += pointsForFlush();
        score += pointsForHisNob();
        score += pointsForPairs();
        return score;
    }

    private long pointsForPairs() {
        List<Card> allCards = new ArrayList<>(handCards);
        allCards.add(starterCard);

        allCards = new ArrayList<>(handCards);
        allCards.add(starterCard);
        long pairs = Generator.combination(allCards).simple(2).stream().filter(pair -> pair.getFirst().rank() == pair.getLast().rank()).count();
        if (pairs > 0) {
            return pairs * 2;
        }
        return 0;
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
