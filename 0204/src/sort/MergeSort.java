package sort;

import org.junit.Test;

public class MergeSort {

	// @Test
	public void testMain() {
		Integer arr[] = new Integer[] { 3, 1, 5, 7, 2, 4, 9, 6, 10, 0 };
		System.out.println(arr.length);
		Integer res[] = new Integer[arr.length];
		utils.Util.printArr(arr);
		mergeSort(arr, 0, arr.length - 1, res);
		// utils.Util.printArr(arr);
	}

	public void mergeSort(Integer arr[], int first, int last, Integer temp[]) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(arr, first, mid, temp);
			mergeSort(arr, mid + 1, last, temp);
			mergeArray(arr, first, mid, last, temp);
		}
	}

	// 这个first至关重要，保证了递归过程当中
	private void mergeArray(Integer arr[], int first, int mid, int last, Integer temp[]) {
		utils.Util.printArr(temp);
		int i = first, j = mid + 1;
		int end1 = mid, end2 = last;
		int k = 0;
		while (i <= end1 && j <= end2) {
			if (arr[i] < arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}

		if (i <= end1)
			temp[k++] = arr[i++];

		if (j <= end2)
			temp[k++] = arr[j++];

		for (i = 0; i < k; i++) {
			arr[first + i] = temp[i];
		}
		// utils.Util.printArr(temp);
		// utils.Util.printArr(arr);
	}

}
