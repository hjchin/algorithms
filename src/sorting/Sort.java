package sorting;

public class Sort {

    public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void countingSort(int[] arr){
        int[] counting = new int[10];
        for(int i=0;i<arr.length;i++){
            counting[arr[i]]++;
        }

        for(int i=0,j=0;i<counting.length;i++){
            while(counting[i]>0){
                arr[j++] = i;
                counting[i]--;
            }
        }
    }

    public static void bubbleSort(int[] arr){
        boolean sorted=false;
        do{
            sorted = true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    sorted=false;
                }
            }
        }while(!sorted);
    }

    public static void mergeSort(int[] arr, int[] aux, int lo, int hi){
        if(lo>=hi) return;

        int mid = lo+(hi-lo)/2;
        mergeSort(arr, aux, lo, mid);
        mergeSort(arr, aux, mid+1, hi);
        merge(arr, aux, lo, mid, hi);
    }

    public static void merge(int[] arr, int[] aux, int lo, int mid, int hi){
        for(int i=lo;i<=hi;i++){
            aux[i] = arr[i];
        }

        int l=lo;
        int r=mid+1;

        for(int i=lo;i<=hi;i++){
            if(l>mid){
                arr[i] = aux[r++];
            }else if(r>hi){
                arr[i] = aux[l++];
            }else if(aux[l]<=aux[r]){
                arr[i] = aux[l++];
            }else{
                arr[i] = aux[r++];
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
