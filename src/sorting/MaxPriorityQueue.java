package sorting;

public class MaxPriorityQueue {

    /*

    properties:
    1. uses an array as data structure to represent binary complete tree.
    2. first item starts at index 1.
    3. parent is not less than 2 children.
    4. parent index, k has children at 2k and 2k+1
     */


    /*
        tasks 1:
        2. heapsort
        3. sorting algorithms time complexity comparison.

     */

    private int N;
    private int[] arr;

    public MaxPriorityQueue(int size){
        arr = new int[size+1];
    }

    public void insert(int v){
        arr[++N] = v;
        swim(N);
    }

    private void swim(int i){
        while(i > 1 && arr[i] > arr[i/2]){
            swap(i,i/2);
            i/=2;
        }
    }

    private void sink(int j){
        while(j*2<=N){
            int k=j*2;
            if(k<N && arr[k]<arr[k+1]) k++;
            if(arr[k]>arr[j]){
                swap(k, j);
                j = k;
            }else{
                break;
            }
        }
    }

    public int deleteMax(){
        int v = arr[1];
        swap(1, N);
        arr[N] = 0;
        sink(1);
        N--;
        return v;
    }

    private void swap(int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
