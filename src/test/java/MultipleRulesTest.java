import org.junit.jupiter.api.Test;
import sdm.running.example.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleRulesTest {

    private ScoreCalculator scoreCalculator = new ScoreCalculator(Arrays.asList(
            new FlushRule(),
            new PairsRule(),
            new FifteenTwosRule(),
            new NobRule()
    ));
    
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
        assertEquals(6, scoreCalculator.computeScore(cribbageHand));
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
        assertEquals(6, scoreCalculator.computeScore(cribbageHand));
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
        assertEquals(29, scoreCalculator.computeScore(cribbageHand));
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
        assertEquals(4, scoreCalculator.computeScore(cribbageHand));
    }
}
