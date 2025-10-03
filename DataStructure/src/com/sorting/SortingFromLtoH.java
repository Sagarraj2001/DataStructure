package com.sorting;

import java.util.Arrays;

public class SortingFromLtoH {
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

	public static void main(String[] args) {
		int arr[] = { 7, 6, 2, 4, 14, 8, 9, 15, 1, 11 };
		System.out.println("=========Before Sorting===========");
		System.out.println(Arrays.toString(arr));
		merge(arr, 2, 7, 4);
		System.out.println();
		System.out.println("========After Sorting===========");
		System.out.println(Arrays.toString(arr));
	}

}
