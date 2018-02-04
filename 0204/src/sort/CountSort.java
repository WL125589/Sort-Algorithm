package sort;

import org.junit.Test;

/**
 * ¼ÆÊıÅÅĞò
 * 
 * @author wulei
 *
 */
public class CountSort {

	// @Test
	public void testMain() {
		Integer arr[] = new Integer[] { 5, 8, 9, 5, 4, 2, 5, 3 };
		countSort(arr);
	}

	private void countSort(Integer[] arr) {
		int[] backet = new int[10];
		for (int i = 0; i < arr.length; i++) {
			// int temp = arr[i]; // 5 8 9
			backet[arr[i]]++;
		}

		for (int i = 0; i < backet.length; i++) {
			for (int j = 0; j < backet[i]; j++) {
				if (backet[i] > 0)
					System.out.print(i + " ");
			}
		}

	}

}
