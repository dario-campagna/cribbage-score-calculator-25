package sdm.running.example;

public class NobRule implements CribbageRule {
    public NobRule() {
    }

    public long applyTo(CribbageHand cribbageHand) {
        if (cribbageHand.hasIsNob()) {
            return 1;
        }
        return 0;
    }
}