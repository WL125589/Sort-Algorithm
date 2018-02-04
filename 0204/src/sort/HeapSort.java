package sort;

import org.junit.Test;

public class HeapSort {
	// @Test
	public void testMain() {
		Integer arr[] = new Integer[] { 3, 1, 5, 7, 2, 4, 9, 6, 10 };
		heapSort(arr, arr.length);
	}

	private void heapAdjust(Integer H[], int s, int length) {
		// 一次调整就构建一个满足条件的堆
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
		// 初始化是一个从下往上的过程，所以最终结果一定是得到一个最大值
		// 并且得到一个满足条件的堆
		// i 的初始值可以优化
		for (int i = length - 1; i >= 0; --i) {
			heapAdjust(H, i, length);
		}

		for (int i = length - 1; i > 0; --i) {
			int temp = H[i];
			H[i] = H[0];
			H[0] = temp;
			// 每一次交换会将构建的堆破坏掉
			// 所以调用heapAdjust将堆自顶向下0进行修复
			heapAdjust(H, 0, i);
			// utils.Util.printArr(H);
		}
	}

}
