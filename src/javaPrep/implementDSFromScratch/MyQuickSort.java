package javaPrep.implementDSFromScratch;

public class MyQuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Partition the array
            quickSort(arr, low, pivotIndex - 1);        // Sort left part
            quickSort(arr, pivotIndex + 1, high);       // Sort right part
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choose the last element as pivot
        int i = low - 1;        // i will track the "less than pivot" area

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j); // move smaller element to correct position
            }
        }

        swap(arr, i + 1, high); // place pivot in the correct position
        return i + 1;           // return the pivot index
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Testing the implementation
    public static void main(String[] args) {
        int[] nums = { 9, 3, 7, 1, 6, 4, 2, 8 };
        quickSort(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}