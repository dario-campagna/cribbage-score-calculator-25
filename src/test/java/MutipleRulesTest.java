import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;
import sdm.running.example.Rank;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MutipleRulesTest {

    @Test
    void four_card_of_the_same_suite_and_a_pair() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.THREE, '♣'),
                        new Card(Rank.SEVEN, '♣'),
                        new Card(Rank.ACE, '♣'),
                        new Card(Rank.KING, '♣')
                ),
                new Card(Rank.KING, '♦')
        );
        assertEquals(6, cribbageHand.computeScore());
    }

    @Test
    void on_Five_and_two_Queens() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.FIVE, '♥'),
                        new Card(Rank.QUEEN, '♦'),
                        new Card(Rank.QUEEN, '♠'),
                        new Card(Rank.SEVEN, '♣')
                ),
                new Card(Rank.SIX, '♠')
        );
        assertEquals(6, cribbageHand.computeScore());
    }

    @Test
    void fifteenTwos_pairs_and_one_for_his_nob() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.FIVE, '♥'),
                        new Card(Rank.FIVE, '♦'),
                        new Card(Rank.FIVE, '♠'),
                        new Card(Rank.JACK, '♣')
                ),
                new Card(Rank.FIVE, '♣')
        );
        assertEquals(29, cribbageHand.computeScore());
    }

    @Test
    void fifteenTwos_and_pairs() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.ACE, '♥'),
                        new Card(Rank.ACE, '♦'),
                        new Card(Rank.FOUR, '♠'),
                        new Card(Rank.THREE, '♣')
                ),
                new Card(Rank.SIX, '♣')
        );
        assertEquals(4, cribbageHand.computeScore());
    }
}
