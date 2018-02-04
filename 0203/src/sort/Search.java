package sort;

public class Search {
	public static void main2(String[] args) {
		Integer arr[] = new Integer[] { 1, 2, 3, 4, 5, 6 };
		System.out.println("length :" + arr.length);
		BinarySearch(arr, 4, 0, arr.length - 1);
	}

	public static void BinarySearch(Integer arr[], int num, int low, int high) {
		int middle = (high + low) / 2; // ����ճ�����������д����ż�� = ���� + ������
		System.out.println("low :" + low + " high: " + high + " middle: " + middle);
		if (arr[middle] == num || low >= middle) {
			System.out.println("position: " + middle);
			return;
		}
		if (arr[middle] > num)
			// ������ʽ��ճ�ż��
			// BSearch(arr, num, low, middle + 1);
			BinarySearch(arr, num, low, middle);
		else
			// ������ʽ�ճ�������
			BinarySearch(arr, num, middle + 1, high);
	}

}
