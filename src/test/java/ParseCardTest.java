import org.junit.jupiter.api.Test;
import sdm.running.example.CardParser;
import sdm.running.example.Rank;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseCardTest {

    private final CardParser cardParser = new CardParser();

    @Test
    void card_with_rank_3() {
        assertEquals(Rank.THREE, cardParser.parse("3♥").rank());
    }

    @Test
    void card_with_rank_10() {
        assertEquals(Rank.TEN, cardParser.parse("0♥").rank());
    }

    @Test
    void card_with_suit_Hearts() {
        assertEquals('♥', cardParser.parse("3♥").suit());
    }
}
