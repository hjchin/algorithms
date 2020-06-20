package strings;

import java.util.*;

/*
Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just  character at  index in the string, and the remaining characters will occur the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO.

For example, if , it is a valid string because frequencies are . So is  because we can remove one  and have  of each character in the remaining string. If  however, the string is not valid as we can only remove  occurrence of . That would leave character frequencies of .

 */
public class SherlockAndTheValidString {

    public static String run(String s){

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            String c = String.valueOf(s.charAt(i));
            if(map.get(c) == null){
                map.put(c,1);
            }else{
                int count = map.get(c);
                map.put(c,++count);
            }
        }

        HashMap<Integer, Integer> freqCount = new HashMap<>();
        for(int freq : map.values()){
            freqCount.merge(freq, 1, Integer::sum);
        }

        if(freqCount.size() > 2) return "NO";

        if(freqCount.size() == 2){

            for(Map.Entry<Integer,Integer> entry: freqCount.entrySet()){
                if(entry.getKey() == 1 && entry.getValue() == 1){
                    return "YES";
                }
            }

            List<Integer> fList = new ArrayList<>(freqCount.keySet());
            List<Integer> fCountList = new ArrayList<>(freqCount.values());
            if(Math.abs(fList.get(0)-fList.get(1)) == 1 && (fCountList.get(0) == 1 || fCountList.get(1) == 1)) return "YES";

            return "NO";

        }

        return "YES";
    }
}
