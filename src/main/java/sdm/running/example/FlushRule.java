package sdm.running.example;

public class FlushRule implements CribbageRule {
    
    public long applyTo(CribbageHand cribbageHand) {
        int points = 0;
        if (cribbageHand.allHandCardsHavaSameSuite()) {
            points += 4;
            if (cribbageHand.starterCardHasSameSuiteOfHandCards()) {
                points++;
            }
        }
        return points;
    }
}