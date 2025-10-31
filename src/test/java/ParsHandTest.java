import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;
import sdm.running.example.HandParser;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParsHandTest {

    @Test
    void starter_card_is_Seven_of_Clubs() {
        CribbageHand cribbageHand = new HandParser().parse("5♥5♦5♠5♣7♣");
        Card starterCard = cribbageHand.starterCard();
        assertAll(
                () -> assertEquals('7', starterCard.rank()),
                () -> assertEquals('♣', starterCard.suite())
        );
    }
}
