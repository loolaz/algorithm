package com.solutions;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Permutation permutation = new Permutation();

    @Test
    public void testBasicCase() {
        List<String> permutations = permutation.getPermutations("GOD");
        assertEquals(Arrays.asList("GOD", "GDO", "OGD", "ODG", "DGO", "DOG"), permutations);
    }

    @Test
    public void testEmptyString() {
        List<String> permutations = permutation.getPermutations("");
        assertEquals(Collections.singletonList(""), permutations);
    }

    @Test
    public void testDuplicatedCharacters() {
        // allow duplicated strings as the order of character matters in permutation
        List<String> permutations = permutation.getPermutations("GG");
        assertEquals(Arrays.asList("GG","GG"), permutations);
    }

    @Test
    public void testOneCharacter() {
        List<String> permutations = permutation.getPermutations("A");
        assertEquals(Collections.singletonList("A"), permutations);
    }
}