package com.solutions;

import java.util.*;

public class Permutation {

    private void depthFirstVisit(String visited, String str, List<String> permutations) {
        if (str.length() == 0) {
            permutations.add(visited);
            return;
        }
        for (int i = 0 ; i < str.length(); i ++) {
            visited += str.charAt(i);
            depthFirstVisit(visited, str.substring(0, i) + str.substring(i+1), permutations);
            visited = visited.substring(0, visited.length() - 1);

        }
    }

    public List<String> getPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        depthFirstVisit("", str, permutations);
        return permutations;
    }
}
