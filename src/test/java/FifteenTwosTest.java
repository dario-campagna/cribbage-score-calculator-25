import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;
import sdm.running.example.Rank;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FifteenTwosTest {

    @Test
    void one_Five_and_one_Queen() {
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

    @Test
    void one_Five_one_Nine_and_one_Four() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.FIVE, '♥'),
                        new Card(Rank.NINE, '♦'),
                        new Card(Rank.ACE, '♠'),
                        new Card(Rank.SEVEN, '♣')
                ),
                new Card(Rank.FOUR, '♠')
        );
        assertEquals(2, cribbageHand.computeScore());
    }

    @Test
    void one_pair_one_combination_of_three_one_combinations_of_four() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.FIVE, '♥'),
                        new Card(Rank.NINE, '♦'),
                        new Card(Rank.ACE, '♠'),
                        new Card(Rank.SIX, '♣')
                ),
                new Card(Rank.THREE, '♠')
        );
        assertEquals(6, cribbageHand.computeScore());
    }

}
