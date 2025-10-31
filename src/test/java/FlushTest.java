import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlushTest {

    @Test
    void one_for_is_nob() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card('J', '♣'),
                        new Card('7', '♥'),
                        new Card('A', '♣'),
                        new Card('K', '♦')
                ),
                new Card('3', '♣')
        );
        assertEquals(1, cribbageHand.getScore());
    }

    @Test
    void no_points() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card('J', '♣'),
                        new Card('7', '♥'),
                        new Card('A', '♣'),
                        new Card('K', '♦')
                ),
                new Card('3', '♦')
        );
        assertEquals(0, cribbageHand.getScore());
    }

    @Test
    void four_points_for_hand_cards_of_same_suite() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card('3', '♣'),
                        new Card('7', '♣'),
                        new Card('A', '♣'),
                        new Card('K', '♣')
                ),
                new Card('J', '♦')
        );
        assertEquals(4, cribbageHand.getScore());
    }

    @Test
    void five_points_for_all_cards_of_same_suite() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card('3', '♣'),
                        new Card('7', '♣'),
                        new Card('A', '♣'),
                        new Card('K', '♣')
                ),
                new Card('J', '♣')
        );
        assertEquals(5, cribbageHand.getScore());
    }
}
