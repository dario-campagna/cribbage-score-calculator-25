import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;
import sdm.running.example.PairsRule;
import sdm.running.example.Rank;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairsTest {

    private PairsRule pairsRule = new PairsRule();

    @Test
    void two_points_for_one_pair() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.FIVE, '♥'),
                        new Card(Rank.FIVE, '♦'),
                        new Card(Rank.ACE, '♠'),
                        new Card(Rank.TWO, '♣')
                ),
                new Card(Rank.SIX, '♣')
        );
        assertEquals(2, pairsRule.applyTo(cribbageHand));
    }

    @Test
    void six_points_for_three_of_a_kind() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.ACE, '♥'),
                        new Card(Rank.ACE, '♦'),
                        new Card(Rank.ACE, '♠'),
                        new Card(Rank.TWO, '♣')
                ),
                new Card(Rank.SIX, '♣')
        );
        assertEquals(6, pairsRule.applyTo(cribbageHand));
    }

    @Test
    void twelve_points_for_four_of_a_kind() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.SIX, '♥'),
                        new Card(Rank.QUEEN, '♦'),
                        new Card(Rank.QUEEN, '♠'),
                        new Card(Rank.QUEEN, '♣')
                ),
                new Card(Rank.QUEEN, '♠')
        );
        assertEquals(12, pairsRule.applyTo(cribbageHand));
    }
}
