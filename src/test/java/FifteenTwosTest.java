import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FifteenTwosTest {

    @Test
    @Disabled
    void on_Five_and_one_Queen() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card('5', '♥'),
                        new Card('Q', '♦'),
                        new Card('A', '♠'),
                        new Card('7', '♣')
                ),
                new Card('6', '♠')
        );
        assertEquals(2, cribbageHand.computeScore());
    }
}
