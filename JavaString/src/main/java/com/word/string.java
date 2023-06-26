package com.word;

public class string {
    public String findWordWithMinUniqueChars(String inputString) {
        String[] words = inputString.split("\\s+");
        int minUniqueChars = Integer.MAX_VALUE;
        String minUniqueWord = "";

        for (String word : words) {
            int numUniqueChars = countUniqueChars(word);

            if (numUniqueChars < minUniqueChars) {
                minUniqueChars = numUniqueChars;
                minUniqueWord = word;
            }
        }

        return minUniqueWord;
    }

    private int countUniqueChars(String word) {
        int[] charCounts = new int[128];

        for (char c : word.toCharArray()) {
            charCounts[c]++;
        }

        int numUniqueChars = 0;
        for (int count : charCounts) {
            if (count > 0) {
                numUniqueChars++;
            }
        }

        return numUniqueChars;
    }
}

