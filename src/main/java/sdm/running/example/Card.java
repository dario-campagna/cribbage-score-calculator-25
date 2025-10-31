package sdm.running.example;

public class Card {
    private final char rank;
    private final char suite;

    public Card(char rank, char suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public char rank() {
        return rank;
    }

    public char suite() {
        return suite;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Card card)) return false;

        return rank == card.rank && suite == card.suite;
    }

    @Override
    public int hashCode() {
        int result = rank;
        result = 31 * result + suite;
        return result;
    }

    @Override
    public String toString() {
        return "" + rank + suite;
    }
}
