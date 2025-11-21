import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;
import sdm.running.example.Rank;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FifteenTwosTest {

    @Test
    @Disabled
    void on_Five_and_one_Queen() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.FIVE, '♥'),
                        new Card(Rank.QUEEN, '♦'),
                        new Card(Rank.ACE, '♠'),
                        new Card(Rank.SEVEN, '♣')
                ),
                new Card(Rank.SIX, '♠')
        );
        assertEquals(2, cribbageHand.computeScore());
    }
}
