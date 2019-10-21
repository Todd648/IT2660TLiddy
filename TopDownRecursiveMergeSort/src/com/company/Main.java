package com.company;

import java.util.Stack;
public class Main {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + "\n");
        System.out.println();
    }

    public static void main(String args[]) {
        {
            int[] arr = new int[100];
            for (int i = 0; i < 100; i++) {
                int myRandom = (int) (Math.random() * 1000 + 1);
                arr[i] = myRandom;
            }

            System.out.println("Given Array");
            printArray(arr);

            MergeSort ob = new MergeSort();
            ob.sort(arr, 0, arr.length - 1);

            System.out.println("\nSorted array");
            printArray(arr);
        }
    }
}