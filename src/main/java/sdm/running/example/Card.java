package sdm.running.example;

public class Card {
    private final Rank rank;
    private final char suite;
    
    public Card(Rank rank, char suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public Rank rank() {
        return rank;
    }

    public char suite() {
        return suite;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Card card)) return false;

        return suite == card.suite && rank == card.rank;
    }

    @Override
    public int hashCode() {
        int result = suite;
        result = 31 * result + rank.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "" + rank + suite;
    }
}
