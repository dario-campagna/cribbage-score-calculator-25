import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CardParser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseHandTest {

    private final CardParser cardParser = new CardParser();

    @Test
    void card_with_rank_3() {
        assertEquals('3', cardParser.parse("3♥").rank());
    }

    @Test
    void card_with_rank_10() {
        assertEquals('0', cardParser.parse("0♥").rank());
    }

    @Test
    void card_with_suite_Hearts() {
        assertEquals('♥', cardParser.parse("3♥").suite());
    }
}
