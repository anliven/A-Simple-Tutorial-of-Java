package pers.anliven.learningjava.chapter06;

public class T01Single {

	public static void main(String[] args) {
		// 创建并初始化一维数组
		int day[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; //// 声明并初始化一维int数组
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "月有" + day[i] + "天 ; ");
		}

		String str[] = { "a", "b", "c", "d" }; // 初始化一维String数组
		// String str[] = new String[]{"a","b","c","d"}; //初始化一维String数组
		for (int i = 0; i < str.length; i++) {
			System.out.println("字符：" + str[i]);
		}
	}

}

/*
 * 数组是具有相同数据类型的一组数据的集合。 
 * 根据数组的维数可分为一维数组、二维数组等。
 * 
 * 一维数组的下标是从0开始。
 * 
 */