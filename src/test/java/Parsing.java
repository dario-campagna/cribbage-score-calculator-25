import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CardParser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Parsing {

    @Test
    void card_with_rank_3() {
        // Arrange
        CardParser parser = new CardParser();

        // Act
        Card card = parser.parse("3♥");
        
        // Assert
        assertEquals('3', card.rank());
    }

    @Test
    void card_with_rank_10() {
        assertEquals('0', new CardParser().parse("0♥").rank());
    }

    @Test
    void card_with_suite_Hearts() {
        assertEquals('♥', new CardParser().parse("3♥").suite());
    }
}
