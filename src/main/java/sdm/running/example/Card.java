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
}
