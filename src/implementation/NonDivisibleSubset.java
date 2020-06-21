package implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given a set of distinct integers, print the size of a maximal subset of  where the sum of any  numbers in  is not evenly divisible by .

For example, the array  and . One of the arrays that can be created is . Another is . After testing all permutations, the maximum length solution array has  elements.


 */
public class NonDivisibleSubset {


    public static int run(int k, List<Integer> s){

        final Map<Integer, Integer> remainders = new HashMap<>();
        for(int i = 0; i < s.size(); i++) {
            int remainder = s.get(i) % k;
            remainders.compute(remainder, (key, value) -> (value == null || key == 0) ? 1 : (value + 1));
        }

        for(Map.Entry<Integer, Integer> v : remainders.entrySet()){
            System.out.println(v.getKey()+" "+v.getValue());
        }

        int noOfElementsInSubset = remainders.getOrDefault(0, 0);

        int i = 1;
        for(; 2 * i < k; i++) {
            noOfElementsInSubset += Math.max(remainders.getOrDefault(i, 0), remainders.getOrDefault(k - i, 0));
        }

        if(2 * i == k) {
            noOfElementsInSubset++;
        }

        return noOfElementsInSubset;
    }

    /*

    1+7 = 8
    1+2 = 3
    1+3 = 4

    7+2 = 9
    7+3 = 10



     */
}
