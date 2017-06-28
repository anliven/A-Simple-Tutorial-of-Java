package pers.anliven.learningjava.chapter05;

public class T03IndexOf {

	public static void main(String[] args) {
		// 获取字符串长度
		String str = "We are students";
		int size_1 = str.length(); // 获取字符串对象的长度
		System.out.println("字符串长度为：" + size_1);

		// 字符串查找
		int size_2 = str.indexOf("t");
		System.out.println("在字符串中首次出现的索引位置为：" + size_2);

		int size_3 = str.lastIndexOf("t");
		System.out.println("在字符串中最后一次出现的索引位置为：" + size_3);
	}

}

/*
 * length()方法 --- 获取已声明字符串对象的长度。字符串长度从0开始计数，包含字符串中的空格。
 *
 * indexOf()方法 --- 返回搜索的字符（字符串）首次出现的索引位置。 如果没有检索，该方法的返回值是-1。
 * 
 * lastIndexOf()方法 --- 返回返回搜索的字符（字符串）最后一次出现的索引位置。 如果没有检索，该方法的返回值是-1。
 * lastIndexOf("")返回的结果与length()方法相同。
 * 
 */