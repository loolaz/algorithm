package com;

import com.solutions.Permutation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("the first argument must be string");
        }
        Permutation solution = new Permutation();
        List<String> results = solution.getPermutations(args[0]);

        System.out.println(results);
    }
}
