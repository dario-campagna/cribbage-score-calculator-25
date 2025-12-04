import org.junit.jupiter.api.Test;
import sdm.running.example.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlushTest {

    private FlushRule flushRule = new FlushRule();
    
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
        assertEquals(1, new NobRule().applyTo(cribbageHand));
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
        assertEquals(0, flushRule.applyTo(cribbageHand));
    }

    @Test
    void four_points_for_hand_cards_of_same_suit() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.THREE, '♣'),
                        new Card(Rank.SEVEN, '♣'),
                        new Card(Rank.ACE, '♣'),
                        new Card(Rank.KING, '♣')
                ),
                new Card(Rank.JACK, '♦')
        );
        assertEquals(4, flushRule.applyTo(cribbageHand));
    }

    @Test
    void five_points_for_all_cards_of_same_suit() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card(Rank.THREE, '♣'),
                        new Card(Rank.SEVEN, '♣'),
                        new Card(Rank.ACE, '♣'),
                        new Card(Rank.KING, '♣')
                ),
                new Card(Rank.JACK, '♣')
        );
        assertEquals(5, flushRule.applyTo(cribbageHand));
    }
}
