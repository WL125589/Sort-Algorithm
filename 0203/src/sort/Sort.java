package sort;

public class Sort {
	public static void main1(String[] args) {
		Integer a[] = new Integer[] { 3, 1, 5, 7, 2, 4, 9, 6, 10, 3, 12 };
		printArr(a);
		// insertSort(a, a.length);
		// shellSort(a, a.length);
		// bubbleSort(a, a.length);
		selectSort(a, a.length);
		// quickSort(a, 0, a.length - 1);
	}

	public static void insertSort(Integer a[], int n) {
		int target;
		int j;
		for (int i = 1; i < n; ++i) {
			j = i;
			target = a[i];
			while (j > 0 && target < a[j - 1]) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = target;
			printArr(a);
		}
	}

	public static void shellSort(Integer a[], int n) {
		int epoch = 2;
		while (epoch >= 1) {
			int target;
			int j;
			for (int i = epoch; i < n; ++i) {
				j = i;
				target = a[i];
				while (j > 0 && target < a[j - epoch]) {
					a[j] = a[j - epoch];
					j = j - epoch;
				}
				a[j] = target;
			}
			printArr(a);
			epoch /= 2;
		}
	}

	public static void bubbleSort(Integer a[], int n) {
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
			printArr(a);
		}
	}

	public static void selectSort(Integer[] a, int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (a[j] < a[i]) {
					// swap(a[i], a[j]);
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			printArr(a);
		}
	}

	public static void quickSort(Integer a[], int low, int high) {
		if (low < high) {
			int middle = getMiddle(a, low, high);
			quickSort(a, low, middle - 1);
			quickSort(a, middle + 1, high);
		}

	}

	private static int getMiddle(Integer a[], int low, int high) {
		// tmp的存在使得总有一个位置是空的
		int tmp = a[low];
		while (low < high) {
			while (low < high && tmp <= a[high]) {
				high--;
			}
			a[low] = a[high];
			while (low < high && tmp >= a[low]) {
				low++;
			}
			a[high] = a[low];
		}
		a[low] = tmp;
		printArr(a);
		return low;
	}

	private static void printArr(Integer[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	private static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

}
