package sdm.running.example;

import java.util.List;

public class ScoreCalculator {

    private final List<CribbageRule> rules;

    public ScoreCalculator(List<CribbageRule> rules) {
        this.rules = rules;
    }

    public long computeScore(CribbageHand cribbageHand) {
        return rules.stream().mapToLong(rule -> rule.applyTo(cribbageHand)).sum();
    }

}