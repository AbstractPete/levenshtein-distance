package com.github.abstractpete;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bcmds on 22.09.2015.
 */
public class LevenshteinDistanceTest {

    @Test
    public void testLevenshtein() throws Exception {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        int levenshtein = levenshteinDistance.levenshtein("hydrostat", "uncontradictious");
        System.out.println(levenshtein);
        assert levenshtein == 13;
    }
}