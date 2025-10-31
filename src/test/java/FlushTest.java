import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlushTest {

    @Test
    void one_for_is_nobs() {
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
}
