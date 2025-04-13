package org.example;

import java.util.ArrayList;

public class FuzzyFinder {
    
    public int linearSearch(ArrayList<Feeling> feelings) {
        for (int i = 0; i < feelings.size(); i++) {
            if (feelings.get(i) instanceof Fuzzy && ((Fuzzy) feelings.get(i)).color.equals("gold")) {
                return i;
            }
        }
        
        return -1;
    }
    
    public int binarySearch(ArrayList<Feeling> feelings) {
        int left = 0;
        int right = feelings.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            Feeling midFeeling = feelings.get(mid);
            
            if (midFeeling instanceof Fuzzy && ((Fuzzy) midFeeling).color.equals("gold")) {
                return mid;
            }
            
            if (midFeeling.description().compareTo("gold") < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
    
    public int findPrickly(ArrayList<Feeling> feelings) {
        for (int i = 0; i < feelings.size(); i++) {
            if (feelings.get(i) instanceof Prickly) {
                return i;
            }
        }
        
        return -1;
    }
    
    public int binarySearchPrickly(ArrayList<Feeling> feelings) {
        int left = 0;
        int right = feelings.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            Feeling midFeeling = feelings.get(mid);
            
            if (midFeeling instanceof Prickly) {
                return mid;
            }
            
            if (midFeeling.description().compareTo("Pokey!") < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}