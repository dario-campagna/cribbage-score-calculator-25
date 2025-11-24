package sdm.running.example;

public class FifteenTwosRule implements CribbageRule {

    public long applyTo(CribbageHand cribbageHand) {
        long fifteenTwos = cribbageHand.numberOfFifteenTwos();
        if (fifteenTwos > 0) {
            return fifteenTwos * 2;
        }
        return 0;
    }
}