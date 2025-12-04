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

    public long numberOfPairs() {
        return Generator.combination(getAllCards()).simple(2).stream().filter(pair -> pair.getFirst().rank() == pair.getLast().rank()).count();
    }

    public long numberOfFifteenTwos() {
        return Generator.subset(getAllCards()).simple().stream().filter(cards -> sum(cards) == 15).count();
    }

    private List<Card> getAllCards() {
        List<Card> allCards = new ArrayList<>(handCards);
        allCards.add(starterCard);
        return allCards;
    }

    private int sum(List<Card> cards) {
        return cards.stream().mapToInt(Card::value).sum();
    }

    public boolean starterCardHasSameSuitOfHandCards() {
        return handCards.stream().allMatch(card -> card.suit() == starterCard.suit());
}

    public boolean allHandCardsHavaSameSuit() {
        char suit = handCards.getFirst().suit();
        return handCards.stream().allMatch(card -> card.suit() == suit);
    }

    public boolean hasIsNob() {
        return handCards.contains(new Card(Rank.JACK, starterCard.suit()));
    }
}
