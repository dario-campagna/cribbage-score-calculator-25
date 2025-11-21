import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;
import sdm.running.example.Rank;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlushTest {

    @Test
    void one_for_is_nob() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.JACK, '♣'),
                        new Card(Rank.SEVEN, '♥'),
                        new Card(Rank.ACE, '♣'),
                        new Card(Rank.KING, '♦')
                ),
                new Card(Rank.THREE, '♣')
        );
        assertEquals(1, cribbageHand.computeScore());
    }

    @Test
    void no_points() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.JACK, '♣'),
                        new Card(Rank.SEVEN, '♥'),
                        new Card(Rank.ACE, '♣'),
                        new Card(Rank.KING, '♦')
                ),
                new Card(Rank.THREE, '♦')
        );
        assertEquals(0, cribbageHand.computeScore());
    }

    @Test
    void four_points_for_hand_cards_of_same_suite() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.THREE, '♣'),
                        new Card(Rank.SEVEN, '♣'),
                        new Card(Rank.ACE, '♣'),
                        new Card(Rank.KING, '♣')
                ),
                new Card(Rank.JACK, '♦')
        );
        assertEquals(4, cribbageHand.computeScore());
    }

    @Test
    void five_points_for_all_cards_of_same_suite() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.THREE, '♣'),
                        new Card(Rank.SEVEN, '♣'),
                        new Card(Rank.ACE, '♣'),
                        new Card(Rank.KING, '♣')
                ),
                new Card(Rank.JACK, '♣')
        );
        assertEquals(5, cribbageHand.computeScore());
    }
}
