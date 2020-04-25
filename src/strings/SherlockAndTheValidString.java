package strings;

import java.util.*;

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
