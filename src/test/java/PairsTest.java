import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairsTest {

    @Test
    void two_points_for_one_pair() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card('5', '♥'),
                        new Card('5', '♦'),
                        new Card('A', '♠'),
                        new Card('2', '♣')
                ),
                new Card('6', '♣')
        );
        assertEquals(2, cribbageHand.computeScore());
    }

    @Test
    void six_points_for_three_of_a_kind() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card('A', '♥'),
                        new Card('A', '♦'),
                        new Card('A', '♠'),
                        new Card('2', '♣')
                ),
                new Card('6', '♣')
        );
        assertEquals(6, cribbageHand.computeScore());
    }

    @Test
    void twelve_points_for_four_of_a_kind() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card('6', '♥'),
                        new Card('Q', '♦'),
                        new Card('Q', '♠'),
                        new Card('Q', '♣')
                ),
                new Card('Q', '♠')
        );
        assertEquals(12, cribbageHand.computeScore());
    }
}
