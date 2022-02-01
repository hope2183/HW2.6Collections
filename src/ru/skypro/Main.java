package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList(List.of("good", "bad", "bad","beautiful", "beautifulll", "bad", "beautiful", "crazy cat"));

        printOddNumbers(nums);
        printEvenNumbersUniqueSorted(nums);
        printUniqueWords(words);
        printDuplicatesWordsNumber(words);
    }

    private static void printOddNumbers(List<Integer> nums) {
        System.out.print("ODD NUMBERS IN THE LIST: ");
        for (int num : nums) {
            if (num % 2 != 0)

                System.out.print(num + " ");

        }
    }

    private static void printEvenNumbersUniqueSorted(List<Integer> nums) {
        System.out.println();
        System.out.print("UNIQUE SORTED EVEN NUMBERS IN THE LIST: ");
        Set<Integer> UniqueSortedNums = null;
        UniqueSortedNums = new TreeSet<>(nums);
        for (int num : UniqueSortedNums) {
            if (num % 2 == 0)

                System.out.print(num + " ");
        }
    }

    private static void printUniqueWords(List<String> words) {
        System.out.println();
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("UNIQUE WORDS IN THE LIST: " + uniqueWords);
    }

    private static void printDuplicatesWordsNumber(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.print("DUPLICATES: ");
        System.out.print(words.size() - uniqueWords.size());
    }
}