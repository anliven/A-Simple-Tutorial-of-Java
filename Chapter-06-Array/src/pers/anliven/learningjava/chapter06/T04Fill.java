package pers.anliven.learningjava.chapter06;

import java.util.Arrays;

public class T04Fill {

	public static void main(String[] args) {
		// fill()方法填充替换数组元素
		int arr1[] = new int[3];
		Arrays.fill(arr1, 8); // 使用同一个数值填充
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1数组中的第" + i + "个元素为：" + arr1[i]);
		}

		int arr2[][] = new int[2][2]; // 声明二维数组
		for (int x = 0; x < arr2.length; x++) {
			Arrays.fill(arr2[x], 6); // 使用同一个数值填充
			for (int y = 0; y < arr2[x].length; y++) {
				System.out.println("arr2数组中第" + x + "行" + y + "列的元素为：" + arr2[x][y]);
			}
		}

		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		Arrays.fill(arr, 1, 2, 6); // 填充替换指定索引范围的值
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr数组中的第" + i + "个元素为：" + arr[i]);
		}

		String str[] = new String[] { "a", "b", "c", "d" }; // 初始化一维String数组
		Arrays.fill(str, 1, 2, "e"); // 填充替换指定索引范围的值
		for (int i = 0; i < str.length; i++) {
			System.out.println("str数组中的字符为：" + str[i]);
		}

	}
}

/*
 * 如果指定替换部分的开始索引fromIndex和结束索引toIndex一致，则填充范围为空。
 * 指定索引位置不能大于或等于数组的长度，否则会报错java.lang.ArrayIndexOutOfBoundsException。
 * 
 */
