package sdm.running.example;

public class Card {
    private final Rank rank;
    private final char suit;
    
    public Card(Rank rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank rank() {
        return rank;
    }

    public char suit() {
        return suit;
    }

    public int value() {
        return rank.asNumber();
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Card card)) return false;

        return suit == card.suit && rank == card.rank;
    }

    @Override
    public int hashCode() {
        int result = suit;
        result = 31 * result + rank.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "" + rank + suit;
    }
}
