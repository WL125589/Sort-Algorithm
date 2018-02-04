package sort;

public class Search {
	public static void main2(String[] args) {
		Integer arr[] = new Integer[] { 1, 2, 3, 4, 5, 6 };
		System.out.println("length :" + arr.length);
		BinarySearch(arr, 4, 0, arr.length - 1);
	}

	public static void BinarySearch(Integer arr[], int num, int low, int high) {
		int middle = (high + low) / 2; // 必须凑成奇数（必须写做：偶数 = 奇数 + 奇数）
		System.out.println("low :" + low + " high: " + high + " middle: " + middle);
		if (arr[middle] == num || low >= middle) {
			System.out.println("position: " + middle);
			return;
		}
		if (arr[middle] > num)
			// 这种形式会凑成偶数
			// BSearch(arr, num, low, middle + 1);
			BinarySearch(arr, num, low, middle);
		else
			// 这种形式凑成了奇数
			BinarySearch(arr, num, middle + 1, high);
	}

}
