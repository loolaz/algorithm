package com.solutions;

import java.util.*;

public class Permutation {

    private void depthFirstVisit(StringBuilder visited, String str, List<String> permutations) {
        if (str.length() == 0) {
            permutations.add(visited.toString());
            return;
        }
        for (int i = 0 ; i < str.length(); i ++) {
            visited.append(str.charAt(i));
            depthFirstVisit(visited, str.substring(0, i) + str.substring(i+1), permutations);
            visited.deleteCharAt(visited.length() - 1);
        }
    }

    public List<String> getPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        depthFirstVisit(new StringBuilder(""), str, permutations);
        return permutations;
    }
}
