package org.example;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FuzzyFinderTest {

    @Test
    public void testLinearSearchWithSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Feeling> sortedFeelings = generator.sortedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.linearSearch(sortedFeelings);
        
        assertTrue(index >= 0);
        assertTrue(sortedFeelings.get(index) instanceof Fuzzy);
        assertEquals("gold", ((Fuzzy) sortedFeelings.get(index)).color);
    }
    
    @Test
    public void testBinarySearchWithSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Feeling> sortedFeelings = generator.sortedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.binarySearch(sortedFeelings);
        
        assertTrue(index >= 0);
        assertTrue(sortedFeelings.get(index) instanceof Fuzzy);
        assertEquals("gold", ((Fuzzy) sortedFeelings.get(index)).color);
    }
    
    @Test
    public void testLinearSearchWithRandomizedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Feeling> randomFeelings = generator.randomizedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.linearSearch(randomFeelings);
        
        assertTrue(index >= 0);
        assertTrue(randomFeelings.get(index) instanceof Fuzzy);
        assertEquals("gold", ((Fuzzy) randomFeelings.get(index)).color);
    }
    
    @Test
    public void testBinarySearchWithRandomizedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Feeling> randomFeelings = generator.randomizedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.binarySearch(randomFeelings);
        
        if (index >= 0) {
            assertTrue(randomFeelings.get(index) instanceof Fuzzy);
            assertEquals("gold", ((Fuzzy) randomFeelings.get(index)).color);
        }
    }
    
    @Test
    public void testFindPrickly() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Feeling> feelings = generator.randomizedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.findPrickly(feelings);
        
        assertTrue(index >= 0);
        assertTrue(feelings.get(index) instanceof Prickly);
    }
    
    @Test
    public void testBinarySearchPrickly() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Feeling> sortedFeelings = generator.sortedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.binarySearchPrickly(sortedFeelings);
        
        assertTrue(index >= 0);
        assertTrue(sortedFeelings.get(index) instanceof Prickly);
    }
}