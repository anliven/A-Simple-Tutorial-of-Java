package pers.anliven.learningjava.chapter06;

import java.util.Arrays;

public class T07BinarySearch {

	public static void main(String[] args) {

		// binarySearch方法在指定数组搜索元素，返回对应元素的索引值
		int arr[] = new int[] { 6, 33, 41, 13, 9, 1 };
		Arrays.sort(arr); // 数组排序
		int index1 = Arrays.binarySearch(arr, 13); // 寻找元素的索引位置
		System.out.println("索引位置是：" + index1);
		int index2 = Arrays.binarySearch(arr, 8); // 寻找元素的索引位置
		System.out.println("索引位置是：" + index2);

		// binarySearch方法在指定数组搜索元素，返回对应元素的索引值
		String str[] = new String[] { "ab", "cd", "ef", "xy" };
		Arrays.sort(str); // 数组排序
		int index = Arrays.binarySearch(str, 0, 2, "cd"); // 在指定范围寻找元素
		System.out.println("索引位置是：" + index);

	}

}

/*
 * 查找之前必须对数组进行排序，利用Arrays.sort()方法。 
 * 如果指定数组包含搜索元素，返回对应元素的索引值；否则返回“-1”或“-插入点”。
 * 插入点是搜索键将要插入数组的索引位置，即第一个大于此键的元素索引。
 *
 * 指定索引位置不能大于或等于数组的长度，否则会报错java.lang.ArrayIndexOutOfBoundsException。
 * 
 */