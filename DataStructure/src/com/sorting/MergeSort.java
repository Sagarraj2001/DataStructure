package com.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 7, 6, 2, 4, 14, 8, 9, 15, 1, 11 };
		System.out.println("=========Before Sorting===========");
		System.out.println(Arrays.toString(arr));
		mergeSort(arr, 0, arr.length - 1);
		System.out.println();
		System.out.println("========After Sorting===========");
		System.out.println(Arrays.toString(arr));
	}

	static int[] mergeSort(int arr[], int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, h);
			merge(arr, l, h, m);
		}
		return arr;
	}

	static int[] merge(int arr[], int l, int h, int m) {
		int L[] = new int[m - l + 1];
		int R[] = new int[h - m];
		int x = l;
		for (int i = 0; i < L.length; i++) {
			L[i] = arr[x];
			x++;
		}
		for (int i = 0; i < R.length; i++) {
			R[i] = arr[x];
			x++;
		}
		int i = 0, j = 0, k = l;
		while (i < L.length && j < R.length) {
			if (L[i] < R[j]) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}

		}
		while (i < L.length) {
			arr[k++] = L[i++];
		}
		while (j < R.length) {
			arr[k++] = R[j++];
		}

		return arr;
	}

}
