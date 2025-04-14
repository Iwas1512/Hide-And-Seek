package org.example;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PricklyTest {

    @Test
    public void testFuzzyImplementsFeeling() {
        Fuzzy fuzzy = new Fuzzy("red");
        assertTrue(fuzzy instanceof Feeling);
        assertEquals("red", fuzzy.description());
    }
    
    @Test
    public void testPricklyImplementsFeeling() {
        Prickly prickly = new Prickly();
        assertTrue(prickly instanceof Feeling);
        assertEquals("Pokey!", prickly.description());
    }
    
    @Test
    public void testGeneratorIncludesPrickly() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Feeling> feelings = generator.randomizedRainbowFuzzies();
        
        boolean foundPrickly = false;
        for (Feeling feeling : feelings) {
            if (feeling instanceof Prickly) {
                foundPrickly = true;
                break;
            }
        }
        
        assertTrue(foundPrickly);
    }
    
    @Test
    public void testFindPrickly() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Feeling> feelings = generator.randomizedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.findPrickly(feelings);
        
        assertTrue(index >= 0);
        assertTrue(feelings.get(index) instanceof Prickly);
        assertEquals("Pokey!", feelings.get(index).description());
    }
    
    @Test
    public void testBinarySearchPrickly() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Feeling> feelings = generator.sortedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.binarySearchPrickly(feelings);
        
        if (index >= 0) {
            assertTrue(feelings.get(index) instanceof Prickly);
            assertEquals("Pokey!", feelings.get(index).description());
        }
    }
}