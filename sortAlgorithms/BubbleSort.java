package org.spring.sortAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 32, 25, 12, 1};
        bubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
