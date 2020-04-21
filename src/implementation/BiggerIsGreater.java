package implementation;

import java.util.Arrays;

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
