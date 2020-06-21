package implementation;

import java.util.Arrays;

/*
Lexicographical order is often known as alphabetical order when dealing with strings. A string is greater than another string if it comes later in a lexicographically sorted list.

Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:

It must be greater than the original word
It must be the smallest word that meets the first condition
For example, given the word , the next largest word is .

Complete the function biggerIsGreater below to create and return the new string meeting the criteria. If it is not possible, return no answer.

 */
public class BiggerIsGreater {

    public static String run(String w){
        char[] v = w.toCharArray();

        int i = v.length-1;
        while(i>1 && v[i-1]>=v[i]) i--;

        if(i<=0) return "no answer";

        boolean found = false;
        for(int j=v.length-1;j>i-1;j--){
            if(v[j]>v[i-1]){
                char t = v[j];
                v[j] = v[i-1];
                v[i-1] = t;
                found = true;
                break;
            }
        }

        if(!found) return "no answer";

        String temp = new String(v);
        char[] sort = temp.substring(i).toCharArray();
        Arrays.sort(sort);
        String sortString = new String(sort);
        String r = new String(v);
        return r.substring(0,i)+sortString;
    }
}
