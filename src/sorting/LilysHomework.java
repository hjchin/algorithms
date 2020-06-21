package sorting;

import java.util.Arrays;
import java.util.HashMap;

/*
Whenever George asks Lily to hang out, she's busy doing homework. George wants to help her finish it faster, but he's in over his head! Can you help George understand Lily's homework so she can hang out with him?

Consider an array of  distinct integers, . George can swap any two elements of the array any number of times. An array is beautiful if the sum of  among  is minimal.

Given the array , determine and return the minimum number of swaps that should be performed in order to make the array beautiful.
 */
public class LilysHomework {

    /*

       7 15 12 3
    3          x
    7  x
    12      x
    15   x

       7 15 12 3
    15    x
    7  x
    12       x
    3          x


        7 15 12 3
     7  x
    15    x
    12       x
    3           x


        3 4 2 5 1
      1         x
      2     x
      3 x
      4   x
      5       x


      swap 0: 3 4 2 5 1
            : 1 2 3 4 5 = 4 difference.
              5 4 3 2 1

      swap 0: 3 4 2 5 1
      swap 1: 3 4 5 2 1
      swap 2: 5 4 3 2 1


     */


    public static int run(int[] arr){
        int[] arr2 = new int[arr.length];
        int[] sorted = new int[arr.length];
        int[] reversed = new int[arr.length];
        HashMap<Integer, Integer> oriIndices = new HashMap<>();
        HashMap<Integer, Integer> oriIndices2 = new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            sorted[i] = arr[i];
            arr2[i] = arr[i];
            oriIndices.put(arr[i], i);
            oriIndices2.put(arr[i], i);
        }

        Arrays.sort(sorted);
        reverse(sorted, reversed);

        int swapCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != sorted[i]){
                int j = oriIndices.get(sorted[i]);
                swap(arr, i, j);
                oriIndices.put(arr[j],j);
                swapCount++;
            }
        }

        int swapCount2=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i] != reversed[i]){
                int j = oriIndices2.get(reversed[i]);
                swap(arr2, i, j);
                oriIndices2.put(arr2[j],j);
                swapCount2++;
            }
        }

        return swapCount<=swapCount2? swapCount: swapCount2;
    }

    public static void reverse(int[] ori, int[] reversed){
        for(int i=0,j=ori.length-1;i<ori.length;i++,j--){
            reversed[i] = ori[j];
        }
    }

    public static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /*
        size:3, int[] = 1,2,3
        size 4, int[] = 1,2,3,4

     */
    public static void reverse(int[] arr){
        int len = arr.length/2;
        for(int i=0,j=arr.length-1;i<len;i++,j--){
            swap(arr,i,j);
        }
    }

}
