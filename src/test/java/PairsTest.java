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
        assertEquals(2, cribbageHand.getScore());
    }
}
