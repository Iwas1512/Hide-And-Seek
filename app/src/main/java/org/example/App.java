package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        
        ArrayList<Feeling> sortedFeelings = generator.sortedRainbowFuzzies();
        ArrayList<Feeling> randomFeelings = generator.randomizedRainbowFuzzies();
       
        int testOne = finder.linearSearch(sortedFeelings);
        int testTwo = finder.binarySearch(sortedFeelings);
        
        int testThree = finder.linearSearch(randomFeelings);
        int testFour = finder.binarySearch(randomFeelings);
    
        System.out.println("Linear search on sorted list found golden fuzzy at index: " + testOne);
        System.out.println("Binary search on sorted list found golden fuzzy at index: " + testTwo);
        System.out.println("Linear search on randomized list found golden fuzzy at index: " + testThree);
        System.out.println("Binary search on randomized list found golden fuzzy at index: " + testFour);
        
        // New functionality to find pricklies
        int pricklyOne = finder.findPrickly(sortedFeelings);
        int pricklyTwo = finder.findPrickly(randomFeelings);
        int pricklyThree = finder.binarySearchPrickly(sortedFeelings);
        
        System.out.println("\nPrickly search results:");
        System.out.println("Linear search on sorted list found prickly at index: " + pricklyOne);
        System.out.println("Linear search on randomized list found prickly at index: " + pricklyTwo);
        System.out.println("Binary search on sorted list found prickly at index: " + pricklyThree);
    }
}