package sort;

import org.junit.Test;

public class HeapSort {
	// @Test
	public void testMain() {
		Integer arr[] = new Integer[] { 3, 1, 5, 7, 2, 4, 9, 6, 10 };
		heapSort(arr, arr.length);
	}

	private void heapAdjust(Integer H[], int s, int length) {
		// һ�ε����͹���һ�����������Ķ�
		int temp = H[s];
		int child = 2 * s + 1;
		while (child < length) {
			if (H[child] < H[child + 1] && child + 1 < length) {
				++child;
			}
			if (H[child] > H[s]) {
				H[s] = H[child];
				s = child;
				child = 2 * s + 1;
			} else {
				break;
			}
			H[s] = temp;
		}
		utils.Util.printArr(H);
	}

	public void heapSort(Integer H[], int length) {
		// ��ʼ����һ���������ϵĹ��̣��������ս��һ���ǵõ�һ�����ֵ
		// ���ҵõ�һ�����������Ķ�
		// i �ĳ�ʼֵ�����Ż�
		for (int i = length - 1; i >= 0; --i) {
			heapAdjust(H, i, length);
		}

		for (int i = length - 1; i > 0; --i) {
			int temp = H[i];
			H[i] = H[0];
			H[0] = temp;
			// ÿһ�ν����Ὣ�����Ķ��ƻ���
			// ���Ե���heapAdjust�����Զ�����0�����޸�
			heapAdjust(H, 0, i);
			// utils.Util.printArr(H);
		}
	}

}
