package strings;

import java.util.*;

public class CommonChild {

    public static int run(String s1, String s2){

        int maxLength = 0;

        for(int i=0;i<s1.length();i++){
            ArrayList<Integer> substringIndex = new ArrayList<>();
            substringIndex.add(i);
            maxLength = Math.max(maxLength, findMaxChildLength(substringIndex, s1, s2, 0));
        }

        return maxLength;
    }

    public static String cc = "";

    public static int findMaxChildLength(List<Integer> indices, String s1, String s2, int maxLength){

        if(indices.size() == 0) return 0;

        if(isCommonChild(indices, s1, s2)){
            String child = getString(indices, s1);
            if(child.length()> cc.length()) {
                cc = child;
            }
            maxLength = Math.max(maxLength, indices.size());

            for(int i = indices.get(indices.size()-1)+1;i<s1.length();i++){
                ArrayList<Integer> a = copyArray(indices);
                a.add(i);
                int len = findMaxChildLength(a, s1, s2, maxLength);
                maxLength = Math.max(maxLength, len);
            }
        }

        return maxLength;
    }

    public static String getString(List<Integer> list, String s1){
        StringBuilder sb = new StringBuilder();
        for(int i: list){
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }

    public static ArrayList<Integer> copyArray(List<Integer> array){
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(Integer v: array){
            a.add(v);
        }
        return a;
    }

    public static boolean isCommonChild(List<Integer> substringIndex, String s1, String s2){

        if(substringIndex.size() == 0){
            return true;
        }

        int match = 0;
        int lastIndex = 0;
        for(int i : substringIndex){
            for(int j=lastIndex;j<s2.length();j++){
                if(compare(s1, i, s2, j)){
                    match++;
                    lastIndex = j+1;
                    break;
                }
            }
        }

        return match == substringIndex.size();
    }

    public static boolean compare(String s1, int i1, String s2, int i2){
        return s1.charAt(i1) == s2.charAt(i2);
    }
}
