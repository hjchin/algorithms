package implementation;

import java.util.Arrays;

public class BiggerIsGreater {

    public static String run(String w){
        char[] v = w.toCharArray();
        if(v.length == 0 || v.length == 1){
            return "no answer";
        }

        boolean found = false;
        int ia = v.length - 1;
        int ib = ia - 1;
        for(; ia > 0; ia--){
            for(ib=ia-1;ib>-1;ib--){
                if(v[ia] > v[ib]){
                    char temp = v[ib];
                    v[ib] = v[ia];
                    v[ia] = temp;
                    found = true;
                    break;
                }
            }

            if(found) break;
        }

        if(!found) return "no answer";

        String temp = new String(v);
        char[] sort = temp.substring(ib+1).toCharArray();
        Arrays.sort(sort);
        String sortString = new String(sort);
        String r = new String(v);
        return r.substring(0,ib+1)+sortString;
    }
}
