package com.github.abstractpete;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by bcmds on 22.09.2015.
 */
public class LevenshteinDistance {
    // recursive
    int levenshtein(String v,String u){

        if(v.length() == 0)return  u.length();
        if (u.length() == 0) return v.length();

        //int cost = (v.charAt(v.length() - 1) == u.charAt(u.length() - 1)) ? 0 : 1;

        return Collections.min(
                Arrays.asList(
                    levenshtein(v.substring(0,v.length()-1),u) + 1,
                    levenshtein(v,u.substring(0,u.length()-1)) + 1,
                    levenshtein(v.substring(0,v.length() - 1),u.substring(0,u.length()-1)) + ((v.charAt(v.length() - 1) == u.charAt(u.length() - 1)) ? 0 : 1)
                ));
    }
}
