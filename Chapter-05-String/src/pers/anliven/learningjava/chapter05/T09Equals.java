package pers.anliven.learningjava.chapter05;

public class T09Equals {

	public static void main(String[] args) {
		// 比较字符串
		String s1 = new String("abcdef");
		String s2 = new String("ABCDEF");
		String s3 = new String("abcdef");
		System.out.println("s1字符串为：" + s1 + "\n" + "s2字符串为：" + s2 + "\n" + "s3字符串为：" + s3 + "\n");

		boolean e1 = s1.equals(s2);
		boolean e2 = s1.equalsIgnoreCase(s2);
		boolean e3 = s1.equals(s3);
		boolean e4 = (s1 == s3);
		System.out.println("s1和s2，是否相等：" + e1);
		System.out.println("s1和s2忽略大小写后，是否相等：" + e2);
		System.out.println("s1和s3，是否相等：" + e3);
		System.out.println("s1和s3的内存地址是否相等：" + e4);

		System.out.println("\n");

		String str1 = "123abc"; // 声明字符串常量
		String str2 = "123abc"; // 声明字符串常量。这里str1和str2引用相同的字符串常量，因而具体相同的实体
		System.out.println("str1字符串为：" + str1 + "\n" + "str2字符串为：" + str2 + "\n");

		boolean e5 = str1.equals(str2);
		boolean e6 = (str1 == str2);
		System.out.println("str1和str2是否相等：" + e5);
		System.out.println("str1和str2的内存地址是否相等：" + e6);
	}

}

/*
 * 比较运算符“==”是针对字符串内存地址的比较，而不是内容的比较。 
 * equals()方法 --- 如果比较的两个字符串具有相同的字符和长度，则返回boolean类型结果true。 
 * equalsIgnoreCase()方法 --- 如果比较的两个字符串忽略大小写后，具有相同的字符和长度，则返回boolean类型结果true。
 * 
 * new运算符进行内存分配。
 * 
 */
