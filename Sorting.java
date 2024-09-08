/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sorting;

import java.util.Scanner;

/**
 *
 * @author Shimi
 */
public class Sorting {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of elements = ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements = ");
        for (int x = 0; x < n; ++x) {
            array[x] = scanner.nextInt();
        }

        System.out.println("Bubble Sort = ");
        int[] bubble = array.clone();
        bubble (bubble);
        printArray(bubble);

        System.out.println("Selection Sort = ");
        int[] selection = array.clone();
        selection(selection);
        printArray(selection);

        System.out.println("Merge Sort = ");
        int[] mergeArr = array.clone();
        merge(mergeArr);
        printArray(mergeArr);
        
    }
    public static void merge(int[] array) {
        merge(array, 0, array.length - 1);
    }

    private static void merge(int[] array, int left , int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge(array, left, mid);
            merge(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int x = left, y = mid + 1, k = 0;

        while (x <= mid && y <= right) {
            temp[k++] = (arr[x] <= arr[y]) ? arr[x++] : arr[y++];
        }

        while (x <= mid) temp[k++] = arr[x++];
        while (y <= right) temp[k++] = arr[y++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }



    public static void bubble (int[] array) {
        int n = array.length;
        for 
                (int x = 0; x < n; ++x) 
        {
            for 
                    (int y = 0; y < n - x - 1; ++y)
            {
                if 
                        (array[y] > array[y + 1])
                {
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
    }

    public static void selection(int[] array) {
        int n = array.length;
        for 
                (int x = 0; x < n; x++)
        {
            int smol_ele = x;
            for 
                    (int y = x + 1; y < n; y++) 
            {
                if (array[y] < array[smol_ele]) 
                {
                    smol_ele = y;
                }
            }
            int temp = array[x];
            array[x] = array[smol_ele];
            array[smol_ele] = temp;
        }
    }
  
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    
}
