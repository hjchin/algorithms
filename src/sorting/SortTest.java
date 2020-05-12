package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void testSelectionSort(){
        int[] arr = {3,4,6,8,0,9,2};
        Sort.selectionSort(arr);
        assertEquals(0,arr[0]);
        assertEquals(2,arr[1]);
        assertEquals(3,arr[2]);
        assertEquals(4,arr[3]);
        assertEquals(6,arr[4]);
        assertEquals(8,arr[5]);
        assertEquals(9,arr[6]);

        int[] arr2 = {0,2,3,4,6,8,9};
        Sort.selectionSort(arr2);
        assertEquals(0,arr2[0]);
        assertEquals(2,arr2[1]);
        assertEquals(3,arr2[2]);
        assertEquals(4,arr2[3]);
        assertEquals(6,arr2[4]);
        assertEquals(8,arr2[5]);
        assertEquals(9,arr2[6]);
    }

    @Test
    public void testInsertionSort(){
        int[] arr = {3,4,6,8,0,9,2};
        Sort.insertionSort(arr);
        assertEquals(0,arr[0]);
        assertEquals(2,arr[1]);
        assertEquals(3,arr[2]);
        assertEquals(4,arr[3]);
        assertEquals(6,arr[4]);
        assertEquals(8,arr[5]);
        assertEquals(9,arr[6]);

        int[] arr2 = {0,2,3,4,6,8,9};
        Sort.insertionSort(arr2);
        assertEquals(0,arr2[0]);
        assertEquals(2,arr2[1]);
        assertEquals(3,arr2[2]);
        assertEquals(4,arr2[3]);
        assertEquals(6,arr2[4]);
        assertEquals(8,arr2[5]);
        assertEquals(9,arr2[6]);
    }

    @Test
    public void testCountingSort(){
        int[] arr = {3,4,6,8,0,9,2};
        Sort.countingSort(arr);
        assertEquals(0,arr[0]);
        assertEquals(2,arr[1]);
        assertEquals(3,arr[2]);
        assertEquals(4,arr[3]);
        assertEquals(6,arr[4]);
        assertEquals(8,arr[5]);
        assertEquals(9,arr[6]);

        int[] arr2 = {0,2,3,4,6,8,9};
        Sort.countingSort(arr2);
        assertEquals(0,arr2[0]);
        assertEquals(2,arr2[1]);
        assertEquals(3,arr2[2]);
        assertEquals(4,arr2[3]);
        assertEquals(6,arr2[4]);
        assertEquals(8,arr2[5]);
        assertEquals(9,arr2[6]);
    }

    @Test
    public void testBubbleSort(){
        int[] arr = {3,4,6,8,0,9,2};
        Sort.bubbleSort(arr);
        assertEquals(0,arr[0]);
        assertEquals(2,arr[1]);
        assertEquals(3,arr[2]);
        assertEquals(4,arr[3]);
        assertEquals(6,arr[4]);
        assertEquals(8,arr[5]);
        assertEquals(9,arr[6]);

        int[] arr2 = {0,2,3,4,6,8,9};
        Sort.bubbleSort(arr2);
        assertEquals(0,arr2[0]);
        assertEquals(2,arr2[1]);
        assertEquals(3,arr2[2]);
        assertEquals(4,arr2[3]);
        assertEquals(6,arr2[4]);
        assertEquals(8,arr2[5]);
        assertEquals(9,arr2[6]);
    }

    @Test
    public void testMergeSort(){
        int[] arr = {3,4,6,8,0,9,2};
        int[] aux = new int[7];
        Sort.mergeSort(arr, aux,0,6);
        assertEquals(0,arr[0]);
        assertEquals(2,arr[1]);
        assertEquals(3,arr[2]);
        assertEquals(4,arr[3]);
        assertEquals(6,arr[4]);
        assertEquals(8,arr[5]);
        assertEquals(9,arr[6]);

        int[] arr2 = {0,2,3,4,6,8,9};
        Sort.mergeSort(arr2, aux, 0, 6);
        assertEquals(0,arr2[0]);
        assertEquals(2,arr2[1]);
        assertEquals(3,arr2[2]);
        assertEquals(4,arr2[3]);
        assertEquals(6,arr2[4]);
        assertEquals(8,arr2[5]);
        assertEquals(9,arr2[6]);
    }

    @Test
    public void testQuickSort(){
        int[] arr = {3,4,6,8,0,9,2};
        Sort.quicksort(arr, 0,6);
        assertEquals(0,arr[0]);
        assertEquals(2,arr[1]);
        assertEquals(3,arr[2]);
        assertEquals(4,arr[3]);
        assertEquals(6,arr[4]);
        assertEquals(8,arr[5]);
        assertEquals(9,arr[6]);

        int[] arr2 = {0,2,3,4,6,8,9};
        Sort.quicksort(arr2, 0, 6);
        assertEquals(0,arr2[0]);
        assertEquals(2,arr2[1]);
        assertEquals(3,arr2[2]);
        assertEquals(4,arr2[3]);
        assertEquals(6,arr2[4]);
        assertEquals(8,arr2[5]);
        assertEquals(9,arr2[6]);
    }

    @Test
    public void test3wayQuickSort(){
        int[] arr = {3,4,6,8,0,9,2};
        Sort.quicksort3way(arr, 0,6);
        assertEquals(0,arr[0]);
        assertEquals(2,arr[1]);
        assertEquals(3,arr[2]);
        assertEquals(4,arr[3]);
        assertEquals(6,arr[4]);
        assertEquals(8,arr[5]);
        assertEquals(9,arr[6]);

        int[] arr2 = {0,2,3,4,6,8,9};
        Sort.quicksort3way(arr2, 0, 6);
        assertEquals(0,arr2[0]);
        assertEquals(2,arr2[1]);
        assertEquals(3,arr2[2]);
        assertEquals(4,arr2[3]);
        assertEquals(6,arr2[4]);
        assertEquals(8,arr2[5]);
        assertEquals(9,arr2[6]);
    }
}