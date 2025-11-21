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
        long score = 0;
        score += pointsForFlush();
        score += pointsForHisNob();
        score += pointsForPairs();
        score += pointsForFifteenTwos();
        return score;
    }

    private long pointsForFifteenTwos() {
        List<Card> allCards = new ArrayList<>(handCards);
        allCards.add(starterCard);
        long combinations = Generator.subset(allCards).simple().stream().filter(cards -> sum(cards) == 15).count();
        if (combinations > 0) {
            return combinations * 2;
        }
        return 0;
    }

    private int sum(List<Card> cards) {
        return cards.stream().mapToInt(Card::value).sum();
    }

    private long pointsForPairs() {
        List<Card> allCards = new ArrayList<>(handCards);
        allCards.add(starterCard);
        long pairs = Generator.combination(allCards).simple(2).stream().filter(pair -> pair.getFirst().rank() == pair.getLast().rank()).count();
        if (pairs > 0) {
            return pairs * 2;
        }
        return 0;
    }

    private long pointsForFlush() {
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

    private long pointsForHisNob() {
        if (handCards.contains(new Card(Rank.JACK, starterCard.suite()))) {
            return 1;
        }
        return 0;
    }
}
