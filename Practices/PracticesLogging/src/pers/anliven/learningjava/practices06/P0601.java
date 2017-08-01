package pers.anliven.learningjava.practices06;

import java.util.Arrays;

public class P0601 {

	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 2, 3, 4, 5 };
		int arr2[] = Arrays.copyOf(arr1, 3);

		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i]);
		
		System.out.println();

		for (int j = 0; j < arr2.length; j++)
			System.out.print(arr2[j]);
	}

}

// 复制数组中指定索引位置的内容到新数组，并输出新数组所有元素。