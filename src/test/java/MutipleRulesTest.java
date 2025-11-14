import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CribbageHand;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MutipleRulesTest {

    @Test
    void four_card_of_the_same_suite_and_a_pair() {
        CribbageHand cribbageHand = new CribbageHand(
                Arrays.asList(
                        new Card('3', '♣'),
                        new Card('7', '♣'),
                        new Card('A', '♣'),
                        new Card('K', '♣')
                ),
                new Card('K', '♦')
        );
        assertEquals(6, cribbageHand.computeScore());
    }
    
}
