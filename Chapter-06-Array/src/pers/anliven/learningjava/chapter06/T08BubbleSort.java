package pers.anliven.learningjava.chapter06;

public class T08BubbleSort {

	public static void main(String[] args) {
		int[] array = { 8, 63, 4, 24, 1, 3, 15 };
		T08BubbleSort sorter = new T08BubbleSort();

		System.out.println("原数组内容：");
		sorter.showArray(array);
		sorter.sort(array); // 调用排序方法将数组排序
		System.out.println("冒泡排序后的数组内容：");
		sorter.showArray(array);
	}

	public void sort(int[] array) {
		// 冒泡排序
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public void showArray(int[] array) {
		// 显示数组所有元素
		for (int i : array) { // for-each语句遍历数组
			System.out.print(" ->" + i);
		}
		System.out.println();
	}

}
