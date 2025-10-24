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
}
