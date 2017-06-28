package pers.anliven.learningjava.chapter06;

import java.util.Arrays;

public class T06CopyOf {

	public static void main(String[] args) {

		// cpoyOf()方法复制数组至指定长度
		int arr1[] = new int[] { 1, 2, 3 };
		int newarr1[] = Arrays.copyOf(arr1, 5); // 复制数组
		for (int i = 0; i < newarr1.length; i++) {
			System.out.println("数组newarr1中的第" + i + "个元素为：" + newarr1[i]);
		}

		String str1[] = new String[] { "a", "b", "c", "d" };
		String newstr1[] = Arrays.copyOf(str1, 6); // 复制数组
		for (int i = 0; i < newstr1.length; i++) {
			System.out.println("数组newstr1中的字符为：" + newstr1[i]);
		}

		// cpoyOfRange()方法复制数组的指定长度到一个新数组
		int arr2[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int newarr2[] = Arrays.copyOfRange(arr2, 3, 9); // 复制数组
		for (int i = 0; i < newarr2.length; i++) {
			System.out.println("数组newarr2中的第" + i + "个元素为：" + newarr2[i]);
		}

		String str2[] = new String[] { "a", "b", "c", "d", "e" };
		String newstr2[] = Arrays.copyOfRange(str2, 3, 9); // 复制数组
		for (int i = 0; i < newstr2.length; i++) {
			System.out.println("数组newstr2中的字符为：" + newstr2[i]);
		}

	}

}

/*
 * 如果新数组长度大于原数组长度，整型数组用0填充，char型数值用null填充。 
 * 开始索引formIndex必须在0至数组长度之间。
 * 如果结束索引toIndex大于数组长度，系统会根据复制数组类型来填充，整型数组用0填充，char型数值用null填充。
 * 
 */
