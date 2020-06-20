package strings;

import java.util.*;

public class CommonChild {

    /*
    A string is said to be a child of a another string if it can be formed by deleting 0 or more characters from the other string. Given two strings of equal length, what's the longest string that can be constructed such that it is a child of both?

    For example, ABCD and ABDC have two children with maximum length 3, ABC and ABD. They can be formed by eliminating either the D or C from both strings. Note that we will not consider ABCD as a common child because we can't rearrange characters and ABCD  ABDC.

     */
    public static int run(String s1, String s2){

        int[][] map = new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    map[i][j] = map[i-1][j-1] + 1;
                }else{
                    map[i][j] = Math.max(map[i][j-1], map[i-1][j]);
                }
            }
        }

        return map[s1.length()][s2.length()];
    }
}
