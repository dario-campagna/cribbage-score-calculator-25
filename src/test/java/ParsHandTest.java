import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;
import sdm.running.example.HandParser;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParsHandTest {

    @Test
    void starter_card_is_Seven_of_Clubs() {
        CribbageHand cribbageHand = new HandParser().parse("5♥5♦5♠5♣7♣");
        Card starterCard = cribbageHand.starterCard();
        assertEquals(new Card('7', '♣'), starterCard);
    }

    @Test
    void starter_card_is_Queen_of_Hearts() {
        CribbageHand cribbageHand = new HandParser().parse("5♥5♦5♠5♣Q♥");
        Card starterCard = cribbageHand.starterCard();
        assertEquals(new Card('Q', '♥'), starterCard);
    }

    @Test
    void starter_card_is_Ace_of_Hearts() {
        CribbageHand cribbageHand = new HandParser().parse("5♥5♦5♠5♣A♥");
        Card starterCard = cribbageHand.starterCard();
        assertEquals(new Card('A', '♥'), starterCard);
    }

    @Test
    void hand_cards_Five_of_all_suites() {
        CribbageHand cribbageHand = new HandParser().parse("5♥5♦5♠5♣7♣");
        List<Card> handCards = cribbageHand.handCards();
        List<Card> expectedHandCards = Arrays.asList(
                new Card('5', '♥'),
                new Card('5', '♦'),
                new Card('5', '♠'),
                new Card('5', '♣')
        );
        assertEquals(expectedHandCards, handCards);
    }
}
