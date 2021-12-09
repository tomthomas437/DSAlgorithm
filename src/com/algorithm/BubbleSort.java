package com.algorithm;

public class BubbleSort {
	public static void main(String args[]) {
        BubbleSort sort = new BubbleSort();
        System.out.println("Before Sort : ");
        int array[] = { 70,44,68,43,78,31,98,27,84,32,96,2 };
        for (int i = 0; i < array.length; i++) {
            System.out.print("   "+array[i]);
        }
        sort.bubbleSort(array);
        System.out.println(" ");
        System.out.println("After Sort : ");
        sort.printArray(array);
    }
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + "  ");
        System.out.println();
    }
}
