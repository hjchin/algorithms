package strings;

import java.util.ArrayList;

public class HighestValuePalindrome {

    public static String run(String s, int n, int k){

        int h = s.length()/2;
        int diff = 0;
        char[] sArray = s.toCharArray();

        for(int i=0,j=n-1;i<h;i++,j--){
            if(sArray[i] != sArray[j]){
                diff++;
            }
        }

        if(diff > k) return "-1";

        for(int i=0,j=n-1;i<h && j>-1;i++,j--){
            if(sArray[i] == sArray[j]){
                if(k>1 && (k-2)>=diff){
                    if(sArray[i] != '9'){
                        sArray[i] = '9';
                        k--;
                    }

                    if(sArray[j] != '9'){
                        sArray[j] = '9';
                        k--;
                    }
                }
            }else{

                if(k> 1 && (k-2) >= diff-1){
                    if(sArray[i] != '9'){
                        sArray[i] = '9';
                        k--;
                    }

                    if(sArray[j] != '9'){
                        sArray[j] = '9';
                        k--;
                    }
                }else{
                    int v = Math.max(sArray[i],sArray[j]);
                    sArray[i] = (char)v;
                    sArray[j] = (char)v;
                    k--;
                }

                diff--;
            }
        }

        if(n%2!=0 && k>0){
            sArray[h] = '9';
        }

        String swap = new String(sArray);
        return isPalindrome(swap) ? swap :"-1";
    }

    public static boolean isPalindrome(String v){

        int half = v.length()/2;
        char[] sArray = v.toCharArray();
        for(int i=0,j=v.length()-1;i<half && j>-1;i++,j--){
            if(sArray[i] != sArray[j]){
                return false;
            }
        }

        return true;
    }
}
