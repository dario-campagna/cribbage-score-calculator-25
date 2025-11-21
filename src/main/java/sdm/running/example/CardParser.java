package sdm.running.example;

import java.util.HashMap;
import java.util.Map;

public class CardParser {

    private final Map<Character, Rank> rankByCharacter = new HashMap<>() {{
        put('A', Rank.ACE);
        put('2', Rank.TWO);
        put('3', Rank.THREE);
        put('4', Rank.FOUR);
        put('5', Rank.FIVE);
        put('6', Rank.SIX);
        put('7', Rank.SEVEN);
        put('8', Rank.EIGHT);
        put('9', Rank.NINE);
        put('0', Rank.TEN);
        put('J', Rank.JACK);
        put('Q', Rank.QUEEN);
        put('K', Rank.KING);
    }};
    
    public Card parse(String cardAsText) {
        return new Card(rankByCharacter.get(cardAsText.charAt(0)), cardAsText.charAt(1));
    }
}
