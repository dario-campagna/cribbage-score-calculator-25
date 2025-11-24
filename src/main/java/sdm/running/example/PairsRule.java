package sdm.running.example;

public class PairsRule implements CribbageRule {

    @Override
    public long applyTo(CribbageHand cribbageHand) {
        long pairs = cribbageHand.numberOfPairs();
        if (pairs > 0) {
            return pairs * 2;
        }
        return 0;
    }
}