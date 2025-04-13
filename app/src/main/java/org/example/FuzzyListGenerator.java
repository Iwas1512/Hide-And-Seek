package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class FuzzyListGenerator {
    int iterations;

    public FuzzyListGenerator() {
        this.iterations = 1000;
    }

    public FuzzyListGenerator(int iterations) {
        this.iterations = iterations;
    }

    public ArrayList<Feeling> randomizedRainbowFuzzies() {
        ArrayList<Feeling> feelings = new ArrayList<>();
        for (int i = 0; i < this.iterations; i++) {
            feelings.add(new Fuzzy("red"));
            feelings.add(new Fuzzy("orange"));
            feelings.add(new Fuzzy("yellow"));
            feelings.add(new Fuzzy("green"));
            feelings.add(new Fuzzy("blue"));
            feelings.add(new Fuzzy("indigo"));
            feelings.add(new Fuzzy("violet"));
        }
        feelings.add(new Fuzzy("gold"));
        feelings.add(new Prickly());

        Collections.shuffle(feelings);
        return feelings;
    }

    public ArrayList<Feeling> sortedRainbowFuzzies() {
        ArrayList<Feeling> feelings = new ArrayList<>();
        for (int i = 0; i < this.iterations; i++) {
            feelings.add(new Fuzzy("red"));
            feelings.add(new Fuzzy("orange"));
            feelings.add(new Fuzzy("yellow"));
            feelings.add(new Fuzzy("green"));
            feelings.add(new Fuzzy("blue"));
            feelings.add(new Fuzzy("indigo"));
            feelings.add(new Fuzzy("violet"));
        }
        feelings.add(new Fuzzy("gold"));
        feelings.add(new Prickly());

        feelings.sort((f1, f2) -> f1.description().compareTo(f2.description()));
        return feelings;
    }
}