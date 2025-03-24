package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class FuzzyFinderTest {

    @Test
    public void testLinearSearchWithSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.linearSearch(sortedFuzzies);
        
        assertTrue(index >= 0);
        assertEquals("gold", sortedFuzzies.get(index).color);
    }
    
    @Test
    public void testBinarySearchWithSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.binarySearch(sortedFuzzies);
        
        assertTrue(index >= 0);
        assertEquals("gold", sortedFuzzies.get(index).color);
    }
    
    @Test
    public void testLinearSearchWithRandomizedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.linearSearch(randomFuzzies);
        
        assertTrue(index >= 0);
        assertEquals("gold", randomFuzzies.get(index).color);
    }
    
    @Test
    public void testBinarySearchWithRandomizedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator(10);
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        FuzzyFinder finder = new FuzzyFinder();
        
        int index = finder.binarySearch(randomFuzzies);
        
        if (index >= 0) {
            assertEquals("gold", randomFuzzies.get(index).color);
        }
    }
}