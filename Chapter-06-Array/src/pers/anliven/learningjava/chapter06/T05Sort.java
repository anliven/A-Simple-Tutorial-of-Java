package pers.anliven.learningjava.chapter06;

import java.util.Arrays;

public class T05Sort {

	public static void main(String[] args) {
		// sort()方法对数组进行排序
		int arr[] = new int[] { 23, 36, 16, 8, 51 };
		Arrays.sort(arr); // 对数组进行排序
		for (int i = 0; i < arr.length; i++) {
			System.out.println("数组中的第" + i + "个元素为：" + arr[i]);
		}

		String str[] = new String[] { "C", "a", "6", "c", "E", "1" }; // 初始化一维String数组
		Arrays.sort(str); // 对数组进行排序
		for (int i = 0; i < str.length; i++) {
			System.out.println("数组中的字符为：" + str[i]);
		}
		
		System.out.println("输出数组中的元素：" + Arrays.toString(str));
	}

}

/*
 * java.util.Arrays类中包含了一些直接操作数组的方法
 * 排序：Arrays.sort(数组名)，完成对数组的排序（按升序排列）
 * 转换为字符串：Arrays.toString(数组名)，按顺序把多个数组元素连接在一起，多个元素之间使用逗号和空格隔开
 * 
 */
