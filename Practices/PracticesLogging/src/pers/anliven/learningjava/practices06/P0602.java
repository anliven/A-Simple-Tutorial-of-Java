package pers.anliven.learningjava.practices06;

import java.util.Arrays;

public class P0602 {

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 2, 3, 4, 5, 6, 7, 8, 9 };
		Arrays.sort(arr);
		System.out.println("最小的元素值：" + arr[0]);
		System.out.println("最大的元素值：" + arr[arr.length - 1]);
	}

}

// 输出数组中最小和最大的元素值。