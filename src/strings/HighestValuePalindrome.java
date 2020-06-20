package strings;

import java.util.ArrayList;

/*
Palindromes are strings that read the same from the left or right, for example madam or 0110.

You will be given a string representation of a number and a maximum number of changes you can make. Alter the string, one digit at a time, to create the string representation of the largest number possible given the limit to the number of changes. The length of the string may not be altered, so you must consider 's left of all higher digits in your tests. For example  is valid,  is not.

Given a string representing the starting number and a maximum number of changes allowed, create the largest palindromic string of digits possible or the string -1 if it's impossible to create a palindrome under the contstraints.

 */
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
