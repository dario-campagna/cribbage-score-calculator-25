package sdm.running.example;

public class CardParser {
    public Card parse(String cardAsText) {
        return new Card(cardAsText.charAt(0), cardAsText.charAt(1));
    }
}
