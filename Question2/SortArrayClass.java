package Question2;

import java.util.*;

public class SortArrayClass {

    public static void sortByFrequency(int[] arr) {

        List<Integer> listOfSortedArray = new ArrayList<>();
        Map<Integer, Integer> mapOfFrequency = new HashMap<>();
        Map<Integer, Integer> mayOfIndex = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            mapOfFrequency.put(arr[i], mapOfFrequency.getOrDefault(arr[i], 0) + 1);
            mayOfIndex.putIfAbsent(arr[i], i);
        }

        for (int num : arr) {
            listOfSortedArray.add(num);
        }

        listOfSortedArray.sort((a, b) -> {
            int freqCompare = mapOfFrequency.get(b).compareTo(mapOfFrequency.get(a));
            if (freqCompare == 0) {
                return mayOfIndex.get(a) - mayOfIndex.get(b);
            }
            System.out.println(freqCompare);
            return freqCompare;
        });

        System.out.println(listOfSortedArray);
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 1, 9, 4, 12, 9, 7, 8, 12, 9, 4, 8, 8, 2, 3, 8};
        sortByFrequency(arr);
    }
}