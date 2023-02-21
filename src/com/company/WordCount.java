package com.company;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;


public final class WordCount {
    private WordCount() {

    }
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, Integer> createStringMap(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            map.put(str, 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            map.put(str, str.length());
        }
        return map;
    }

    public String wordAppend(String[] arr) {
        Map<String, Integer> count = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String str : arr) {
            int currCount = count.getOrDefault(str, 0);
            count.put(str, currCount + 1);
            if (currCount % 2 == 1) {
                result.append(str);
            }
        }

        return result.toString();
    }
    public Map<String, Boolean> wordMultiple(String[] arr) {
        Map<String, Integer> count = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();

        for (String str : arr) {
            int currCount = count.getOrDefault(str, 0);
            count.put(str, currCount + 1);
            result.put(str, currCount + 1 >= 2);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr1 = {"Hello"};
        Map<String, Integer> expected1 = new HashMap<>();
        expected1.put("Hello", 0);
        System.out.println(deepToString(arr1));


        String[] arr2 = {"Apple", "Banana", "Cherry", "Dates"};
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("Apple", 0);
        expected2.put("Banana", 0);
        expected2.put("Cherry", 0);
        expected2.put("Dates", 0);
        System.out.println("args = " + deepToString(arr2));
        }

}