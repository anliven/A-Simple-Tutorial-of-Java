package pers.anliven.learningjava.practices06;

import java.util.Arrays;

public class P0603 {

	public static void main(String[] args) {
		String arr[] = new String[] { "aa", "bb", "cc", "55" };
		System.out.println("替换前：");
		for (String str : arr) {
			System.out.print(str + "\t");
		}
		Arrays.fill(arr, 2, 3, "22");
		System.out.println("\n替换后：");
		for (String str2 : arr) {
			System.out.print(str2 + "\t");
		}
	}

}

// 将数组中索引位置为2的元素替换，并输出数组所有元素。