package com.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 1, 6, 5, 2 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

}
